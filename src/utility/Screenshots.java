package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	public static void captureScreenshot(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("E:\\Desktop\\VimanNagar\\Sept 21\\Selenium\\Capturedscreenshots\\"+filename+".png");
		
		
		FileHandler.copy(source, destination);
		
	}

}
