package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.ProjectSpecifications;

public class HeadlessChrome {
	
	@Test
	public void Headless() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		//options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.bestbuy.com");
		System.out.println(driver.getTitle());
		
	}

}
