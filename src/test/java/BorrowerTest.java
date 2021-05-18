import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
        library = new Library(4);
        library.addToCollection(book);
        library.addToCollection(book);
        borrower.addToBorrowed(library);

    }

    @Test
    public void checkBookCount(){
        assertEquals(1, borrower.getBookTotal());
    }

    @Test
    public void borrowBookFromLibrary(){

        assertEquals(1, borrower.getBookTotal());
    }

   @Test
    public void returnBook(){
        borrower.returnBook();
        assertEquals(0, borrower.getBookTotal());
   }
}
