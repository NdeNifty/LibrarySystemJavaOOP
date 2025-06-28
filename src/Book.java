
public class Book implements Borrowable{
    private String title;
    private String author;
    private String isbn;
    private Boolean isAvailable;

    //constructor
    public Book(String title, String author, String isbn){
        setTitle(title); // Use setter for validation
        setAuthor(author);
        setIsbn(isbn);   // Use setter for validation
        this.isAvailable = true;

    }

    //getter and setters

    public String getAuthor() {
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getIsbn(){
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }
    public void setIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        }
        this.isbn = isbn;
    }


// Borrowable interface methods
    @Override
    public void borrow(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + "borrowed" + title);

        } else {
            System.out.println(title + " is not available");
        }
    }

    @Override
    public void returnItem(User user){
        if(!isAvailable){
            isAvailable=true;
            System.out.println(user.getName() + " returned " + title);
        }
        else{
            System.out.println(title + " was not borrowed" );
        }
        }
    // Added toString method
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', isbn='" + isbn + "', available=" + isAvailable + "}";
    }

}


