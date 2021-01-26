import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> countGenre;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.countGenre = new HashMap<>();
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

    public int getCapacity() {
        return this.capacity;
    }

    public void addBookGenreToCheck(){
        for(Book book : this.books){
            String key = book.getGenre();
            countGenre.putIfAbsent(key, 0);
            countGenre.put(key, countGenre.get(key)+1);
            System.out.println(countGenre);
        }
    }

}
