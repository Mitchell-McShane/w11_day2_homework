import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book1;
    private Book book2;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book1 = new Book("The Da Vinci Code", "Dan Brown", "Thriller");
        book2 = new Book("Origin", "Dan Brown", "Crime");
        borrower = new Borrower("Mr Potter");
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
        assertEquals(3, library.getCapacity());
    }


}
