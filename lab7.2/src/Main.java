public class Main {
    public static void main(String[] args) {
        String text = "Я хочу кушать. Я хочу пить.";
        String targetSubstring = "хочу";
        String insertedWord = "ВСТАВИЛ";

        String result = insertWordAfterSubstring(text, targetSubstring, insertedWord);
        System.out.println(result);
    }

    public static String insertWordAfterSubstring(String text, String targetSubstring, String insertedWord) {
        StringBuilder builder = new StringBuilder();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.endsWith(targetSubstring)) {
                builder.append(word).append(" ").append(insertedWord).append(" ");
            } else {
                builder.append(word).append(" ");
            }
        }

        return builder.toString().trim();
    }
}