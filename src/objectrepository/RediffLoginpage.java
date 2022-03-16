package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.id("login1");
	By password = By.id("password");
	By signin = By.name("proceed");
	
	// Create Methods
	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
}
