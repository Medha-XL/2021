package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbtillEnd {
	
  static WebDriver driver;

  // This method will scroll down the page till end
  public static void ScrollThePageTillEnd() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();

      JavascriptExecutor js = (JavascriptExecutor) driver;

      // Launch the application		
      driver.get("http://medhaxl.com/");

      //This will scroll the web page till end.		
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 
  }
  
  public static void ScrollThePageToFindTheElement() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();

      JavascriptExecutor js = (JavascriptExecutor) driver;

      // Launch the application		
      driver.get("http://medhaxl.com/");
      
      WebElement Element = driver.findElement(By.linkText("Home"));

      //This will scroll the page till the element is found		
      js.executeScript("arguments[0].scrollIntoView();", Element);

  }
  
  public static void main(String args[]) {
	  
	 //ScrollThePageTillEnd();
	 ScrollThePageToFindTheElement();
	  
  }

}