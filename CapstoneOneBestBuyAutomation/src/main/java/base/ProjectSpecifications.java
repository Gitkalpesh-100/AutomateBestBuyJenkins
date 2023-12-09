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
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser_option ) {
    System.out.println("Paramater ="+browser_option);
		
		launch(browser_option);

		url("https://www.bestbuy.com");
	}

	@DataProvider(name = "getInputData")
	public String[][] getInputData() throws IOException {
		String[][] data = readExcel(sheetName);
		return data;	
	}
	
	/*
	@DataProvider(name = "getInputData_2")
	public String[][] getInputData_2() throws IOException {
		String[][] data = new String[][]{{"Test","Test123"}};
		return data;	
	}
*/
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}