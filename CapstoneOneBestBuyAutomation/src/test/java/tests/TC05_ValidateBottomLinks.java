package tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidataBottomLinksPage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC05_ValidateBottomLinks extends ProjectSpecifications {

	@Test
	public void validateBottomLinks() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll(); 
		
		ValidateTitlePage vt = new ValidateTitlePage();
		ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();
		
		
		vbl.Accessibility();
		try {
			CaptureScreen("Snap5A1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Accessibility - Best Buy");
		try {
			CaptureScreen("Snap5A2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll(); 
		vbl.TermsandConditons();
		try {
			CaptureScreen("Snap5A3");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("BestBuy.com Terms and Conditions");
		try {
			CaptureScreen("Snap5A4");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
		home.scroll(); 
		vbl.Privacy();
		try {
			CaptureScreen("Snap5A5");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Privacy Policy Hub - Best Buy");
		try {
			CaptureScreen("Snap5A6");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.InterestBasedAds();
		try {
			CaptureScreen("Snap5A7");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Interest-Based Ads - Best Buy");
		try {
			CaptureScreen("Snap5A8");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.StatePrivacyRights();
		try {
			CaptureScreen("Snap5A9");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("State Privacy Rights - Best Buy");
		try {
			CaptureScreen("Snap5A10");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.HealthDataPrivacy();
		try {
			CaptureScreen("Snap5A11");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Privacy Policy Hub - Best Buy");
		try {
			CaptureScreen("Snap5A12");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.DoNotSellOrShareMyPersonalInformation();
		try {
			CaptureScreen("Snap5A13");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Start Request - Best Buy");
		try {
			CaptureScreen("Snap5A14");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		home.scroll();
		
		vbl.LimitUseOfMySensitivePersonalInformation();
		try {
			CaptureScreen("Snap5A14");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy");
		try {
			CaptureScreen("Snap5A15");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.validateTitle("Best Buy");
		vt.clickReturntopreviouspage();
		
		home.scroll();
		vbl.TargetedAdvertisingOptOut();
		try {
			CaptureScreen("Snap5A16");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
			CaptureScreen("Snap5A17");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		home.scroll();
		vbl.CASupplyChainTransparencyAct();
		try {
			CaptureScreen("Snap5A18");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("California Supply Chain Transparency Act - Best Buy");
		try {
			CaptureScreen("Snap5A19");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	@Test
	public void validateBottomLinksNegative() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll(); 
		
		ValidateTitlePage vt = new ValidateTitlePage();
		ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();
		
		vbl.Accessibility();
		try {
			CaptureScreen("Snap5B1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Accessibility - Best Buy");
		try {
			CaptureScreen("Snap5B2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll(); 
		vbl.TermsandConditons();
		try {
			CaptureScreen("Snap5B3");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("BestBuy.com Terms and Conditions");
		try {
			CaptureScreen("Snap5B4");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
		home.scroll(); 
		vbl.Privacy();
		try {
			CaptureScreen("Snap5B5");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Privacy Policy Hub - Best Buy");
		try {
			CaptureScreen("Snap5B6");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.InterestBasedAds();
		try {
			CaptureScreen("Snap5B7");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("Interest-Based Ads - Best Buy");
		try {
			CaptureScreen("Snap5B8");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.StatePrivacyRights();
		try {
			CaptureScreen("Snap5B9");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("State Privacy Rights - Best Buy");
		try {
			CaptureScreen("Snap5B10");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.HealthDataPrivacy();
		try {
			CaptureScreen("Snap5B11");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Privacy Policy Hub - Best Buy");
		try {
			CaptureScreen("Snap5B12");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		vbl.DoNotSellOrShareMyPersonalInformation();
		try {
			CaptureScreen("Snap5B13");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
			CaptureScreen("Snap5B14");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		home.scroll();
		vbl.LimitUseOfMySensitivePersonalInformation();
		try {
			CaptureScreen("Snap5B15");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy");
		try {
			CaptureScreen("Snap5B16");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		home.scroll();
		vbl.TargetedAdvertisingOptOut();
		try {
			CaptureScreen("Snap5B17");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
			CaptureScreen("Snap5B18");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		home.scroll();
		vbl.CASupplyChainTransparencyAct();
		try {
			CaptureScreen("Snap5B19");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vbl.validateTitle("California Supply Chain Transparency Act - Best Bui");
		try {
			CaptureScreen("Snap5B20");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}	
}
