import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    //constructor
    public Library(){
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
    }

    //methods to manage books and users
    public void addBook(Book book){
        books.add(book);
        System.out.println("Added: " + book.getTitle());

    }
    public void addUser(User user){
        users.add(user);
        System.out.println("Added new user" + user.getName());
    }

    public Book findBookByIsbn(String isbn){
        for (Book book: books){
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void displayBooks(){
        System.out.println("Library Books : ");
        for (Book book: books){
            System.out.println(book);
        }
    }


}
