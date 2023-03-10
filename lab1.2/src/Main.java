//Вариант 1, задача 4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password = "ItIsPassword2023"; //задаю пароль
        Scanner in = new Scanner(System.in);
        System.out.print("Enter password: "); //ввод пароля с консоли
        String enteredPassword = in.nextLine();
        if (password.equals(enteredPassword)) //проверка на совпадение паролей
            System.out.print("Password is correct!");
        else
            System.out.print("Password is not correct!");

    }
}