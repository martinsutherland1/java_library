import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity) {
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;

    }

    public int getBookCount() {
        return this.bookCollection.size();
    }

    public void addToCollection(Book book) {
        if (getBookCount() < this.capacity) ;
        bookCollection.add(book);
    }

    public Book removeFromLibrary() {
        return this.bookCollection.remove(0);
    }



}