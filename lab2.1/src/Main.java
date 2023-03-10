//Вариант 1, задача 5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of words: ");
        int n = in.nextInt();
        in.nextLine();
        String vowels = "aeiouyAEIOUY";
        String odds = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";
        String alphabet = vowels + odds;
        boolean flagAlphabet = true;
        int k = 0;
        int l = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Input a word: ");
            String word = in.nextLine();
            if (word != null && !word.trim().isEmpty()){
                for (int j = 0; j < word.length(); j++) {
                    char symb = word.charAt(j);
                    if (alphabet.indexOf(symb) == -1)
                        flagAlphabet = false;
                }
                if (flagAlphabet) {
                    k++;
                    int vowelsNumber = 0;
                    int oddsNumber = 0;
                    for (int j = 0; j < word.length(); j++) {
                        char symb = word.charAt(j);
                        if (odds.indexOf(symb) != -1)
                            oddsNumber++;
                        else
                            vowelsNumber++;
                    }
                    if (vowelsNumber == oddsNumber)
                        l++;
                }
            }
            flagAlphabet = true;
        }
        System.out.println("The number of words consisting of letters of the Latin alphabet is " + k);
        System.out.print("The number of words with the same number of vowels and consonants is " + l);
    }
}