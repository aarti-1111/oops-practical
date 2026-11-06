class Student {
    int rollNo;
    String name;
    int marks1;
    int marks2;
    int marks3;
    Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }
    void display() {
        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
    }}
public class main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Akshita", 85, 90, 78);
        Student s2 = new Student(102, "Pihu", 92, 88, 95);
        Student s3 = new Student(103, "Ritik", 67, 72, 58);

        s1.display();
        s2.display();
        s3.display();
    }
}

