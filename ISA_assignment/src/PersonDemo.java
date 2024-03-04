
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        // Printing the initial state
        System.out.println("Initial state:");
        printPersonDetails(person1);
        printPersonDetails(person2);

        // Modifying attributes using setter methods
        person1.setName("Bob");
        person1.setAge(28);

        person2.setName("Eve");
        person2.setAge(35);

        // Printing the updated state
        System.out.println("\nUpdated state:");
        printPersonDetails(person1);
        printPersonDetails(person2);
    }

    private static void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
