package basicPrograms;

public class methodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=30; int b=70; int c=50;
		add(34, 56);
		add(55.50, 67.89);
		add(90, 105.50);
		add(45.50, 200);
		add(a, b);
		add(a,b,c);
		
	}

	private static void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		int result = a+b+c;
		System.out.println("Sum of two given numbers is : " + result);
	}

	private static void add(double d, double e) {
		// TODO Auto-generated method stub
		
		double result = d+e;
		System.out.println("Sum of two given numbers is : " + result);
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		
		int result = i+j;
		System.out.println("Sum of two given numbers is : " + result);
	}

}
