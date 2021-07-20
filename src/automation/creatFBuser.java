package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatFBuser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Chrome browser will launch
		driver.manage().window().maximize();  // will maximize the window
		String fname = "Rahul";
		String lastname = "Patel";
		String mobile = "8074153357";
		String pwd = "Admin@123";
		String url = "https://www.facebook.com/";
			
		
		driver.get(url);
		driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//select[@id=\"day\"]/option[@value=\"10\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"month\"]/option[@value=\"5\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"year\"]/option[@value=\"1990\"]")).click();
		
		driver.findElement(By.xpath("//*[@type=\"radio\" and @value=\"2\"]")).click(); 
		
		
		//driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		
			    	
	}

}
