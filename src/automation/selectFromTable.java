package automation;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;


public class selectFromTable {
	
  static WebDriver driver;
  public static void main(String args[]) {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver = new ChromeDriver();

      //JavascriptExecutor js = (JavascriptExecutor) driver;

      // Launch the application		
      driver.get("http://medhaxl.com/");
      
     WebElement Batches = driver.findElement(By.xpath("//a[@href=\"/batches/\"]"));
     
     Batches.click();
     
     Actions action = new Actions(driver);
     
     action.moveToElement(Batches).click();
     
    // driver.navigate();
     
   WebElement TableInfo = driver.findElement(By.xpath("//td[contains(text(),'Ramprasad']"));
       
     String TableText = TableInfo.getText();
     
     System.out.println("Table Input is : " + TableText);
 

  }
  
 }
