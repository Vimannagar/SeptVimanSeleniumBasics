package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();
				
				// redirecting to a URL
				driver.manage().window().maximize();
				
								
				driver.get("https://www.google.com/");
				
			WebElement gmail = driver.findElement(By.xpath("//*[text()='Gmail']"));
			
			Actions act = new Actions(driver);
			
			
			act.keyDown(Keys.CONTROL).click(gmail).build().perform();
			
			
//			act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
			
				
				

}
	
}
