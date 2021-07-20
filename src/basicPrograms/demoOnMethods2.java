package basicPrograms;

import basicPrograms.mathFunctions;

public class demoOnMethods2 {

	public static int add(int a, int b) {
		
		int sum;
		sum = a+b;
		System.out.println("AdditionOne of two numbers is : " + sum);
		return sum;
		
	} //End of add method
	
  public static void sub(int a, int b) {
		
		int result = a-b;
		System.out.println("Subtraction of two numbers is : " + result);
		
	} //End of sub method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		int num2 = 40;
		System.out.println("Addition of two numbers is : " + add(num1, num2));
		System.out.println("Addition of two numbers is : " + add(40,110));
		sub(num2, num1);
		sub(100,120);
		
		mathFunctions obj = new mathFunctions();
		
		int output = obj.mul(num1,  num2);
		System.out.println("Multiplication of num1 * num2 is : " + output);
		obj.div(num1,  num2);
		
				
		
	} // End of main method

}
