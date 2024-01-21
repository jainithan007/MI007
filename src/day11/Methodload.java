package day11;


public class Methodload {
	
	public void add() {
		
		System.out.println("method with no arguments");
	}
	
	public void add(int n1) {
		
		System.out.println("method wih one parameter"+n1);
	}

	public void add(String n1, int n2) {
		
		System.out.println("method with two parameter"+n1 +" " + n2);
	}
    public void add(int n1 , int n2) {
		
		System.out.println("method with two parameter with diffrent data type"+n1 +" " + n2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodload obj = new Methodload();
		obj.add();
		obj.add(10);
		obj.add("mano",12);
		obj.add(12,23);
	}

}
