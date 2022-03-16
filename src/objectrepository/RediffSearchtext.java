package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffSearchtext {	

	WebDriver driver;
	
	public RediffSearchtext(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.xpath("//input[@id='srchword']");
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	
}
