package waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitScenario {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), false));
			
		driver.get("https://www.google.com/");
		
		
		
	}

}
