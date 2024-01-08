package sample;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		       Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Swapping using an additional variable
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;
		        System.out.println("Swapped values: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);

		        scanner.close();
		        
		        
		    
		
		
	}

}
