import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Проверяем, переданы ли аргументы командной строки
        if (args.length < 3) {
            System.out.println("Usage: java Main <input_file> <output_file> <word_list_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String wordListFile = args[2];

        try {
            List<String> wordList = readWordList(wordListFile);
            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            // Читаем строки из входного файла
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    countWordFrequency(line, wordList, wordFrequencyMap);
                }
            }

            // Сортируем слова по частоте повторяемости
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFrequencyMap.entrySet());
            sortedWords.sort(Map.Entry.comparingByValue());

            // Записываем результат в выходной файл
            FileWriter writer = new FileWriter(outputFile);
            for (Map.Entry<String, Integer> entry : sortedWords) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();

            System.out.println("Word frequencies written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static List<String> readWordList(String wordListFile) throws IOException {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(wordListFile))) {
            String word;
            while ((word = reader.readLine()) != null) {
                wordList.add(word.trim());
            }
        }
        return wordList;
    }

    private static void countWordFrequency(String line, List<String> wordList, Map<String, Integer> wordFrequencyMap) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (wordList.contains(word)) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
    }
}