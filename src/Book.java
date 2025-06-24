
public class Book implements Borrowable{
    private String title;
    private String author;
    private String isbn;
    private Boolean isAvailable;

    //constructor
    public Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
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

    public Boolean isAvailable() {
        return isAvailable;
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


}


