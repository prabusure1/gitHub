package module9;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEventsDesktop {

	public static void main(String[] args) throws Exception {
		
		//Open Browser
		
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		//Open Url
		String str="https://seleniumautomationpractice.blogspot.com/2020/04/fileupload_10.html";
		driver.get(str);
		
		
		WebElement photo = driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
		
		Actions act =new Actions(driver);
		act.moveToElement(photo).click().perform();
		
		String image="C:\\Users\\Prabu Elumalai\\OneDrive\\Pictures\\Educlass\\test.jpg";
		
		
		StringSelection sele = new StringSelection(image);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele, null);
		
		Robot robo1= new Robot();
		Thread.sleep(1000);
		robo1.keyPress(KeyEvent.VK_ENTER);
		robo1.keyRelease(KeyEvent.VK_ENTER);
		
		robo1.keyPress(KeyEvent.VK_CONTROL);
		robo1.keyPress(KeyEvent.VK_V);
		
		robo1.keyRelease(KeyEvent.VK_V);
		robo1.keyRelease(KeyEvent.VK_CONTROL);
		
		//Thread.sleep(3000);
		
		robo1.keyPress(KeyEvent.VK_ENTER);
		robo1.keyRelease(KeyEvent.VK_ENTER);
		
		
		//driver.quit();
		
	}
	
	

}
