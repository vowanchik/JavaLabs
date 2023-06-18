public abstract class Warship implements Ship {
    protected String name;

    public Warship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Реализация метода sail() из интерфейса Корабль
    @Override
    public void sail() {
        System.out.println(name + " is sailing.");
    }

    // Реализация метода dock() из интерфейса Корабль
    @Override
    public void dock() {
        System.out.println(name + " is docking.");
    }

    // Абстрактный метод, специфичный для Военного Корабля
    public abstract void fire();
}
