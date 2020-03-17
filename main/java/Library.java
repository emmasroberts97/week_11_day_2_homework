import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> booksCollection;
    private int capacity;
    private HashMap<String, Integer> genres;

    public Library(){
        this.booksCollection = new ArrayList<Book>();
        this.capacity = 10;
        this.genres = new HashMap<String, Integer>();
    }

    public int countBooks(){
        return this.booksCollection.size();
    }

    public void addBook(Book book){
        if(this.booksCollection.size() < this.capacity) {
            this.booksCollection.add(book);
        }
    }

    public Book removeBook(Book book){
        int index = this.booksCollection.indexOf(book);
        return this.booksCollection.remove(index);
    }

    public void addGenres(){
        for(Book book : this.booksCollection){
            if(this.genres.keySet().contains(book.getGenre())){
                int count = this.genres.get(book.getGenre());
                int newCount = count + 1;
                this.genres.put(book.getGenre(), newCount);
            } else {
                this.genres.put(book.getGenre(), 1);
            }
        }
    }

    public HashMap<String, Integer> getGenres(){
        return this.genres;
    }
}
