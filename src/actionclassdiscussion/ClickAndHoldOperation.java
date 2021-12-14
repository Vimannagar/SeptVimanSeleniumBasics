package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldOperation {

	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://jqueryui.com/slider/");
		
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);// to go into iframe
		
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(slider).moveByOffset(275, 0).moveByOffset(-20, 0).release().build().perform();
		
		
		driver.switchTo().parentFrame();// to move out from iframe
		
		driver.findElement(By.xpath("(//*[@class='menu-item'])[1]")).click();
		
		
	}
	
	
	
}
