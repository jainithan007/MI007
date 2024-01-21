package day11;

public class Abstract {

	public static  void main(String[] args) {
		
       SecondBuild obj = new SecondBuild ();
       
		obj.call();
		obj.test();
		obj.location();
		
		
		abstract class initialbuild{
			
			public void call ( ) {
				System.out.println("call method");
				
			
			}
			
			public void test() {
				
				System.out.println("test method");
			}
			
			public abstract void location();
			
	class SecondBuild extends initialbuild{

	@Override
	public void location() {
		// TODO Auto-generated method stub
		
		System.out.println("Location ");
	}
	
	
}
	}

}
