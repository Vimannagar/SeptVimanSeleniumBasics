package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitGroww {
	

		public static void main(String[] args) throws InterruptedException{
			
			
			System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
				
				
				WebDriver driver = new ChromeDriver();
				
				// redirecting to a URL
				driver.manage().window().maximize();
				
				
				driver.get("https://groww.in/");
				
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//*[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")).click();
				
				
				driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity.ctc@gmail.com");
				
				
				driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Continue']")).click();
				
				driver.findElement(By.xpath("//*[@id='login_password1']")).sendKeys("Abc1234");
				
	}

}
