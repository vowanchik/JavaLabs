public class Main {
    public static void main(String[] args) {
        String sentence = "Вася ест булочку у подъезда и пьет сок.";
        String transformedSentence = transformSentence(sentence);
        System.out.println("Исходное предложение: " + sentence);
        System.out.println("Преобразованное предложение: " + transformedSentence);
    }

    public static String transformSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        int n = words.length;

        // Сохраняем последнее слово для использования в начале преобразованного предложения
        String lastWord = words[n - 1];

        // Сдвигаем каждое слово влево, начиная с последнего
        for (int i = n - 1; i > 0; i--) {
            words[i] = words[i - 1];
        }

        // Помещаем последнее слово на место первого
        words[0] = lastWord;

        return String.join(" ", words);
    }
}