import java.util.ArrayList;
import java.util.List;

public class Book extends Author{

    private String title = "n/a";

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublicate_freq() {
        return publicate_freq;
    }

    public void setPublicate_freq(String publicate_freq) {
        this.publicate_freq = publicate_freq;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    public double getIssn() {
        return issn;
    }

    public void setIssn(double issn) {
        this.issn = issn;
    }

    private String genre = "n/a";
    private String publicate_freq;
    private double isbn; // one-off publications rather than journals, newspapers, or other types of serials do not have ISBN's
    private double issn;



    public Book(String book_title, String book_author, double book_isbn) {
        this.title = book_title;
        this.isbn = book_isbn;
    }
    public Book() {}

    public Book(String book_title) {
        this.title = book_title;
    }

    public Book(String book_title, String book_author, String book_genre) {
        this.title = book_title;
        this.genre = book_genre;
    }

    public Book(String book_title, String book_author) {
        this.title = book_title;
    }
    public Book(String book_title, String book_author, String publication_freq, double book_issn) {
        this.title = book_title;
        this.issn = book_issn;
        this.publicate_freq = publication_freq;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public static List<Book> getListOfInitialBooks() {
            List<Book> books = new ArrayList<>();

            books.add(new Book("Harry Potter", "JK Rowling"));
            books.add(new Book("Think and Grow Rich", "Napoleon Hill", "Non-Fiction"));
            books.add(new Book("Start with Why"));
            books.add(new Book("Lord of the Flies"));
            books.add(new Book("The Midnight Library"));
            books.add(new Book("The Giver"));
            books.add(new Book("The Book Thief"));
            books.add(new Book("To Kill a Mockingbird"));
            books.add(new Book("Animal Farm"));
            books.add(new Book("Harry Potter", "JK Rowling"));
            books.add(new Book("Lord of the Flies"));
            books.add(new Book("Harry Potter", "JK Rowling"));
            books.add(new Book("To Kill a Mockingbird"));
            books.add(new Book("Harry Potter", "JK Rowling"));
            books.add(new Book("Wild Seed", "Octavia Butler", "Fiction"));
            books.add(new Book("BubbleBubble", "Octavia Butler", "Fiction"));

            return books;
        }


}
