package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CAlert {

	public static void main(String[] args) throws InterruptedException {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Capture Result message
		
		WebElement msg =driver.findElement(By.id("msg"));
		
		Thread.sleep(3000);
		
		//Click to open the alert
		driver.findElement(By.id("prompt")).click();
		
		//Create Object of Alert Class
		
		Alert al = driver.switchTo().alert();
		

		//get text of the Alert
		System.out.println(al.getText());	
		//Perform Action on Alert
		al.sendKeys("Prabu");
		//Print the result
		al.accept();
		
		System.out.println(al.getText());
		
	}

}