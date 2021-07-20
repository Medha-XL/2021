package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class demo1 {
	
  @Test
  public void AdditionOfTwoNumbers() {
	  
	  int a=70; int b=30; int sum;
	  sum = a+b;
	  System.out.println("Sum of Two Numbers is: " + sum);
	  assertEquals(sum, 100);
  
  }
  
  
  @Test
  public void SubstractionOfTwoNumbers() {
	  
	  int a=100; int b=30; int result;
	  result = a-b;
	  System.out.println("Substraction of Two Numbers is: " + result);
	  assertEquals(result, 70);
  
  }
    
}
