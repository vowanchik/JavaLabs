//Вариант 1, задача 6
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of words: ");
        int n = in.nextInt();
        in.nextLine();
        boolean flag = true;
        String[] stringArray = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Input a word: ");
            stringArray[i] = in.nextLine();
        }
        for (int i = 0; i < n; i++){
            if (stringArray[i] != null && !stringArray[i].trim().isEmpty()){
                for (int j = 0; j < stringArray[i].length() - 1; j++) {
                    char symb = stringArray[i].charAt(j);
                    char symb2 = stringArray[i].charAt(j + 1);
                    if (symb >= symb2)
                        flag = false;
                }
                if (flag) {
                    System.out.println("This word is " + stringArray[i]);
                    break;
                }
            }
            flag = true;
        }
        Date date1 = new Date();
        date1.getDate();
        System.out.println("Rozhnov");
        System.out.println("Задание выдано: 17.02.2023");
        System.out.println("Задание сдано: " + date1);
    }
}