class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("SINGLE INHERITANCE");

        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\nMULTILEVEL INHERITANCE");

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}