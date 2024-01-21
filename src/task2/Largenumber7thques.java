package task2;

import java.util.Scanner;

public class Largenumber7thques {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

		
	System.out.println("enter the first number:");
	int num1 = sc.nextInt();
	System.out.println("enter the second number");
	int num2 = sc.nextInt();
	System.out.println("enter the third number");
	int num3 = sc.nextInt();
	
	int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
	
	System.out.println("The largest number is: " + largest);
	
	}

}
