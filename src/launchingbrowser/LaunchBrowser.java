package launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		String b = "Chrome";
		
		WebDriver driver;
		if(b.equals("Chrome"))
		{
			driver = new ChromeDriver();
			
		} 	
		else
		{
			driver = new FirefoxDriver();
		}
		
		ChromeDriver d = new ChromeDriver();
		
		RemoteWebDriver rw = new ChromeDriver();
	}

}
