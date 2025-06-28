import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int id;
    private List<Borrowable> borrowedItems;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedItems = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public List<Borrowable> getBorrowedItems() { return borrowedItems; }

    public void borrowItem(Borrowable item) {
        item.borrow(this);
        if (item.isAvailable()) {
            borrowedItems.add(item);
        }
    }

    public void returnItem(Borrowable item) {
        item.returnItem(this);
        borrowedItems.remove(item);
    }
}