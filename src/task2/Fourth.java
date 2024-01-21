package task2;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number of rows for thr pattern:");
		   int n = sc.nextInt();
		   
		   for(int i = 0; i <= n; i++) {
                if(i % 2 == 0) {
                	for (int j =1; j<=2; j++) {
                		 System.out.println(" * *");
                		
                	}		  
                	
		   }

                else {
   System.out.println("  * ");
   

	}

}
}
}