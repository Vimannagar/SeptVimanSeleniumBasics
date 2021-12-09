package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		// redirecting to a URL
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// to get the current url:
	String	url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	//id
	
	WebElement username = driver.findElement(By.id("txtUsername"));
	
	username.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.id("txtPassword"));
	
	password.sendKeys("admin123");
	
	// classname
//	WebElement loginbutton = driver.findElement(By.className("button"));
	
//	WebElement loginbutton = driver.findElement(By.id("btnLogin"));
	
//	loginbutton.click();
	
		// linktext
	//WebElement	link= driver.findElement(By.linkText("OrangeHRM, Inc"));
	//
	//link.click();
		
		// partial link text
//		WebElement forgetlink = driver.findElement(By.partialLinkText("word?"));
//		
//		forgetlink.click();
		
		

	
	// name
	
	WebElement loginbutton = driver.findElement(By.name("Submit"));

		loginbutton.click();
		driver.findElement(By.name("Submit")).click();
		
		
		
		//tagname
		
		driver.findElement(By.tagName("input"));
		
		
	}

}
