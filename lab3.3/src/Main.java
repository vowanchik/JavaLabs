public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book(1, "The Lord of the Rings", new String[]{"J.R.R. Tolkien"}, "HarperCollins", 1954, 1178, 25.99, "Hardcover"),
                new Book(2, "The Hobbit", new String[]{"J.R.R. Tolkien"}, "Houghton Mifflin Harcourt", 1937, 310, 12.99, "Paperback"),
                new Book(3, "Harry Potter and the Philosopher's Stone", new String[]{"J.K. Rowling"}, "Bloomsbury", 1997, 223, 9.99, "Paperback"),
                new Book(4, "Harry Potter and the Chamber of Secrets", new String[]{"J.K. Rowling"}, "Bloomsbury", 1998, 251, 10.99, "Paperback"),
                new Book(5, "Harry Potter and the Prisoner of Azkaban", new String[]{"J.K. Rowling"}, "Bloomsbury", 1999, 317, 11.99, "Paperback"),
                new Book(6, "The Da Vinci Code", new String[]{"Dan Brown"}, "Doubleday", 2003, 454, 12.99, "Paperback"),
                new Book(7, "Angels & Demons", new String[]{"Dan Brown"}, "Pocket Books", 2000, 736, 11.99, "Paperback"),
                new Book(8, "Digital Fortress", new String[]{"Dan Brown"}, "St. Martin's Press", 1998, 384, 10.99, "Paperback"),
                new Book(9, "The Lost Symbol", new String[]{"Dan Brown"}, "Doubleday", 2009, 672, 13.99, "Hardcover"),
                new Book(10, "Origin", new String[]{"Dan Brown"}, "Doubleday", 2017, 480, 14.99, "Hardcover")
        };

        BookArray bookArray = new BookArray(books);

        // список книг заданного автора
        System.out.println("Books by J.K. Rowling:");
        Book[] jkRowlingBooks = bookArray.getByAuthor("J.K. Rowling");
        for (Book book : jkRowlingBooks) {
            System.out.println(book);
        }
        // список книг, выпущенных заданным издательством
        System.out.println("Books published by Bloomsbury:");
        Book[] bloomsburyBooks = bookArray.getByPublisher("Bloomsbury");
        for (Book book : bloomsburyBooks) {
            System.out.println(book);
        }

        // список книг, выпущенных после заданного года
        System.out.println("Books published after 2000:");
        Book[] booksAfter2000 = bookArray.getAfterYear(2000);
        for (Book book : booksAfter2000) {
            System.out.println(book);
        }
    }
}

