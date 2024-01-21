package task2;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of row: ");
		        int row = scanner.nextInt();
		        int count = 1;

		        for (int i = 1; i <= row; i++) {
		            for (int j = 1; j <= i; j++) {
		            		 
		                System.out.print(count + " ");
		                count++;
		            }
		            System.out.println();
		        }

		        
		    }
		

		

	}


