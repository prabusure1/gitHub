package testng;


import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest {
	
	WebDriver driver;

	//@Parameters({"System"})
	@Test(priority = 0)
	public void Nodes(String device) throws Exception {
		
		if (device.equalsIgnoreCase("Node1")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(new URL("http://192.168.1.4:5858/wd/hub"), cap);

		} else if (device.equalsIgnoreCase("Node2")) {
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.1.4:6868/wd/hub"), cap);
		}
	}

	@Test(priority = 1, dependsOnMethods = "Nodes")
	public void OpenAUT() {
		// Dimention is used for window size manipulation for better viewing
		Dimension d = new Dimension(600, 650);
		driver.manage().window().setSize(d);
		
		// Open the AUT
		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 2, dependsOnMethods = "OpenAUT")
	public void Validate() {
		// Capture the Title of the Page
		String Apptitle = driver.getTitle();
		System.out.println(Apptitle);

		// validate the actual title VS Expected Title
		boolean Result = Apptitle.equals("Amazon.in");

		System.out.println(Result);
	}

}
