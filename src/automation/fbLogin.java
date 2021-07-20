package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Chrome browser will launch
		driver.manage().window().maximize();  // will maximize the window
		String userid = "ramprasads1@gmail.com";
		String pwd = "Chair@1327";
		String url = "https://www.facebook.com/";
			
		
		driver.get(url);	
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		String login_name = driver.findElement(By.xpath("//*[contains(text(),\"Ramprasad\")]")).getText();
		System.out.println("Login Name is : " + login_name);
	    if (login_name.equalsIgnoreCase("Ramprasad")) {
	    	
	    	System.out.println("FaceBook Login Name is successful: " + login_name);
	    }
	    else
	    {
	    	System.out.println("FaceBook Login Failed..");
	    }
	    	
	}

}
