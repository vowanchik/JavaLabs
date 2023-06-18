import java.util.Objects;
public class Bud {
    private String color;

    public Bud(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Getters and setters for color

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bud bud = (Bud) obj;
        return Objects.equals(color, bud.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Bud{" +
                "color='" + color + '\'' +
                '}';
    }
}