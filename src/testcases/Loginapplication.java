package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.RediffLoginpage;
import objectrepository.RediffSearchtext;

public class Loginapplication {

	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.Email().sendKeys("Hello");
		rd.password().sendKeys("Hello");
		rd.signin().click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.rediff.com/");
	
		RediffSearchtext rs = new RediffSearchtext(driver);
		rs.Search().sendKeys("test");
		
	}
	
}