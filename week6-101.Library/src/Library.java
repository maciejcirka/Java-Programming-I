
import java.util.ArrayList;


public class Library {

    private ArrayList<Book> collection;

    public Library() {

        this.collection = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        collection.add(newBook);

    }

    public void printBooks() {

        for (Book book : collection) {
            System.out.println(book);
        }

    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book: collection) {
            if(StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book: collection) {
            if (book.publisher().contains(publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book: collection) {
            if (book.year()==year) {
                found.add(book);
            }
        }
        return found;
    }
    
    
    
    
}
