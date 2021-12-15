package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	
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
				
				
				for(String winid:allwindowid)
				{
					// to switch to the child id and perform the actions
					if(!(winid.equalsIgnoreCase(parentid)))
					{
						driver.switchTo().window(winid);
						driver.findElement(By.xpath("//*[@class='btn-orange contact-ohrm ']")).click();
						
						driver.get("https://www.google.com/");
					}
					System.out.println(winid);
				}
				
				driver.close();// close the child window i.e current window id
				
//				To switch again to the parent id and perform the actions
				driver.switchTo().window(parentid);
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
				
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
				
				
				driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
				
				
				
				
				
				
				
	}
	

}
