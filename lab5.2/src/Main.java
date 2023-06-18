import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String passwordPattern = "password"; // Строка-образец пароля

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Введите пароль: ");
            String password = reader.readLine();

            if (password.equals(passwordPattern)) {
                System.out.println("Пароль верный.");
            } else {
                System.out.println("Пароль неверный.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потока ввода: " + e.getMessage());
            }
        }
    }
}