import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book1) {
        this.books.add(book1);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }
}
