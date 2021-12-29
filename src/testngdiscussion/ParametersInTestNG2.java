package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersInTestNG2 {
	static WebDriver driver;
@Parameters("browser")
	@Test
public void launchBrowser(String browsername)
{
	
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	// redirecting to a URL
	driver.manage().window().maximize();
	
	}
	
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecho.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\gechodriver.exe");
		
		driver = new FirefoxDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
	}
}



}
