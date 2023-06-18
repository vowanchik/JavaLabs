import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String text = "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        ArrayList<String> words = extractWords(text);
        Collections.sort(words);
        System.out.println("Слова в алфавитном порядке:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> extractWords(String text) {
        String[] wordsArray = text.split("\\W+");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(wordsArray));
        return words;
    }
}