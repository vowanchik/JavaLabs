import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        int x1 = in.nextInt();
        System.out.print("Input n: ");
        int n1 = in.nextInt();
        int[] mas1 = new int[n1];
        for (int i = 0; i < n1; i++){
            System.out.print("Input a: ");
            int a = in.nextInt();
            mas1[i] = a;
        }
        ChainShot shot1 = new ChainShot(x1, n1, mas1);
        System.out.println("Value of shot1 is: " + shot1.calculatedShot);
        System.out.print("Input x: ");
        int x2 = in.nextInt();
        System.out.print("Input n: ");
        int n2 = in.nextInt();
        int[] mas2 = new int[n2];
        for (int i = 0; i < n2; i++){
            System.out.print("Input a: ");
            int a = in.nextInt();
            mas2[i] = a;
        }
        ChainShot shot2 = new ChainShot(x2, n2, mas2);
        System.out.println("Value of shot2 is: " + shot2.calculatedShot);
        System.out.println(shot1.addition(shot2));
    }
}