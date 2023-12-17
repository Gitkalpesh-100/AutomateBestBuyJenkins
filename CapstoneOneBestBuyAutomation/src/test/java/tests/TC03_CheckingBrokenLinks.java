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

		home.BrokenLink();
		
		try {
			CaptureScreen("Snap3A1");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			CaptureScreen("Snap3A2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}