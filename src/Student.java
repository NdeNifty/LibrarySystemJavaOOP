import java.util.List;

public class Student extends User {
    private int maxBooks = 3;

    // Constructor
    public Student(String name, int id) {
        super(name, id); // Call User constructor to initialize name, id, and borrowedBooks
    }

    // Getter for maxBooks
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

    // Override returnBook
    @Override
    public void returnBook(Book book) {
        super.returnBook(book); // Use parent’s implementation
    }

    // Getter for borrowedBooks
    public List<Book> getBorrowedBooks() {
        return super.getBorrowedBooks(); // Access parent’s method
    }
}