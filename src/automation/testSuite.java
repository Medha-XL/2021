package automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testSuite {

  @BeforeTest
  public void createTestData() {
	  
	  System.out.println("Creating the Test Data");
	  
  }
  
  @AfterTest
  public void cleanUpTestData() {
	  
	  System.out.println("Clean Up Test Data");
	  
  }
  
  @BeforeMethod
  public void launchBrowser() {
	  
	  System.out.println("Launching the Chrome Browser..");
	  
  }
  
  @AfterMethod
  public void closeBrowser() {
	  
	  System.out.println("Closing the Chrome Browser..");
	  
  }
  
  @Test
  public void TestCase_1() {
	  
	  System.out.println("This is Test Case 1..");
	  
  }
  
  @Test
  public void TestCase_2() {
	  
	  System.out.println("This is Test Case 2..");
	  
  }
  
  @Test
  public void TestCase_3() {
	  
	  System.out.println("This is Test Case 3..");
	  
  }
  
  
}
