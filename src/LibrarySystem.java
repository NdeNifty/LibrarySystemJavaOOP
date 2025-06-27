public class LibrarySystem {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "987654321");

        // Create magazines
        Magazine magazine1 = new Magazine("Jeunes", "000232", "12/03/2025");

        // Add items to library
        library.addBook(book1);
        library.addBook(book2);
        library.addMagazine(magazine1);

        // Create student
        Student student = new Student("Alice", 1);
        library.addUser(student);

        // Display all items
        System.out.println("\nInitial Library State:");
        library.displayBooks();
        library.displayMagazines();

        // Test borrowing
        System.out.println("\nTesting borrowing:");
        student.borrowBook(book1);    // Book
        student.borrowBook(book2);    // Book
        // student.borrowBook(magazine1); // This will fail due to Book parameter type

        // Display student's borrowed books
        System.out.println("\n" + student.getName() + "'s borrowed books:");
        for (Book book : student.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        // Display library state
        System.out.println("\nLibrary State After Borrowing:");
        library.displayBooks();
        library.displayMagazines();

        // Test returning
        System.out.println("\nTesting returning:");
        student.returnBook(book1);

        // Display final library state
        System.out.println("\nLibrary State After Returning:");
        library.displayBooks();
        library.displayMagazines();
    }
}