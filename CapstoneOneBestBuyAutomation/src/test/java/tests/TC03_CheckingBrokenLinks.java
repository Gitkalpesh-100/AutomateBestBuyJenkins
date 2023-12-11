package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.LogInPage;
import utils.UtilClass;

public class TC03_CheckingBrokenLinks extends ProjectSpecifications {
	@Test(priority = 1)
	public void CheckBrokenLinksTest() {

		HomePage home = new HomePage();
		home.chooseCountry();

		try {
			CaptureScreen("Snap3A1");
		} catch (IOException e) {
			e.printStackTrace();
		}

		home.CheckBrokenLink("https://www.bestbuy.com");

		try {
			CaptureScreen("Snap3A2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void CheckNonBrokenLinksTest() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.CheckBrokenLink("https://www.bestbuy.com");

		try {
			CaptureScreen("Snap3B1");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Assert.assertTrue(home.isLinkBroken(), "This is not a valid link");

		try {
			CaptureScreen("Snap3B2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


/*
<class name="tests.TC02_SignUpFunctionality"/>
		
			<class name="tests.TC03_CheckingBrokenLinks"/>
		
			<class name="tests.TC04_ValidateTitle"/>
		
			<class name="tests.TC05_ValidateBottomLinks"/>
*/