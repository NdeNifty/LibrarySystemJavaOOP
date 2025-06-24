public class LibrarySystem {
    public static void main (String[] args){
        //Create Library
        Library library = new Library();

        //create books for Library
        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "987654321");

        //add books to library
        library.addBook(book1);
        library.addBook(book2);

        //create user
        User user1 = new User("Shafic", 1);
        library.addUser(user1);

        library.displayBooks();
        // Borrow and return books
        user1.borrowBook(book1);
        library.displayBooks();
        user1.returnBook(book1);
        library.displayBooks();

    }

}

