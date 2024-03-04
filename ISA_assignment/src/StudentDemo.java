class Student {
    private String name;
    private int age;
    private String address;

    // Constructor with default values
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    // Method to set name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating instances of the Student class
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Setting information using the setInfo method
        student1.setInfo("John", 20);
        student2.setInfo("Alice", 22, "123 Main St");
        student3.setInfo("Bob", 19, "456 Oak Ave");

        // Displaying information for each student
        System.out.println("Student 1:");
        student1.displayInfo();

        System.out.println("\nStudent 2:");
        student2.displayInfo();

        System.out.println("\nStudent 3:");
        student3.displayInfo();
    }
}
