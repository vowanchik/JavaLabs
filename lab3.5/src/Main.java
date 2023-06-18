public class Main {
    public static void main(String[] args) {

        Bud bud = new Bud("Red");
        Petal petal = new Petal();

        Rose rose = new Rose();
        rose.setBud(bud);
        rose.setPetal(petal);

        rose.bloom();
        rose.printBudColor();
        rose.wither();

        System.out.println(rose);
    }
}