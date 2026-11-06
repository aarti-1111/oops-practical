class Product {
    String productName;
    double price;
    int quantity;

    // Constructor with no arguments
    Product() {
        productName = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor with one argument
    Product(String productName) {
        this.productName = productName;
        price = 0;
        quantity = 0;
    }

    // Constructor with two arguments
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 0;
    }

    // Constructor with three arguments
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total cost
    double calculateTotal() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
        System.out.println();
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 15000);
        Product p4 = new Product("Keyboard", 800, 5);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("One Argument Constructor:");
        p2.display();

        System.out.println("Two Arguments Constructor:");
        p3.display();

        System.out.println("Three Arguments Constructor:");
        p4.display();
    }
}