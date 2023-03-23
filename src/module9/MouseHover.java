package module9;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		
		//Open Browser
		
		System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//Dimenson
		
		driver.manage().window().maximize();
		
		//Open Url
		String str="https://www.myntra.com/";
		driver.get(str);
		
		
		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("Mens Jackets");
		driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
		WebElement mh= driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(mh).perform();
		
		
	}
	
	

}
