package basicPrograms;

import basicPrograms.Tools;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 40;
		int num2 = 50;
		int output;
		
		Tools obj = new Tools();
		
		output = add(num1,num2);
		System.out.println("Sum of two numbers is :" + output);
		output = Tools.sub(num2,num1);
		System.out.println("Subtraction of two numbers is :" + output);
		output = obj.mul(num1, num2);
		System.out.println("Multipliction of two numbers is :" + output);
		Tools.div(num2, num1);
	}

	private static int add(int num1, int num2) {
		// TODO Auto-generated method stub
		int results = num1 + num2;
		return results;
	}

}
