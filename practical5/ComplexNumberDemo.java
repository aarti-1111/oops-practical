class ComplexNumber {
    double real;
    double imaginary;

    // Constructor
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add two complex numbers
    ComplexNumber add(ComplexNumber c) {
        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    // Display complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.println("Addition Result:");
        result.display();
    }
}