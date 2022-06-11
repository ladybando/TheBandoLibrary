import java.util.*;

public class BandoLibrary {
    private final HashMap<String, Integer> catalog = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("""
                What would you like to do? Add a book, remove a book, see full catalog, or list by genre?
                Type 'add' to add a book

                Type 'remove' to remove a book

                Type 'full' to see the catalog

                Type 'genre' to list by genre
                """);
        BandoLibrary books = new BandoLibrary();
        Book newBook = new Book("Book", "Author");
        Map<String, Integer> catalog =  books.getCatalog();
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        {
            if (answer.equals("add")) {
                System.out.println("What is the book's title? ");
                answer = input.next();
                String bookTitle = catalog.keySet().toString();//access book title in catalog

                if (answer.contains(bookTitle))
                    newBook.setTitle(bookTitle);
                System.out.println("You have added " + bookTitle);
                books.addBook(newBook);
            } else if (answer.equals("remove")) {
                System.out.println("What book would you like to remove? ");
                answer = input.next();
                String bookTitle = catalog.keySet().toString();//returns keyset as string values not integer
                System.out.println(bookTitle);
                if (answer.contains(bookTitle)) {
                    System.out.println("You have removed " + bookTitle);
                    books.removeBook(newBook);
                }   else if (!answer.equals(bookTitle)) {
                    System.out.println("Please enter a title in the catalog. ");
                }
            } else if (answer.equals("genre")) {
                books.getGenreOfBooks(newBook.getGenre());
            } else if (answer.equals("full")) {
                books.printCatalog();
            }
        }
    }
    public Map<String, Integer> getCatalog() {
        List<Book> startingListOfBooks = Book.getListOfInitialBooks();
        // The books we have, the number of copies of each book we have.
        // Loop through my list of books, and add it to my map
        for (Book book : startingListOfBooks) {
            // See if the map already has this book
            boolean bookExists = catalog.containsKey(book.getTitle());
            if (bookExists) {
                // If it does, add one to the count
                int currentNumberOfCopies = catalog.get(book.getTitle());
                currentNumberOfCopies++;
                catalog.put(book.getTitle(), currentNumberOfCopies);
            } else {
                // If it doesn't, add it to the map
                catalog.put(book.getTitle(), 1);
            }
        }

        return catalog;
    }

    // TODO Create a method that takes in a new book and adds it to the catalog
    public void addBook(Book book) {
        Map<String, Integer> catalog = getCatalog();
        catalog.put(book.getTitle(), 1);
        catalog.put(book.getGenre(), 1);

    }

    // TODO Create a method that removes a book from the catalog
    public void removeBook(Book book) {
        Map<String, Integer> catalog = getCatalog();
        catalog.get(book.getTitle());
        catalog.remove(book.getGenre(), 1);
        catalog.remove(book.getTitle(), 1);
    }

    // TODO Create a method that given a catalog prints a list of all the books and the number of copies the library has
    // IE: "Harry Potter - 3, Think and Grow Rich - 1, Lord of the Flies - 2, ... "
    public void printCatalog() {
        Map<String, Integer> catalog = getCatalog();
        Set entrySet = catalog.entrySet();
        Iterator iterate = entrySet.iterator();

        while (iterate.hasNext()) {
            Map.Entry book = (Map.Entry)iterate.next();
            System.out.println("Title: " + book.getKey() + "\t\t\t" + "Quantity: " + book.getValue());
        }
    }

    // TODO Super challenge: How might we implement a method that lets us return all books of a certain genre?
    // For example, maybe we want all non-fiction books we have in the catalog

    public void getGenreOfBooks(String genre) {
        //TODO create new hashmap that has genre as key and title as value
                   /*System.out.print("Values: " + catalog.values());
                    System.out.print("Keys: " + catalog.keySet());
                    remove parameter to test*/

        for (int i = 0; i < catalog.size(); i++){
            if (catalog.containsKey(genre)){
                System.out.print(catalog.get(genre));
            }
        }
    }
}
