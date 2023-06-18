public class LibrarySystem {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addBook(new Book(1, "Book 1", "Author 1"));
        catalog.addBook(new Book(2, "Book 2", "Author 2"));
        catalog.addBook(new Book(3, "Book 3", "Author 3"));

        Reader reader = new Reader(1, "John Doe");
        reader.placeOrder(catalog.searchBooks("Book 1").get(0));

        Librarian librarian = new Librarian();
        librarian.issueBookOnLoan(reader.getOrders().get(0), reader);

        Administrator administrator = new Administrator();
        administrator.addToBlacklist(reader);
    }
}
