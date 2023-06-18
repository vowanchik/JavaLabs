public class Main {
    public static void main(String[] args) {

        Warship ship = new AircraftCarrier("USS Enterprise", 50);
        ship.sail();
        ship.dock();
        ship.fire();

        if (ship instanceof AircraftCarrier) {
            AircraftCarrier aircraftCarrier = (AircraftCarrier) ship;
            aircraftCarrier.launchAircraft();
        }
    }
}