import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
       borrower = new Borrower();
       library = new Library();
       book = new Book("Harry Potter", "JK Rowling", "fantasy");

       library.addBook(book);
    }

    @Test
    public void canAddBook(){
        borrower.addBookToReadingList(library, book);
        assertEquals(1, borrower.countReadingList());
    }
}
