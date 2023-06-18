import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> c1 = new ArrayList<>();
        List<Integer> c2 = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\JavaLabs\\JavaLabs\\lab6.3\\src\\file.txt"))) {
            String line;
            boolean isFirstSet = true;

            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);

                if (number < 0) {
                    isFirstSet = false;
                } else if (isFirstSet) {
                    c1.add(number);
                } else {
                    c2.add(number);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        Collections.sort(c1);
        Collections.sort(c2);

        List<Integer> combinedList = new ArrayList<>(c1);
        combinedList.addAll(c2);
        Collections.sort(combinedList);

        // Выводим объединенный и упорядоченный список
        for (int number : combinedList) {
            System.out.println(number);
        }
    }
}