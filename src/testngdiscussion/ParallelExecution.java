package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	@Parameters ("browser")
	@Test
	public void validateUrl(String param)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver	driver = new ChromeDriver();
			
			// redirecting to a URL
			driver.manage().window().maximize();
			
			driver.get(param);
	}

}
