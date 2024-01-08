package jainithan;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {		// TODO Auto-generated method stub
	
        Scanner scanner = new Scanner (System.in);
        
        int mark;
        
        System.out.println("Enter a marks (0-100):");
        mark = scanner.nextInt();
        
       if(mark >= 90) 

    	   System.out.println( "GRADE A");
       
    	   else if(mark >= 80)
    		   System.out.println( "GRADE B");
    	   else if(mark >= 70)
    		   System.out.println( "GRADE C");
    	   else if(mark >= 60)
    		   System.out.println( "GRADE D");
       
    	   else { 
    		   
    		   System.out.println( "FAIL");
    	   
    	   
       }
	}
       
}
       
       

	
