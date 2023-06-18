import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("banana", "apple", "orange", "apple", "banana", "grape");

        List<String> sortedUniqueValues = collection.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println("Отсортированные уникальные значения: " + sortedUniqueValues);
    }
}