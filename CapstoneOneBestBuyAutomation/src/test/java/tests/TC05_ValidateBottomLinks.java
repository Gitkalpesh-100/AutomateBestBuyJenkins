package tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import utils.UtilClass;

public class TC05_ValidateBottomLinks extends ProjectSpecifications {

	@Test
	public void validateBottomLinks() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll(); 
		home.Accessibility();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Accessibility - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll(); 
		home.TermsandConditons();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("BestBuy.com Terms and Conditions");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
		home.scroll(); 
		home.Privacy();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Privacy Policy Hub - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.InterestBasedAds();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Interest-Based Ads - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.StatePrivacyRights();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("State Privacy Rights - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.HealthDataPrivacy();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Privacy Policy Hub - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.DoNotSellOrShareMyPersonalInformation();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		home.scroll();
		
		home.LimitUseOfMySensitivePersonalInformation();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.validateTitle("Best Buy");
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.TargetedAdvertisingOptOut();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.CASupplyChainTransparencyAct();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("California Supply Chain Transparency Act - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	@Test
	public void validateBottomLinksNegative() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll(); 
		home.Accessibility();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Accessibility - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll(); 
		home.TermsandConditons();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("BestBuy.com Terms and Conditions");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
		home.scroll(); 
		home.Privacy();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Privacy Policy Hub - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.InterestBasedAds();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Interest-Based Ads - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.StatePrivacyRights();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("State Privacy Rights - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.HealthDataPrivacy();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Privacy Policy Hub - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.scroll();
		home.DoNotSellOrShareMyPersonalInformation();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.LimitUseOfMySensitivePersonalInformation();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.TargetedAdvertisingOptOut();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Start Request - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.CASupplyChainTransparencyAct();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("California Supply Chain Transparency Act - Best Bui");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}	
}
