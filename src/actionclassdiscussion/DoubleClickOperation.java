package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOperation {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclickbutton).perform();
		
		
		
}

}
