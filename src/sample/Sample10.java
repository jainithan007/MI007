package sample;

import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("enter an integer:");
      int number = scanner.nextInt();
      int digitcount = countdigits(number);
      System.out.println("number of digits:"+ digitcount);
      
      scanner.close();
      
	}
	private static int countdigits(int number) {
		  int count = 0;
		  while (number !=0) {
			  count ++;
			  number /=10;
		  }
		return count;
		}
}
