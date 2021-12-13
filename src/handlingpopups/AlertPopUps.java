package handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUps {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclickbutton).perform();
		
		Thread.sleep(2000);
		
	String textonalert = driver.switchTo().alert().getText();
	
	System.out.println(textonalert);
		
	driver.switchTo().alert().accept();// to click on ok button
	
	
	
	driver.findElement(By.xpath("//*[@name='confirmation']")).click();
	
	Thread.sleep(2000);
	
	
	driver.switchTo().alert().dismiss();// to click on cancel button
	
	
	// to upload a file:
	
	
	driver.findElement(By.xpath("//*[@name='upload']")).sendKeys("E:\\Desktop\\VimanNagar\\May 21\\SeptVimanSeleniumBasics\\Screenshots\\secondscreenshot.png");
		
		
}
}
