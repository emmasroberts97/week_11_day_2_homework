import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Becoming", "Michelle Obama", "biography");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Becoming", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Michelle Obama", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("biography", book.getGenre());
    }

}
