package basicPrograms;

import java.util.Scanner;

public class printEvennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Enter the n value : ");
		n = input.nextInt();
		 
		for(int i=1; i<=n; i++) {
			
		  if(i%2 == 0) {
			System.out.println(i);
		  }
		  
		}
		
		input.close();
	}

}
