public class LibrarySystem {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "987654321");

        // Create magazines
        Magazine magazine1 = new Magazine("Jeunes", "000232", "12/03/2025");
        Magazine magazine2 = new Magazine("National Geographic", "Issue 123", "2023-11");

        // Add items to library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine1);
        library.addItem(magazine2);

        // Create student
        Student student = new Student("Alice", 1);
        library.addUser(student);

        // Display all items
        System.out.println("\nInitial Library State:");
        library.displayItems();

        // Test borrowing
        System.out.println("\nTesting borrowing:");
        student.borrowItem(book1);    // Book
        student.borrowItem(magazine1); // Magazine
        student.borrowItem(book2);    // Book
        student.borrowItem(magazine2); // Should fail (maxItems = 3)

        // Display student's borrowed items
        System.out.println("\n" + student.getName() + "'s borrowed items:");
        for (Borrowable item : student.getBorrowedItems()) {
            System.out.println(item);
        }

        // Display library state
        System.out.println("\nLibrary State After Borrowing:");
        library.displayItems();

        // Test returning
        System.out.println("\nTesting returning:");
        student.returnItem(book1);
        student.returnItem(magazine1);

        // Display final library state
        System.out.println("\nLibrary State After Returning:");
        library.displayItems();
    }
}