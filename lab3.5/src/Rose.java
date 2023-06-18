import java.util.Objects;
public class Rose {
    private Petal petal;
    private Bud bud;

    public void bloom() {
        System.out.println("The rose is blooming.");
    }

    public void wither() {
        System.out.println("The rose is withering.");
    }

    public void printBudColor() {
        System.out.println("Bud color: " + bud.getColor());
    }
    public void setPetal(Petal petal) {
        this.petal = petal;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    // Getters and setters for petal and bud

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rose rose = (Rose) obj;
        return Objects.equals(petal, rose.petal) && Objects.equals(bud, rose.bud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petal, bud);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "petal=" + petal +
                ", bud=" + bud +
                '}';
    }
}