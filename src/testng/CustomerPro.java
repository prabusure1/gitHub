package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CustomerPro {

	
	WebDriver driver;
	
	
	@Test (priority =1)

	public void loadbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"I:\\Selenium\\Drivers\\Browser Driver\\chromedriver110.exe");

		driver = new ChromeDriver();
		
		System.out.println("Driver initiated");
	}

	@Test (priority =2)

	public void openUrl() {
		
		driver.get("http://www.demo.guru99.com/V4/");

		driver.manage().window().maximize();
		
		System.out.println("Window Maximized");
	}
	
	
	@Test (priority =3)
	public void LoginTest()  {

		System.out.println("Test Executed");

		// Thread.sleep(3000);

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@name=\"uid\"]")).sendKeys("mngr486854");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("EmyqUrU");

		driver.findElement(By.xpath("//*[@name=\"btnLogin\"]")).click();

		System.out.println("Test Completed");
		
	}

	@Test (priority =4)
	
	public void newcust() throws InterruptedException
	{
		
		Thread.sleep(1000);	
		WebElement newcust = driver.findElement(By.linkText("New Customer"));

		if (newcust.isDisplayed()) {
			System.out.println("Test Successful");
		}

		else {
			System.out.println("Login Failed");
		}

		newcust.click();

		driver.findElement(By.xpath("//*[@name=\"name\"]")).clear();
		String str = "Prabu!! Elumalai@";
		str = str.replaceAll("[^a-zA-Z0-9]", "");

		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys(str);

		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).click();

		driver.findElement(By.xpath("//*[@name=\"dob\"]")).sendKeys("10/06/1992");
		driver.findElement(By.xpath("//*[@name=\"addr\"]")).sendKeys("Address1 address2 address 3 Tamil Nadu");

		driver.findElement(By.xpath("//*[@name=\"city\"]")).sendKeys("Chennai");

		driver.findElement(By.xpath("//*[@name=\"state\"]")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//*[@name=\"pinno\"]")).sendKeys("600069");

		driver.findElement(By.xpath("//*[@name=\"telephoneno\"]")).sendKeys("985656436");

		driver.findElement(By.xpath("//*[@name=\"emailid\"]")).sendKeys("test1edu@gmail.com");
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@name=\"sub\"]")).click();
	}
		
	@Test (priority=5)
	
	public void alert()
	{
		
		
		String txt = driver.switchTo().alert().getText();
		
		if (txt.equals("Email Address Already Exist !!"))
		{
			System.out.println("Enter a new email id");
		}
		
		driver.switchTo().alert().accept();
	}
		

	
	
}
