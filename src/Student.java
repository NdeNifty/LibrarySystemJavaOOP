import java.util.List;

public class Student extends User {
    private int maxItems = 3;

    // Constructor
    public Student(String name, int id) {
        super(name, id); // Call User constructor to initialize name, id, and borrowedBooks
    }

    // Getter for maxBooks
    public int getMaxBooks() {
        return maxItems;
    }

    // Override borrowBook to enforce maxBooks limit
    @Override
    public void borrowItem(Borrowable item) {
        if (getBorrowedItems().size() < maxItems) {
            if (item.isAvailable()) {
                item.borrow(this);
                getBorrowedItems().add(item); // Add to borrowedBooks after successful borrow
            } else {
                System.out.println(item.toString() + " is not available");
            }
        } else {
            System.out.println(getName() + " cannot borrow more than " + maxItems + " books");
        }
    }

    // Override returnBook
    @Override
    public void returnItem(Borrowable item) {
        super.returnItem(item); // Use parent’s implementation
    }


}