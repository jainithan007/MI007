package jainithan;

import java.util.Scanner;

class Calc { 
  
   int num1;
   int num2;
   int result;
   
  
   public int add() {
	   
	   result = num1 + num2;
	   return result;
	   
	   
   }
   
    
    public static void  sub(int n1,int n2) {
    	
    	int number1 = n1;
    	int number2 = n2;
        int result = number1 - number2;
    	
    	System.out.println("the subtration value :" + result);
    }
      
}
  
   
public class Oops2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calc obj = new Calc(); 
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
	
		Calc.sub(a, b);
		
	}

	
	
}
		