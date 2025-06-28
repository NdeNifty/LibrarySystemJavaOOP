import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Borrowable> items;
    private List<User> users;

    public Library() {
        this.items = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("Added user: " + user.getName());
    }

    public Book findBookByIsbn(String isbn) {
        for (Borrowable item : items) {
            if (item instanceof Book book && book.getIsbn().equals(isbn)) {
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

    public void displayItems() {
        System.out.println("Library Items:");
        for (Borrowable item : items) {
            System.out.println(item);
        }
    }
}