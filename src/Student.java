import java.util.List;

public class Student extends User {
    private int maxBooks = 3;

    // Constructor
    public Student(String name, int id) {
        super(name, id); // Call User constructor to initialize name, id, and borrowedBooks
    }

    // Getter for maxBooks (encapsulation)
    public int getMaxBooks() {
        return maxBooks;
    }

    // Override borrowBook to enforce maxBooks limit
    @Override
    public void borrowBook(Book book) {
        if (getBorrowedBooks().size() < maxBooks) {
            if (book.isAvailable()) {
                book.borrow(this);
                getBorrowedBooks().add(book); // Add to borrowedBooks after successful borrow
            } else {
                System.out.println(book.getTitle() + " is not available");
            }
        } else {
            System.out.println(getName() + " cannot borrow more than " + maxBooks + " books");
        }
    }

    // Optionally override returnBook (can use parent’s implementation if no changes needed)
    @Override
    public void returnBook(Book book) {
        super.returnBook(book); // Use parent’s implementation
    }
}