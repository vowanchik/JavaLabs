import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password = "ItIsPassword2023";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter password: ");
        String enteredPassword = in.nextLine();
        if (password.equals(enteredPassword))
            System.out.print("Password is correct!");
        else
            System.out.print("Password is not correct!");

    }
}