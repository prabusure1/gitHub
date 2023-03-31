package module9;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		
		//Open Browser
		
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//Dimenson
		
		Dimension d= new Dimension(600,650);
		
		//Open Url
		String str="https://www.google.com/intl/en-GB/gmail/about/#";
		driver.get(str);
		
		//Window Handle		
		String win=driver.getWindowHandle();
		
		System.out.println("Main window name is "+win);
		
		
		//Window handles 
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		Set<String> windows =driver.getWindowHandles();
		System.out.println("Main window name is "+windows);
		String title=driver.getTitle();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");		
		System.out.println("Title name of second tab is "+title);
		
		for (String current: windows)
		{
			if(!current.equalsIgnoreCase(win))
			{
				driver.switchTo().window(current);
				
				driver.findElement(By.cssSelector("input[type='email']")).sendKeys("edu.prabu");
			}
		}
		
	}

}
