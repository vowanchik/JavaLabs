import java.util.Scanner;

public class Main {
    public static void square(int n, Matrix[] mas){
        for (int i = 0; i < mas[n].rowNum; i++){
            for (int j = 0; j < mas[n].colNum; j++){
                mas[n].matrix[i][j] *= mas[n].matrix[i][j];
            }
        }
    }
    public static void replace(int k, Matrix matrix){
        int maxRow = matrix.matrix[0][k];
        int minRow = matrix.matrix[0][k];
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < matrix.rowNum; i++){
            if (matrix.matrix[i][k] > maxRow){
                maxRow = matrix.matrix[i][k];
                maxI = i;
            }
            if (matrix.matrix[i][k] < minRow){
                minRow = matrix.matrix[i][k];
                minI = i;
            }
        }
        for (int j = 0; j < matrix.colNum; j++) {
            int temp = matrix.matrix[maxI][j];
            matrix.matrix[maxI][j] = matrix.matrix[minI][j];
            matrix.matrix[minI][j] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of objects: ");
        int n = in.nextInt();
        Matrix[] matrixMas = new Matrix[n];
        for(int i = 0; i < n; i++){
            System.out.print("Input a number of rows: ");
            int rows = in.nextInt();
            System.out.print("Input a number of columns: ");
            int columns = in.nextInt();
            matrixMas[i] = new Matrix(columns, rows);
            System.out.println(i + 1 + " matrix is: ");
            matrixMas[i].output();
        }
        square(0, matrixMas);
        System.out.println("Squared matrix: ");
        matrixMas[0].output();

        replace(1, matrixMas[1]);
        System.out.println("Replaced matrix: ");
        matrixMas[1].output();
    }
}