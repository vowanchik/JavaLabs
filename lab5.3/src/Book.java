import java.util.Arrays;
public class Book {
    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String binding;

    public Book(int id, String title, String[] authors, String publisher, int year, int pageCount, double price, String binding) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.binding = binding;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBinding() {
        return binding;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}
