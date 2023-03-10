//Вариант 2, задача 1 и 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of elements: ");
        int n = in.nextInt();
        int[] numberArray = new int[n];
        //инициализация массива
        for (int i = 0; i < n; i++){
            System.out.print("Input an element: ");
            int number = in.nextInt();
            numberArray[i] = number;
        }
        //поиск четных чисел
        System.out.print("Even numbers: ");
        for (int i = 0; i < n; i++){
            if (numberArray[i] % 2 == 0)
                System.out.print(numberArray[i] + " ");
        }
        System.out.println();
        //поиск нечетных чисел
        System.out.print("Odd numbers: ");
        for (int i = 0; i < n; i++){
            if (numberArray[i] % 2 != 0)
                System.out.print(numberArray[i] + " ");
        }
        //поиск максимального и минимального элементов
        int min = numberArray[0];
        int max = numberArray[0];
        for (int i = 1; i < n; i++){
            if (numberArray[i] < min)
                min = numberArray[i];
            if (numberArray[i] > max)
                max = numberArray[i];
        }
        System.out.print("Max element is " + max);
        System.out.print("Min element is " + min);
    }
}