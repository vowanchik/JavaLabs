import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> collection = Arrays.asList("A", "B", "C", "D", "E");

        String lastElement = collection.stream()
                .reduce((first, second) -> second)
                .orElse(null);

        String thirdElement = collection.stream()
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println("Последний элемент: " + lastElement);
        System.out.println("Третий элемент: " + thirdElement);
    }
}