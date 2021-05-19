import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;
    private HashMap<String, Integer> bookGenres = new HashMap<String, Integer>();

    public Library(int capacity) {
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
        this.bookGenres = new HashMap<String, Integer>();

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

    public HashMap<String, Integer> findGenresHashMap(){

        ArrayList<String> genres = null;

       for (int i=0; i < getBookCount(); i++){
           genres.add(this.bookCollection.get(i).genre);
       }

       for (String genre : genres){

           if (!bookGenres.containsKey(genre)){
               bookGenres.put(genre, 1);

           } else{
               bookGenres.put(genre, bookGenres.get(genre) + 1);
           }
       }
    return bookGenres;

    }





}