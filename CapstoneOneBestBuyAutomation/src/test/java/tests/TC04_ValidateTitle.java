package tests; 

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC04_ValidateTitle extends ProjectSpecifications {

	@BeforeTest()
	public void setup() {
		sheetName = "ValidateTitleTest";
	}

	@Test(dataProvider = "getInputData")
	public void ValidateTitle(String title1, String title2, String title3, String title4) {
		
	
		HomePage home = new HomePage();
		home.chooseCountry();

		ValidateTitlePage vt = new ValidateTitlePage();
		vt.clickHolidayDeals(title1);
		vt.clickHolidayDeals(title2);
		vt.clickgiftCards(title3);
		
		
	}
}
		
		

