package basicPrograms;

import java.math.BigDecimal;
import java.util.Scanner;

public class methodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner obj = new Scanner(System.in);
		
		int a; int b;
		System.out.print("Enter First Number: ");
		a = obj.nextInt();
		System.out.print("Enter Second Number: ");
		b = obj.nextInt();
		add(a,b);		
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
