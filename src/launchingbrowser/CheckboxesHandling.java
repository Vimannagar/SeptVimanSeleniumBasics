package launchingbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesHandling {
	
	
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
		
		
		WebElement checkbox = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[3]"));
		
		boolean isoperable = checkbox.isEnabled();
		
		System.out.println("Checkbox is enable : "+isoperable);
		
		
		boolean ischecked = checkbox.isSelected();
			

		System.out.println("Checkbox is selected : "+ischecked);
		
		checkbox.click();
		
		boolean afterclick = checkbox.isSelected();
		
		System.out.println("Checkbox selected after click :"+afterclick);
		
		
		
	WebElement searchbutton = driver.findElement(By.xpath("//*[@id='searchBtn']"));
	
	boolean isdisplay = searchbutton.isDisplayed();
	
	System.out.println("search button status "+isdisplay);
		
		
	}

}
