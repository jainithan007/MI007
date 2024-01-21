package jainithan;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {		// TODO Auto-generated method stub
	
      Scanner sc = new Scanner (System.in);
      
      System.out.println("enter the marks:");
      
      int marks = sc.nextInt();
      
      if (marks < 100 && marks > 90 ) {
    	  
    	   System.out.println("Grade A");
    	   
      }
      
      else if (marks < 90 && marks > 70) {
    	  
    	  System.out.println("Grade B");
    	  
      }
 else if (marks < 70 && marks > 35) {
    	  
    	  System.out.println("Grade C");
    	  
      
    	   
       }
      
    else {
    	
	  System.out.println("Fail");
	
	}
	}
}
	  
	
	
       

       
       

	
