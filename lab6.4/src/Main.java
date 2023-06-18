import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));
        points.add(new Point(1, 6));
        points.add(new Point(3, 8));
        points.add(new Point(5, 10));

        Map<String, Line> lineMap = new HashMap<>();

        // Перебираем все комбинации пар точек
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point point1 = points.get(i);
                Point point2 = points.get(j);

                // Рассчитываем угловой коэффициент и свободный член прямой
                double slope = (double) (point2.getY() - point1.getY()) / (point2.getX() - point1.getX());
                double intercept = point1.getY() - slope * point1.getX();

                // Создаем уникальный идентификатор прямой
                String lineId = slope + "_" + intercept;

                // Если прямая уже существует в HashMap, увеличиваем счетчик точек
                if (lineMap.containsKey(lineId)) {
                    Line line = lineMap.get(lineId);
                    line.incrementPointCount();
                } else {
                    // Создаем новую прямую и добавляем в HashMap
                    Line line = new Line(slope, intercept);
                    lineMap.put(lineId, line);
                }
            }
        }

        // Записываем описания прямых в файл
        try (FileWriter writer = new FileWriter("D:\\JavaLabs\\JavaLabs\\lab6.4\\src\\lines.txt")) {
            for (Line line : lineMap.values()) {
                writer.write(line.toString() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}