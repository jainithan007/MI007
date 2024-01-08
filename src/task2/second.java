package task2;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner  = new Scanner(System.in);
        
        System.out.print("enter a string:");
        String inputstring = scanner .nextLine();
        
        String reversedstring = "";
        for (int i = inputstring.length()-1; i>=0; i--) {
        	reversedstring += inputstring.charAt(i);
        	
        }
        System.out.println("Reversed string:"+ reversedstring);
        
        scanner.close();
	}

}
