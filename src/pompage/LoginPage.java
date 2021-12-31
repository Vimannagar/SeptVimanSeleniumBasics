package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}

	public void loginWithCredentials() {
		WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));

		username.sendKeys("DAA677");

		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));

		password.sendKeys("Velocity@123");

		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
		
		loginbutton.click();
		
	}
	
	

}
