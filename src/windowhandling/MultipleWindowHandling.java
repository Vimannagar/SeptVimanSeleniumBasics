package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();
				
				// redirecting to a URL
				driver.manage().window().maximize();
				
								
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
			String parentid = driver.getWindowHandle();
			
			System.out.println("Parent window id is: "+parentid);
				
				
				driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
				driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
				driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
				
				
				Set<String> allwindowid = driver.getWindowHandles();	
	
		int numberofid = allwindowid.size();
		
		String [] winid= new String[numberofid];
		int i =0;
		for(String id :allwindowid)
		{
			winid[i]= id;
			i++;
		}
		
		
		for(String ids :winid)
		{
			System.out.println(ids);
			
		}
		
		
		driver.switchTo().window(winid[1]);
		driver.get("https://www.google.com/");
		
		
		
		
		
		
		
	
				
	}
				

}
