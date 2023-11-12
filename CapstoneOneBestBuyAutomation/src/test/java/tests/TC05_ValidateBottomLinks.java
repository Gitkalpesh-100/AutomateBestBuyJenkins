package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC05_ValidateBottomLinks extends ProjectSpecifications {

	@Test
	public void validateBottomLinks() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll(); 
		home.Accessibility();
		home.validateTitle("Accessibility - Best Buy");

		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		home.scroll(); 
		home.TermsandConditons();
		home.validateTitle("BestBuy.com Terms and Conditions");
	
		home.scroll(); 
		home.Privacy();
		home.validateTitle("Privacy Policy Hub - Best Buy");
		
		home.scroll();
		home.InterestBasedAds();
		home.validateTitle("Interest-Based Ads - Best Buy");
		
		home.scroll();
		home.StatePrivacyRights();
		home.validateTitle("State Privacy Rights - Best Buy");
		
		home.scroll();
		home.HealthDataPrivacy();
		home.validateTitle("Privacy Policy Hub - Best Buy");
		
		home.scroll();
		home.DoNotSellOrShareMyPersonalInformation();
		home.validateTitle("Start Request - Best Buy");
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.LimitUseOfMySensitivePersonalInformation();
		home.validateTitle("Best Buy");
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.TargetedAdvertisingOptOut();
		home.validateTitle("Start Request - Best Buy");
		home.clickReturntopreviouspage();
		
		home.scroll();
		home.CASupplyChainTransparencyAct();
		home.validateTitle("California Supply Chain Transparency Act - Best Buy");
		
		
		
	}

}
