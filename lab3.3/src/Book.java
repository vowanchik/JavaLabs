<<<<<<< HEAD
public class Book {
    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int year;
    private int pages;
    private int cost;
    private String binding;
    public Book (int id, String name, String authors, String publisher){

    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getAuthors() {
        return authors;
    }

    public String getBinding() {
        return binding;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

=======
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

>>>>>>> 96ca936bc71ccc6263dfc513e9595aecc7c8afab
    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
=======
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
>>>>>>> 96ca936bc71ccc6263dfc513e9595aecc7c8afab
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

<<<<<<< HEAD
    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "id:" + id + "name: " + name + "authors: " + authors + "publisher: " + publisher + "year: " + year + "pages: " + pages + "cost: " + cost + "binding: " + binding;
=======
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
>>>>>>> 96ca936bc71ccc6263dfc513e9595aecc7c8afab
    }
}
