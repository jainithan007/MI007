package sample;

import java.util.Scanner;

public class Sample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("enter the age :");
    int age = scanner.nextInt();
    
    if (age >= 50) {
    	System.out.println("Senior citizen");
    
    }
    else
    {
    	
    	System.out.println("Not a senior citizen");
    }
    scanner.close();
	}

}
