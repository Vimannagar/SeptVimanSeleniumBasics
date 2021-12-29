package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersInTestNG {
	static WebDriver driver;
@Parameters("urltobelaunch")
	@Test
public void launchFacebook(String url)
{
	System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
	
	
	driver = new ChromeDriver();
	
	// redirecting to a URL
	driver.manage().window().maximize();
	
	if(url.contains("facebook"))
	{		
		
		driver.get(url);
	}
	
	else
	{
		driver.get("https://www.google.com/");
	}
	
}

@Parameters({"environment", "buildversion"})
@Test
public void buildInfo(String env, String version)
{
	System.out.println("the version is :"+version);
	System.out.println("the environment is :"+env);
}


}
