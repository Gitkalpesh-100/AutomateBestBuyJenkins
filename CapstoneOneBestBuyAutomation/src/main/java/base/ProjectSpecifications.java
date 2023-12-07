package base;

import java.io.IOException;
import java.net.URL;
import java.security.PublicKey;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import utils.UtilClass;

public class ProjectSpecifications extends UtilClass {

	@BeforeMethod
	
	public void launchBrowser() {
		
		launch("Chrome");

		url("https://www.bestbuy.com");
	}

	@DataProvider(name = "getInputData")
	public String[][] getInputData() throws IOException {
		String[][] data = readExcel(sheetName);
		return data;	
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}