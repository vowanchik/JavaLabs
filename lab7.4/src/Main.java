import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String text = "Олово поп рука гриб арфа олово поп";

        printWordsWithMatchingFirstAndLastLetter(text);
    }

    public static void printWordsWithMatchingFirstAndLastLetter(String text) {
        String[] words = text.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (word.length() > 1 && word.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
                uniqueWords.add(word.toLowerCase());
            }
        }

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}