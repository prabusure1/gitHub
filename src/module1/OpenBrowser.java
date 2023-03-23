package module1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/home");
		
		driver.findElement(By.cssSelector("[class='nav__button-secondary']")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("edu.prabu@gmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("PrabU2323");
		
		driver.findElement(By.cssSelector("[class='btn__primary--large from__button--floating']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='global-nav__me-photo ember-view']")).click();
		Thread.sleep(1000);
		Robot robo = new Robot();
		
		for (int i=0; i<8;i++)
		{
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.close();
		
		
		}
		
		
}
