import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void before(){
        library = new Library(12);
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.getBookCount());
    }
}
