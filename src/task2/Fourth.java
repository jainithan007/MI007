package task2;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter the number of lines for thr pattern:");
		   int n = scanner.nextInt();
		   
		   for(int i = 0; i < n; i++) {

			   System.out.println(" * *");
			   System.out.println(" **   ");
			   System.out.println("  * ");
			   System.out.println(" **");
			   System.out.println(" * *");
		   }

   System.out.println(" java program ");
   scanner.close();

	}

}
