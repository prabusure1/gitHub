package module1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MICROSECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("MI Phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Redmi Note 9 (Pebble Grey, 4GB RAM 64GB Storage')]")).click();
		
		
		
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		
		Set<String> st= driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> it=st.iterator();
		
		String child="";
		
		while(it.hasNext())
		{
			 child = it.next();
			
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				
				//System.out.println(child);
				
			}
			
			/*else {
				
				driver.switchTo().window(parent);
			}
			//switch to the parent window
			*/
		}
		
		
		driver.switchTo().window(child);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input#add-to-cart-button")).click();
		
		Thread.sleep(3000);
		
		WebElement web= driver.findElement(By.xpath("//*[@id=\"attach-accessory-proceed-to-checkout-text\"]"));
		
			
		Actions action = new Actions (driver);
		
		action.moveToElement(web).perform();
		
		
		driver.findElement(By.cssSelector("span#attach-sidesheet-checkout-button")).click();
		
		WebElement id= driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		
		id.clear();
		id.sendKeys("prabu.vrt.prime@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]//input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("PrabU2323");
		
		driver.findElement(By.cssSelector("input#signInSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(550, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
			
		driver.findElement(By.cssSelector("input#auth-signin-button")).click();
		

		//driver.close();
		//driver.quit();
		
	}
	

}
