// Default constructor 
class Book {
    String title;
    String author;

    // Default constructor
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
    }
}
