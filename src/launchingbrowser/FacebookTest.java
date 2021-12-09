package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@a.com");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		
//driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
	}

}
