package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //to Launch Chrome Browser
		
	    driver.manage().window().maximize();   // Maximizing the browser window
  	    
       	driver.get("https://www.makemytrip.com/"); // to open Google Search 
       	
       	String title = driver.getTitle();
       	System.out.println("The Page Title is : " + title);
       	driver.navigate().back();
       	driver.navigate().forward();

	}
}