import java.util.ArrayList;
public class BookArray {
    private Book[] books;

    public BookArray(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public Book[] getByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            for (String bookAuthor : book.getAuthors()) {
                if (bookAuthor.equals(author)) {
                    result.add(book);
                    break;
                }
            }
        }
        return result.toArray(new Book[result.size()]);
    }

    public Book[] getByPublisher(String publisher) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result.toArray(new Book[result.size()]);
    }

    public Book[] getAfterYear(int year) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book);
            }
        }
        return result.toArray(new Book[result.size()]);
    }
}
