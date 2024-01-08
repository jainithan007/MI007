package sample;
import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        if (isPrime(number)) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }

		        scanner.close();
		    }

		    // Function to check if a number is prime
		    private static boolean is Prime(int num) {
		        if (num <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		


	}

}
