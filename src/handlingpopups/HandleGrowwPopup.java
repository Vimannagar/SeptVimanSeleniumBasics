package handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGrowwPopup {
	
	public static void main(String[] args) throws InterruptedException{
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://groww.in/");
		
		driver.findElement(By.xpath("(//*[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
		
		
		
		
	}

}
