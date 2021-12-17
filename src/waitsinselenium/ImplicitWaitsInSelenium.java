package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitsInSelenium {

	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement searchfield = driver.findElement(By.xpath("//*[@name='q']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(searchfield, "India").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//*[text()='Central Bank of India']")).click();
		
		
		
		
		
	}
}
