package task2;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	      
		       System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        
		        if (isPalindrome(input)) {
		            System.out.println(input + " is a palindrome.");
		        } else {
		            System.out.println(input + " is not a palindrome.");
		        }
		        
		        
		    }

		    private static boolean isPalindrome(String str) {
		        int length = str.length();
		        for (int i = 0; i < length / 2; i++) {
		            if (str.charAt(i) != str.charAt(length - 1 - i)) {
		              
		            	return false;
		            }
		            
		        }
		        
		        return true;
		    }
		


	}


