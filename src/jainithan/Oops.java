package jainithan;
import java.util.Scanner;
class advCalc { 
  
   int num1;class Calc { 
   int num2;
   int result;
   
   float a;
   float b;
   float c;
   
   public int add() {
	   
	   result = num1 + num2;
	   return result;
	   
	   
   }
    public float perform(){
    	
    	c = a+b;
    	return c;
    	   	
    	
    }
    
    public static void  sub(int n1,int n2) {
    	
    	int num1 = n1;
    	int num2 = n2;
        int result = num1 - num1;
    	
    	System.out.println("the subtration value :" + result);
    }
      
}
  
   
public class Oops {
	
	public static void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calc obj = new Calc(); 
	
	 /*obj.num1 =10;
	obj.num1 =10;
      //obj.add();
    
       //System.out.println(obj.add());
      
      
      int a = obj.add();
      
      System.out.println("value:"+ a);
      
    obj.a = 2.3F;
    obj.b = 1.8F;
      
      System.out.println("enter the value:" + obj.perform());
      
      Calc.sub();
      
      test();*/
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calc.sub(a, b);
		
		
		
      
	}

}
