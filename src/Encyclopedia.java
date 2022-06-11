public class Encyclopedia extends Book{
    public Encyclopedia(String book_title, String book_author, double book_isbn, String facts) {
        super(book_title, book_author, book_isbn);
        this.facts = facts;
    }

    String facts;
}
