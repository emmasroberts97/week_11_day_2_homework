import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library emmasLibrary;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        emmasLibrary = new Library();
        book1 = new Book("Jonathan Livingston Seagull", "Richard Bach", "fiction");
        book2 = new Book("Harry Potter", "JK Rowling", "fantasy");
        book3 = new Book("Twilight", "Stephanie Meyer", "fantasy");
    }

    @Test
    public void canGetCount(){
        assertEquals(0, emmasLibrary.countBooks());
    }

    @Test
    public void canAddBook(){
        emmasLibrary.addBook(book1);
        assertEquals(1, emmasLibrary.countBooks());
    }

    @Test
    public void cannotAddBookIfFull(){
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book1);
        assertEquals(10, emmasLibrary.countBooks());
    }

    @Test
    public void removeBook(){
        emmasLibrary.addBook(book2);
        emmasLibrary.addBook(book1);
        emmasLibrary.removeBook(book2);
        assertEquals(1, emmasLibrary.countBooks());
    }

    @Test
    public void canGetGenres(){
        emmasLibrary.addBook(book1);
        emmasLibrary.addBook(book2);
        emmasLibrary.addBook(book3);
        emmasLibrary.addGenres();
        assertEquals(2 , emmasLibrary.getGenres().size());
    }
}
