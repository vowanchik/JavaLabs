import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(8);

        int size = numbers.size();
        int positiveIndex = 0;

        for (int i = 0; i < size; i++) {
            if (numbers.get(i) < 0) {
                int negativeValue = numbers.remove(i);
                numbers.add(negativeValue);
                i--; // Чтобы корректно обработать новый элемент, замещающий удаленный элемент
                size--; // Размер списка уменьшается после удаления элемента
            } else {
                int positiveValue = numbers.remove(i);
                numbers.add(positiveIndex, positiveValue);
                positiveIndex++;
            }
        }

        // Выводим результат
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}