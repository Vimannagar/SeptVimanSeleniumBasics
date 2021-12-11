package launchingbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsToPrintDropdownValues {

	public static void main(String[] args) {
		
				
System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
				
					
	WebDriver driver = new ChromeDriver();
					
					// redirecting to a URL
		driver.manage().window().maximize();
					
					
		driver.get("https://www.facebook.com/signup");
					
					// to handle the dropdown using select tag:
					
					
//	 List<WebElement> day = driver.findElements(By.xpath("//*[@id='day']//option"));
//	
//	for(WebElement date :day)
//	{
//		String actualdate = date.getText();
//		System.out.println(actualdate);
//	}
					
				
		
		WebElement daydropdown = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select sel = new Select(daydropdown);
		
		List<WebElement> dayvalues = sel.getOptions();
		
		int numberofdayvalues = dayvalues.size();
		
		System.out.println("number of days available in the dropdown "+numberofdayvalues);
		
		for(int i=0; i<numberofdayvalues; i++)
		{
			String actualdate = dayvalues.get(i).getText();
			
			System.out.println(actualdate);
		}
		
					
					
					
	
	}

}
