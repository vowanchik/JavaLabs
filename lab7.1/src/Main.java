public class Main {
    public static void main(String[] args) {
        String text = "Клара у Карла украла кораллы.";
        int k = 10; // Позиция, после которой будет вставлена подстрока
        String substring = "ВСТАВИЛ";

        String result = insertSubstring(text, k, substring);
        System.out.println(result);
    }

    public static String insertSubstring(String text, int k, String substring) {
        StringBuilder builder = new StringBuilder(text);

        if (k <= text.length()) {
            builder.insert(k, substring);
        } else {
            builder.append(substring);
        }

        return builder.toString();
    }
}