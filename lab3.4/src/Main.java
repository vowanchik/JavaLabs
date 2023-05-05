public class Main {
    public static void main(String[] args) {
        House[] houses = new House[]{
                new House(1, 10, 70, 5, 2, "Pushkinskaya", "brick", 50),
                new House(2, 12, 80, 2, 3, "Lenina", "panel", 40),
                new House(3, 15, 90, 7, 3, "Kirova", "brick", 60),
                new House(4, 20, 60, 1, 2, "Sovetskaya", "panel", 35),
                new House(5, 25, 100, 8, 4, "Gagarina", "brick", 70)
        };

        HouseArray HouseArray = new HouseArray(houses);

        // список квартир, имеющих заданное число комнат
        System.out.println("Houses by number of rooms = 2:");
        House[] roomHouses = HouseArray.getByNumberOfRooms(2);
        for (House house : roomHouses) {
            System.out.println(house);
        }

        // список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке
        System.out.println("Houses by rooms number and floor range:");
        House[] roomAndFloorRangeHouses = HouseArray.getByNumberOfRoomsAndFloorRange(2, 5, 7);
        for (House house : roomAndFloorRangeHouses) {
            System.out.println(house);
        }

        // список квартир, имеющих площадь, превосходящую заданную
        System.out.println("Houses with area grater than 80:");
        House[] housesAreaGraterThan = HouseArray.getByAreaGreaterThan(80);
        for (House house : housesAreaGraterThan) {
            System.out.println(house);
        }
    }
}