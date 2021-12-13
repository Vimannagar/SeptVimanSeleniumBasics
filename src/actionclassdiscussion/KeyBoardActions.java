package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// redirecting to a URL
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));

		Actions act = new Actions(driver);
		
		act.click(firstname).sendKeys("Velocity").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Corporate")
		.sendKeys(Keys.TAB).sendKeys("9988776655")
		.build().perform();
		
		
		
	}

}
