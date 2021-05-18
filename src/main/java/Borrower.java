import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int getBookTotal() {
        return this.borrowedBooks.size();
    }

    public void addToBorrowed(Library library) {
         Book book = library.removeFromLibrary();
         this.borrowedBooks.add(book);
    }

    public void returnBook() {
        this.borrowedBooks.remove(0);
    }
}
