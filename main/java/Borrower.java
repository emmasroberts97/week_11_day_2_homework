import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> readingList;

    public Borrower(){
        this.readingList = new ArrayList<Book>();
    }

    public void addBookToReadingList(Library library, Book book){
        this.readingList.add(library.removeBook(book));
    }

    public int countReadingList(){
        return this.readingList.size();
    }
}
