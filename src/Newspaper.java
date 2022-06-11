public class Newspaper extends Book{
    public Newspaper(String book_title, String book_author, String publication_freq, double book_issn, String current_events) {
        super(book_title, book_author, publication_freq, book_issn);
        this.current_events = current_events;
    }

    String current_events;
}
