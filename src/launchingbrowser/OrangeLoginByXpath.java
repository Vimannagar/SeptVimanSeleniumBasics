package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLoginByXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();
				
				// redirecting to a URL
				driver.manage().window().maximize();
				
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
				
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
				
				
				driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
				
				
				
				driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
				
				driver.findElement(By.xpath("(//*[@type='checkbox'])[4]")).click();
				
				
				

}

}