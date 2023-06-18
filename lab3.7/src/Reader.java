import java.util.ArrayList;
import java.util.List;
class Reader {
    private int id;
    private String name;
    private List<Book> orders;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        orders = new ArrayList<>();
    }

    public void placeOrder(Book book) {
        orders.add(book);
    }

    public List<Book> getOrders() {
        return orders;
    }
    // Методы для получения книг на абонемент и в читальный зал

    // Методы для обработки черного списка

    // Геттеры и сеттеры для полей класса
}

