package waitsinselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitsInSelenium {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofNanos(9));
		
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		
		
	}

}
