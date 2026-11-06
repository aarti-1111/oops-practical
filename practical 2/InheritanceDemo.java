class Vehicle {
    String brand = "Mahindra";
    int speed = 120;

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void showVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/hr");
    }
}

class Car extends Vehicle {
    String model = "Fortuner";

    void showCar() {
        System.out.println("Car Model: " + model);
    }
}


// 2. MULTILEVEL INHERITANCE

class Person {
    String name = "Aarti";
    int age = 20;

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId = 101;
    double salary = 30000;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showManager() {
        System.out.println("Department: " + department);
    }
}


// 3. HIERARCHICAL INHERITANCE

class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void areaCircle() {
        double area = 3.14 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void areaRectangle() {
        int area = length * breadth;
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
    }
}


// MAIN CLASS

public class InheritanceDemo {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("===== SINGLE INHERITANCE =====");

        Car c = new Car();
        c.start();
        c.showVehicle();
        c.showCar();


        // Multilevel Inheritance
        System.out.println("\n===== MULTILEVEL INHERITANCE =====");

        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();


        // Hierarchical Inheritance
        System.out.println("\n===== HIERARCHICAL INHERITANCE =====");

        Circle ci = new Circle();
        ci.display();
        ci.areaCircle();

        Rectangle r = new Rectangle();
        r.display();
        r.areaRectangle();
    }
}