package task2;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.print("enter a string");
			
		    String inputstring = sc.nextLine();
		    
		   String reverstring = ("");
		    for (int i = inputstring.length()-1;i>=0; i--) {
		    	
		    	reverstring += inputstring.charAt(i);
		    }
		    
		    System.out.println("Reversed string"+reverstring);
		}
	
	}
