import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("apple", "banana", "avocado", "blueberry");

        String firstElement = collection.stream()
                .findFirst()
                .orElse(null);

        boolean allMatch = collection.stream()
                .allMatch(element -> element.matches("^[a-z]+$"));

        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Все элементы совпадают с шаблоном: " + allMatch);
    }
}