

	import java.util.Scanner;

	public class FibonacciSeries {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of terms for Fibonacci series: ");
	        int n = scanner.nextInt();

	        System.out.println("Fibonacci series up to " + n + " terms:");
	        displayFibonacciSeries(n);

	        scanner.close();
	    }

	    private static void displayFibonacciSeries(int n) {
	        int firstTerm = 0, secondTerm = 1;

	        for (int i = 0; i < n; i++) {
	            System.out.print(firstTerm + " ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	    }
	}



