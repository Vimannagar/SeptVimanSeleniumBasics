package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	
	
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Desktop\\VimanNagar\\Sept 21\\Selenium jar\\chromedriver 96\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			// redirecting to a URL
			driver.manage().window().maximize();

			driver.get("https://jqueryui.com/droppable/");
			
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
			driver.switchTo().frame(iframe);// to go into iframe
			
			
			WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
			
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();

	}

}
