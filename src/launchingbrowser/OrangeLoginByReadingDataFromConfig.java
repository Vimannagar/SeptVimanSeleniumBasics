package launchingbrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ReadConfigData;

public class OrangeLoginByReadingDataFromConfig {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();
				
				// redirecting to a URL
				driver.manage().window().maximize();
				
				
				driver.get(ReadConfigData.getDataFromConfig("url"));
				
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(ReadConfigData.getDataFromConfig("username"));
				
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(ReadConfigData.getDataFromConfig("password"));
				
				
				driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
				
				
				
				driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
				
				driver.findElement(By.xpath("(//*[@type='checkbox'])[4]")).click();
				
				
				

}

}