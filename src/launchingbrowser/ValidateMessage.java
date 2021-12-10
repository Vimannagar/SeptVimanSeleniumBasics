package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateMessage {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("addmin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
		
		String messagestring = message.getText();
		
		System.out.println(messagestring);
		
		if(messagestring.equals("Invalid credentials"))
		{
			System.out.println("Test case passed");
		}
		else 
		{
			System.out.println("test case failed please file an issue");
		}
	
	}

}
