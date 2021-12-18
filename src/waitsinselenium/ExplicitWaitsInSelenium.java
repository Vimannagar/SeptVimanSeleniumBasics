package waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
	
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		// to wait till the element is clickable over the page or not
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
//		
//		
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		
		// to wait till the element is visible over the page or not
		
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//		
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
//		
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		
//		to wait until the checkbox got selected
		
//	driver.findElement(By.xpath("//*[@id='checkbox']")).click();
//	
//	wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
//		
//	driver.get("https://www.google.com/");
	
	
	// to wait till we dont get an alert pop up:
	
	driver.findElement(By.xpath("//*[@id='alert']")).click();
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().accept();
	
		
	}
	
	
	

}
