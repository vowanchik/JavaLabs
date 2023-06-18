import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        int n = 5; // Количество строк для вывода
        String outputFilePath = "output.txt"; // Путь к файлу вывода

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (int i = 0; i < n; i++) {
                String line = "Строка " + (i + 1);

                // Вывод строки с переходом на новую строку
                writer.write(line);
                writer.newLine();
                // Вывод строки без перехода на новую строку
                writer.write(line);
            }
            System.out.println("Вывод успешно завершен.");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Возникла ошибка: " + e.getMessage());
        }
    }
}