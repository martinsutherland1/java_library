import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Murder on the Orient Express", "Agatha Christie", "Thriller");
        library.addToCollection(book2);
        library.addToCollection(book2);
        library.addToCollection(book);
        library.addToCollection(book);
        library.addToCollection(book);
    }

    @Test
    public void numberOfBooksInLibrary(){
        library.addToCollection(book);
        assertEquals(6, library.getBookCount());
    }

    @Test
    public void removeFromLibrary(){
        library.removeFromLibrary();
        assertEquals(4, library.getBookCount());
    }

    @Test
    public void cantAddBookIfCapacityReached(){
        library.addToCollection(book);
        assertEquals(6, library.getBookCount());
    }

    @Test
    public void getGenreCount(){
        assertEquals("{Fantasy=3, Thriller=2}", library.findGenresHashMap());

    }


}
