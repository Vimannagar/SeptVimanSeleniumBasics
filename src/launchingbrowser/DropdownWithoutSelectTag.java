package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectTag {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-0-2']")).click();
		
	}

}
