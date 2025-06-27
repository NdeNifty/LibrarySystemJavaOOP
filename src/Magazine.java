public class Magazine implements Borrowable {
    private String title;
    private String issueNumber;
    private String publicationDate;
    private boolean isAvailable; // Changed from Boolean to boolean

    // Constructor
    public Magazine(String title, String issueNumber, String publicationDate) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.isAvailable = true;
    }

    // Getters
    public String getTitle() { return title; }
    public String getPublicationDate() { return publicationDate; }
    public String getIssueNumber() { return issueNumber; }
    public boolean isAvailable() { return isAvailable; } // Changed return type to boolean

    // Borrowable interface methods
    @Override
    public void borrow(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + " borrowed " + title);
        } else {
            System.out.println("Magazine " + title + " is not available");
        }
    }

    @Override
    public void returnItem(User user) {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(user.getName() + " returned the magazine " + title);
        } else {
            System.out.println("The magazine " + title + " was not borrowed");
        }
    }

    // toString method for display
    @Override
    public String toString() {
        return "Magazine{title='" + title + "', issueNumber='" + issueNumber +
                "', publicationDate='" + publicationDate + "', available=" + isAvailable + "}";
    }
}