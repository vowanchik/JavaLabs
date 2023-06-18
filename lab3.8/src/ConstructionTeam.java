import java.util.ArrayList;
import java.util.List;
class ConstructionTeam {
    private List<Constructor> constructors;

    public ConstructionTeam() {
        constructors = new ArrayList<>();
    }

    public void addConstructor(Constructor constructor) {
        constructors.add(constructor);
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }
}