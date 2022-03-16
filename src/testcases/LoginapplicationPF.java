package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import objectrepository.RediffLoginpagePF;
import objectrepository.RediffSearchtext;

public class LoginapplicationPF {

// Login page class implemented in normal page object pattern style	
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpagePF rpf = new RediffLoginpagePF(driver);
		rpf.username().sendKeys("Hello");
		rpf.password().sendKeys("Hello");
		rpf.signin().click();
		driver.navigate().to("https://www.rediff.com/");
		
// // Search page class implemented in normal page object pattern style		
		
		RediffSearchtext rs = new RediffSearchtext(driver);
		rs.Search().sendKeys("test");
		
	}
	
}