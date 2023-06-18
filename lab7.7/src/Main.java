public class Main {
    public static void main(String[] args) {
        String text = "Онн хоооддииит на боккккс";
        String transformedText = replaceRepeatedCharacters(text);
        System.out.println("Исходный текст: " + text);
        System.out.println("Преобразованный текст: " + transformedText);
    }

    public static String replaceRepeatedCharacters(String text) {
        return text.replaceAll("(.)\\1+", "$1");
    }
}