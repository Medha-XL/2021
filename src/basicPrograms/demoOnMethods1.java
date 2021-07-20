package basicPrograms;

public class demoOnMethods1 {

	public static int add(int a, int b) {
		
		int sum;
		sum = a+b;
		return sum;
		
	} //End of add method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		int num2 = 40;
		int result;
		
		result = add(num1, num2);
		System.out.println("Sum of num1 + num2 is : " + result);
		System.out.println("Sum of num1 + num2 is : " + add(10, 100));
		
	} // End of main method

}
