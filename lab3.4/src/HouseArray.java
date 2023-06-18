import java.util.ArrayList;
import java.util.Arrays;

public class HouseArray {
    private House[] houses;

    public HouseArray(House[] houses) {
        this.houses = houses;
    }

    public House[] getByNumberOfRooms(int numberOfRooms) {
        ArrayList<House> filteredHouses = new ArrayList<>();

        for (House house : houses) {
            if (house.getNumberOfRooms() == numberOfRooms) {
                filteredHouses.add(house);
            }
        }

        return filteredHouses.toArray(new House[0]);
    }

    public House[] getByNumberOfRoomsAndFloorRange(int numberOfRooms, int startFloor, int endFloor) {
        ArrayList<House> filteredHouses = new ArrayList<>();

        for (House house : houses) {
            if (house.getNumberOfRooms() == numberOfRooms && house.getFloor() >= startFloor && house.getFloor() <= endFloor) {
                filteredHouses.add(house);
            }
        }

        return filteredHouses.toArray(new House[0]);
    }

    public House[] getByAreaGreaterThan(double area) {
        ArrayList<House> filteredHouses = new ArrayList<>();

        for (House house : houses) {
            if (house.getArea() > area) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses.toArray(new House[0]);
    }
}
