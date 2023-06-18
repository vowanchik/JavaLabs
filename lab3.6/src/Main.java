public class Main {
    public static void main(String[] args) {

        Leaf leaf = new Leaf("green");
        Tree tree = new Tree(leaf);

        tree.blossom();
        tree.fall();
        tree.coverWithHoarfrost();
        tree.turnYellow();

        System.out.println(tree);
    }
}