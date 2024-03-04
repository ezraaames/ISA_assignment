class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class DogDemo {
    public static void main(String[] args) {
        // Creating instances of the Dog class using the constructor
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "Golden Retriever");

        // Printing the initial state
        System.out.println("Initial state:");
        printDogDetails(dog1);
        printDogDetails(dog2);

        // Modifying attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Beagle");

        dog2.setName("Rocky");
        dog2.setBreed("German Shepherd");

        // Printing the updated state
        System.out.println("\nUpdated state:");
        printDogDetails(dog1);
        printDogDetails(dog2);
    }

    private static void printDogDetails(Dog dog) {
        System.out.println("Name: " + dog.getName() + ", Breed: " + dog.getBreed());
    }
}
