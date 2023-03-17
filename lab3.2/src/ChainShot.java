public class ChainShot {
    public double calculatedShot;
    public ChainShot(int x, int n, int[] mas){
        calculatedShot = mas[n-1];
        for (int i = 0; i < n; i++){
            calculatedShot = x / calculatedShot;
            calculatedShot = calculatedShot + mas[n - i - 1];
        }
    }
    public double addition(ChainShot shot){
        return calculatedShot + shot.calculatedShot;
    }
    public double subtraction(ChainShot shot){
        return calculatedShot - shot.calculatedShot;
    }
    public double division(ChainShot shot){
        return calculatedShot / shot.calculatedShot;
    }
    public double multiplication(ChainShot shot){
        return calculatedShot * shot.calculatedShot;
    }
}
