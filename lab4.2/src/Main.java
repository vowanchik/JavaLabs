public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop("MyShop", 3);
        shop.addDepartment(0, "Electronics", 100);
        shop.addDepartment(1, "Clothing", 200);
        shop.addDepartment(2, "Home Appliances", 150);
        shop.displayDepartments();
    }
}