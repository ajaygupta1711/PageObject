package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectrepository.OR;

public class OR1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		OR or = new OR(driver);
		or.googlesearch().sendKeys("Selenium" + Keys.ENTER);
		
	}

}
