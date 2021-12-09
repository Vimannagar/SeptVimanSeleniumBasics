package launchingbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicComponents {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.co.in/");
		
		// to go back to the previous url
		
		driver.navigate().back();
		
		
		// to go forward 
		
		driver.navigate().forward();
	
		// to refresh the current browser tab
		driver.navigate().refresh();
		
		// to maximize the window size
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
	
	

}
