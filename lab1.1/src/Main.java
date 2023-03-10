//Вариант 1, задача 3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // задаю объект класса Scanner для консольного воода
        System.out.print("Input a number: ");
        int n = in.nextInt();//ввод с консоли
        String str = "Just a string"; // задал любую строку
        for(int i = 0; i < n; i++){
            System.out.print(str + ' '); //вывожу в цикле n раз без перевода на новую строку
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.println(str + ' ');// с переводом на новую строку
        }
    }
}