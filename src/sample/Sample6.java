package sample;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a number:");
		int number = scanner.nextInt();
		
		long factorial = calculatefactorial(number);
		System.out.println(number+"! ="+factorial);
	
		}
	private static long calculatefactorial(int n) {
		if (n == 0 || n ==1) {
			return 1;
			
		}else {
			return n * calculatefactorial(n - 1);
			
		}
	}
}
