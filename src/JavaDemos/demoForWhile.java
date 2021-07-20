package JavaDemos;

public class demoForWhile {

	public static void main(String[] args) {
		// Sample program with while loop
		
		// Display all the even numbers from 1 to 10 numbers (2, 4, 6, 8, 10) / (1, 3, 5, 7, 9)
		int i = 1;
		while(i<=10) {
			
			if(i%2 != 0) {
			   System.out.println(i);
			}
			
			 i++;
			 
		}

	}

}
