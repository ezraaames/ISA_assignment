class Vehicle {
    protected int horsepower;

    // Constructor for Vehicle class
    public Vehicle(int horsepower) {
        this.horsepower = horsepower;
    }

    // Drive method in Vehicle class
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    private String make;

    // Constructor for Car class, calls the Vehicle class constructor
    public Car(int horsepower, String make) {
        super(horsepower);
        this.make = make;
    }

    // Override the drive method in Car class
    @Override
    public void drive() {
        // Call the parent drive method
        super.drive();
        System.out.println("Car is being driven.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car(80, "Toyota");

        // Calling the drive method of the Car class
        myCar.drive();

        // Accessing horsepower member from the Vehicle class
        System.out.println("Horsepower of the Vehicle: " + myCar.horsepower);

        // Accessing horsepower member from the Car class
        System.out.println("Horsepower of the Car: " + myCar.horsepower);
    }
}
