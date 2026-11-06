class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy Constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Display Book Details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {

        // Default Constructor
        Book b1 = new Book();

        // Parameterized Constructor
        Book b2 = new Book("Java Programming", "James Gosling", 500);

        // Copy Constructor
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        // Modifying copied object
        b3.title = "Python Programming";
        b3.price = 600;

        System.out.println("After Modifying Copy Object:");
        b3.display();

        System.out.println("Original Object:");
        b2.display();
    }
}