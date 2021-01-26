import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book1;
    private Library library;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book1 = new Book("The Da Vinci Code", "Dan Brown", "Thriller");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        assertEquals(1,library.getBookCount());
        library.removeBook(book);
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void checkCapacity(){
        assertEquals(2, library.getCapacity());
    }


}
