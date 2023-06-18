public class Main {
    public static void main(String[] args) {
        String text = "У Лукоморья дуб зеленый, златая цепь на дубе том. И днем и ночью кот учены, все ходит по цепи кругом.";
        String result = swapFirstAndLastWords(text);
        System.out.println(result);
    }

    public static String swapFirstAndLastWords(String text) {
        String[] sentences = text.split("\\.");

        StringBuilder builder = new StringBuilder();
        for (String sentence : sentences) {
            String[] words = sentence.trim().split("\\s+");

            if (words.length > 1) {
                String firstWord = words[0];
                String lastWord = words[words.length - 1];

                words[0] = lastWord;
                words[words.length - 1] = firstWord;
            }

            String swappedSentence = String.join(" ", words);
            builder.append(swappedSentence).append(". ");
        }

        return builder.toString().trim();
    }
}