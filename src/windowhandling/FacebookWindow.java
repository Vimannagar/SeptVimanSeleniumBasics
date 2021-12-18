package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// redirecting to a URL
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String parentid = driver.getWindowHandle();

		WebElement forgotpassword = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).click(forgotpassword).build().perform();

		Set<String> allwindowid = driver.getWindowHandles();
		
		for(String winid:allwindowid)
		{
			if(!(winid.equals(parentid)))
					{
				driver.switchTo().window(winid);
				driver.get("https://www.google.com/");
					}
		}

	}

}
