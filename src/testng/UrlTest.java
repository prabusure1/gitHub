package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class UrlTest {
	
	WebDriver driver;
	
		
  @Test
  public void LoginTest() {
	  
	  System.out.println("Test Executed");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.cssSelector("input#username")).sendKeys("edu.prabu@gmail.com");
	  
	  driver.findElement(By.cssSelector("input#password")).sendKeys("PrabU2323");
	  
	  driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	
	boolean sign = driver.findElement(By.cssSelector("h1.header__content__heading ")).isDisplayed();
	  
	  System.out.println(sign);
  }

  @AfterTest
  public void afterTest() {
	  String homepage ="Home1";
	  
	  String hom =driver.findElement(By.xpath("//*[@id=\"ember28\"]")).getText();
	  
	  	  
	  if(homepage.equals(hom))
	  {
		  System.out.println("Home Page icon found");
		   
		  
	  }
	  
	  else
		  System.out.println("Home icon not found");
	  
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver", "I:\\Selenium\\Drivers\\Browser Driver\\chromedriver.exe");
	  
	  driver =new ChromeDriver();
	  driver.get("https://www.linkedin.com/login");
  }

 
  
  @AfterSuite
  public void afterSuite() {
  }

}
