import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Lord of the Rings", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("J.R.R. Tolkien", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }
}
