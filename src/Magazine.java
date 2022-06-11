public class Magazine extends Book {
 String advertisements;
 String topic;

 public Magazine(String book_title, String book_author, double book_issn, String advertisements, String topic){
  super(book_title, book_author, book_issn);
  this.advertisements = advertisements;
  this.topic= topic;
 }
 public Magazine(){}
}
