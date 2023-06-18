public class AircraftCarrier extends Warship {
    private int aircraftCount;

    public AircraftCarrier(String name, int aircraftCount) {
        super(name);
        this.aircraftCount = aircraftCount;
    }

    // Реализация метода fire(), специфичного для Авианосца
    @Override
    public void fire() {
        System.out.println(name + " is launching aircraft for an airstrike.");
    }

    // Дополнительный метод специфичный для Авианосца
    public void launchAircraft() {
        System.out.println(name + " is launching aircraft.");
    }
}