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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "id:" + id + "name: " + name + "authors: " + authors + "publisher: " + publisher + "year: " + year + "pages: " + pages + "cost: " + cost + "binding: " + binding;
    }
}
