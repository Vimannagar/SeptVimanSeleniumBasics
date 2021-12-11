package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		Thread.sleep(2000);	
		
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
	
	
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
		Actions act = new Actions(driver);
		WebElement jan = driver.findElement(By.xpath("//*[@id='select-item-select-0-0']"));
		
		
		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].scrollIntoView(true);", optionList.get(17) );
		for(int i=1; i<13; i++)
		{			
			WebElement element = driver.findElement(By.xpath("//*[@id='select-item-select-0-"+i+"']"));
			String name = element.getText();
		if(name.equalsIgnoreCase("oct"))
		{
			element.click();
			break;
			
		}
		else
		{
			act.sendKeys(element, Keys.ARROW_DOWN).build().perform();
		}
		}
	}

}
