package base;

import java.net.URL;
import java.security.PublicKey;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.UtilClass;

public class ProjectSpecifications extends UtilClass{

	
	@BeforeMethod
	public void launchBrowser() {
		
		launch("Chrome");
	    url("https://www.bestbuy.com");
	     
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}