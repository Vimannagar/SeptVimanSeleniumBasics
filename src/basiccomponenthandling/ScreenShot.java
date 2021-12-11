package basiccomponenthandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.Screenshots;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");
						
							
			WebDriver driver = new ChromeDriver();
							
							// redirecting to a URL
				driver.manage().window().maximize();
							
							
				driver.get("https://www.facebook.com/signup");
				
				
//				TakesScreenshot scrshot = (TakesScreenshot)driver;
//				
//				File source = scrshot.getScreenshotAs(OutputType.FILE);
//				
//				File destination = new File("E:\\Desktop\\VimanNagar\\Sept 21\\Selenium\\Capturedscreenshots\\facebook.png");
//				
//				
//				FileHandler.copy(source, destination);
				
				
				Screenshots.captureScreenshot(driver, "secondscreenshot");
				

}
}
