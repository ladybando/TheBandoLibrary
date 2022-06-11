public class Atlas extends Book{
    public Atlas(String book_title, String book_author, double book_isbn, String geo_map, String top_map, String boundaries) {
        super(book_title, book_author, book_isbn);
        this.geo_map = geo_map;
        this.top_map = top_map;
        this.boundaries = boundaries;
    }

    String geo_map;
    String top_map;
    String boundaries;
}
