package basicPrograms;

public class Vmethod1 {

	
	public void add(int a, int b) {
		
		int results;
		results = a+b;
		System.out.println("Sum of two numbers is : " + results);
	}
	
    public void add(int a, double b) {
		
		double results;
		results = a+b;
		System.out.println("Sum of two numbers is : " + results);
	}
    
   public void add(double a, double b) {
		
		double results;
		results = a+b;
		System.out.println("Sum of two numbers is : " + results);
	}
   
   public void add(double a, int b) {
		
		double results;
		results = a+b;
		System.out.println("Sum of two numbers is : " + results);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=30; int y=40;
		Vmethod1 obj = new Vmethod1();
		obj.add(x,y);
		obj.add(45.6,55);
		obj.add(34.5, 56.7);
		obj.add(30,  100.5);
		
		
	}

}
