package basiccomponenthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();
				
				// redirecting to a URL
				driver.manage().window().maximize();
				
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
				
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
				
				
				driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
				
				
				
				driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
			
				WebElement checkbox = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[40]"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//to scroll by pixel value forward and reverse direction
//				js.executeScript("window.scrollBy(0, 400)");
				
//				Thread.sleep(2000);
				
				
//				js.executeScript("window.scrollBy(0, -200)");
				
				// to scroll upto a particular webelement
				
				js.executeScript("arguments[0].scrollIntoView();",checkbox );
				
				checkbox.click();

}}
