class Student {

    String name;

    // Constructor
    Student(String name) {
        this.name = name;
        System.out.println(name + " object is created.");
    }

    // Method
    void study() {
        System.out.println(name + " is studying.");
    }

    // Method to make object eligible for garbage collection
    void removeReference() {
        System.out.println(name + " object is no longer needed.");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student("Aarti");

        // Using object
        s1.study();

        // Removing reference
        s1.removeReference();
        s1 = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}