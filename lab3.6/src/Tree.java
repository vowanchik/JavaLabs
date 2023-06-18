import java.util.Objects;
class Tree {
    private Leaf leaf;

    public Tree(Leaf leaf) {
        this.leaf = leaf;
    }

    public void blossom() {
        leaf.blossom();
    }

    public void fall() {
        leaf.fall();
    }

    public void coverWithHoarfrost() {
        leaf.coverWithHoarfrost();
    }

    public void turnYellow() {
        leaf.turnYellow();
    }

    // Переопределение методов equals(), hashCode() и toString()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(leaf, tree.leaf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaf);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaf=" + leaf +
                '}';
    }
}
