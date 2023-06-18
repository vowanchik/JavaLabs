public class Main {
    public static void main(String[] args) {
        String poem = "Сжала руки под тёмной вуалью\n" +
                "Отчего ты сегодня бледна?\n" +
                "Оттого, что я терпкой печалью\n" +
                "Напоила его допьяна.";

        int count = countWordsWithVowel(poem);
        System.out.println("Количество слов, начинающихся и заканчивающихся гласной буквой: " + count);
    }

    public static int countWordsWithVowel(String poem) {
        String[] words = poem.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (startsWithVowel(word) && endsWithVowel(word)) {
                count++;
            }
        }

        return count;
    }

    public static boolean startsWithVowel(String word) {
        String firstChar = word.substring(0, 1).toLowerCase();
        return firstChar.matches("[аеёиоуыэюя]");
    }

    public static boolean endsWithVowel(String word) {
        String lastChar = word.substring(word.length() - 1).toLowerCase();
        return lastChar.matches("[аеёиоуыэюя]");
    }
}