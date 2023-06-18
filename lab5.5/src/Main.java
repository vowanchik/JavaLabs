import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Проверяем, переданы ли аргументы командной строки
        if (args.length < 2) {
            System.out.println("Usage: java Main <input_file> <output_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            int maxConsecutiveDigits = 0;

            // Читаем строки из входного файла
            while ((line = reader.readLine()) != null) {
                int consecutiveDigits = countConsecutiveDigits(line);
                maxConsecutiveDigits = Math.max(maxConsecutiveDigits, consecutiveDigits);
            }

            // Записываем результат в выходной файл
            FileWriter writer = new FileWriter(outputFile);
            writer.write(String.valueOf(maxConsecutiveDigits));
            writer.close();

            System.out.println("Max consecutive digits: " + maxConsecutiveDigits);
        } catch (IOException e) {
            System.out.println("Error reading input.txt file: " + e.getMessage());
        }
    }

    private static int countConsecutiveDigits(String line) {
        int maxConsecutiveDigits = 0;
        int currentConsecutiveDigits = 0;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                currentConsecutiveDigits++;
                maxConsecutiveDigits = Math.max(maxConsecutiveDigits, currentConsecutiveDigits);
            } else {
                currentConsecutiveDigits = 0;
            }
        }

        return maxConsecutiveDigits;
    }
}