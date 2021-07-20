package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectFromDropDown {
	
  static WebDriver driver;
  public static void selectOptionFromDropDown() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();


      // Launch the application		
      driver.get("http://medhaxl.com/");
      
      //Select Option from Training Type DropDown
      Select drpCourse = new Select(driver.findElement(By.name("menu-766")));
	  drpCourse.selectByVisibleText("Regular Training");
	  drpCourse = new Select(driver.findElement(By.xpath("(//select[@name='menu-766'])[2]")));
	  drpCourse.selectByVisibleText("Agile");
	 
  }
  
  public static void main(String[] args) {
	  
	  selectOptionFromDropDown();
	  
  }
  
 }
