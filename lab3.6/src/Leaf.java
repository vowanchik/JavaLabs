import java.util.Objects;
class Leaf {
    private String color;

    public Leaf(String color) {
        this.color = color;
    }

    public void blossom() {
        // Логика для зацветания листа
    }

    public void fall() {
        // Логика для опадания листа
    }

    public void coverWithHoarfrost() {
        // Логика для покрытия листа инеем
    }

    public void turnYellow() {
        // Логика для пожелтения листа
    }

    // Переопределение методов equals(), hashCode() и toString()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(color, leaf.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                '}';
    }
}
