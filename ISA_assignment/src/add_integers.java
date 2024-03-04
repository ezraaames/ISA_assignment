

	import java.util.Scanner; 
	public class add_integers {
	 public static void main(String[] args) { 
		 Scanner scanner = new Scanner(System.in);
		// Prompt the user to enter an integer
		System.out.print("Enter your integer: ");
		// Read the integer entered by the user
		int number = scanner.nextInt();
		// Print the entered integer
		System.out.println("The integer entered is: " + number);
		// Close the Scanner object
		scanner.close();
		}
		}
