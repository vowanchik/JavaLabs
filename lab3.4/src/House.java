public class House {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int yearsOfExploitation;

    public House(int id, int apartmentNumber, double area, int floor, int numberOfRooms, String street, String buildingType, int yearsOfExploitation) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.yearsOfExploitation = yearsOfExploitation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setYearsOfExploitation(int yearsOfExploitation) {
        this.yearsOfExploitation = yearsOfExploitation;
    }

    public int getYearsOfExploitation() {
        return yearsOfExploitation;
    }

    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", yearsOfExploitation=" + yearsOfExploitation +
                '}';
    }
}
