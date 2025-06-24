import java.util.ArrayList;
import java.util.List;

// User class (Encapsulation and potential Inheritance)
public class User {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    //constructor
    public User(String name, int id){
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    //getter
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    //methods to interact with books
    public void borrowBook(Book book){
        book.borrow(this);
        if(book.isAvailable()){
            borrowedBooks.add(book);
        }
    }
    public void returnBook(Book book){
        book.returnItem(this);
        borrowedBooks.remove(book);
    }
}
