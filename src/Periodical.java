public class Periodical extends Book{
    public Periodical(String book_title, String book_author, String publication_freq, double book_issn, String topic) {
        super(book_title, book_author, publication_freq, book_issn);
        this.topic = topic;
    }

    String topic;
}
