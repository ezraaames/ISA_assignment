import java.util.Scanner;

class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;

    // Constructor
    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        double DA = 0.10 * basicSalary;
        double HRA = 5000;
        return basicSalary + DA + HRA;
    }

    // Method to update basic salary
    public void updateBasicSalary(double newBasicSalary) {
        this.basicSalary = newBasicSalary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of the Employee class
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter employee basic salary: ");
        double basicSalary = scanner.nextDouble();

        Employee employee = new Employee(name, jobTitle, basicSalary);

        // Displaying initial details and total salary
        displayEmployeeDetails(employee);

        // Updating basic salary
        System.out.print("Enter new basic salary: ");
        double newBasicSalary = scanner.nextDouble();
        employee.updateBasicSalary(newBasicSalary);

        // Displaying updated details and total salary
        System.out.println("\nDetails after updating basic salary:");
        displayEmployeeDetails(employee);

        scanner.close();
    }

    private static void displayEmployeeDetails(Employee employee) {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Total Salary: " + employee.calculateTotalSalary());
    }
}

