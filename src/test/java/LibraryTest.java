import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
        library.addToCollection(book);
        library.addToCollection(book);
        library.addToCollection(book);
        library.addToCollection(book);
    }

    @Test
    public void numberOfBooksInLibrary(){
        library.addToCollection(book);
        assertEquals(5, library.getBookCount());
    }

    @Test
    public void removeFromLibrary(){
        library.removeFromLibrary();
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void cantAddBookIfCapacityReached(){
        library.addToCollection(book);
        assertEquals(5, library.getBookCount());
    }


}
