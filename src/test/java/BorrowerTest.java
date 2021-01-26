import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;
    private Library library;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Origin", "Dan Brown", "Crime");
        borrower = new Borrower("Mr Potter");
    }

    @Test
    public void borrowerStartsEmpty(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.getBookCount());
    }


}
