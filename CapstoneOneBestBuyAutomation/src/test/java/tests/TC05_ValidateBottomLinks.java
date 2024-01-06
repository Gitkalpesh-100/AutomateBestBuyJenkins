package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidataBottomLinksPage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC05_ValidateBottomLinks extends ProjectSpecifications {
	
	
	
	vbl.Accessibility();
	try 
	{
		CaptureScreen("Accessbility1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vbl.validateTitle("Accessibility - Best Buy");
	try 
	{
		CaptureScreen("Accessbility2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}

	home.scroll();
	
	
	vbl.TermsandConditons();
	try 
	{
		CaptureScreen("TermsAndConditions1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vbl.validateTitle("BestBuy.com Terms and Conditions");
	try 
	{
		CaptureScreen("TermsAndConditions2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}

	home.scroll();
	
	
	vbl.Privacy();
	try 
	{
		CaptureScreen("PrivacyPolicy1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vbl.validateTitle("Privacy Policy Hub - Best Buy");
	try 
	{
		CaptureScreen("PrivacyPolicy2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}

	
	home.scroll();
	
	vbl.InterestBasedAds();
	try 
	{
		CaptureScreen("Interest-BasedAds1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vbl.validateTitle("Interest-Based Ads - Best Buy");
	try 
	{
		CaptureScreen("Interest-BasedAds2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}

	
	home.scroll();
	
	
	vbl.StatePrivacyRights();
	try 
	{
		CaptureScreen("StatePrivcyRights1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vbl.validateTitle("State Privacy Rights - Best Buy");
	try 
	{
		CaptureScreen("StatePrivacyRights2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}

	home.scroll();
	
	vbl.HealthDataPrivacy();
	try 
	{
		CaptureScreen("HealthDataPrivacy1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	//vbl.validateTitle("Privacy Policy Hub - Best Buy");
	try 
	{
		CaptureScreen("HealthDataPrivacy2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}

	
	home.scroll();
	vbl.DoNotSellOrShareMyPersonalInformation();
	try 
	{
		CaptureScreen("MyPersonalInfo1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vbl.validateTitle("Start Request - Best Buy");
	try 
	{
		CaptureScreen("MyPersonalInfo2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	vt.clickReturntopreviouspage();
	home.scroll();

	vbl.LimitUseOfMySensitivePersonalInformation();
	try 
	{
		CaptureScreen("SensitiveInfo1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	home.validateTitle("Best Buy");
	try 
	{
		CaptureScreen("SensitiveInfo2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	

	home.validateTitle("Best Buy");
	vt.clickReturntopreviouspage();

	home.scroll();
	
	vbl.TargetedAdvertisingOptOut();
	try 
	{
		CaptureScreen("TargetedAdvertising1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	home.validateTitle("Start Request - Best Buy");
	try 
	{
		CaptureScreen("TargetedAdvertising2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	vt.clickReturntopreviouspage();

	home.scroll();
	
	vbl.CASupplyChainTransparencyAct();
	try 
	{
		CaptureScreen("TransparencyAct1");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	
	
	home.validateTitle("California Supply Chain Transparency Act - Best Buy");
	try 
	{
		CaptureScreen("TransperancyAct2");
	} 
	catch (IOException e) 
	{
	    e.printStackTrace();
	}
	

	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@BeforeTest()
	public void setup() {
		sheetName = "ValidateBottomLinks";// same name for the sheet in excel sheet
	}

	@Test(dataProvider = "getInputData")
	public void validateBottomLinks(String Title1, String Title2, String Title3, String Title4, String Title5, String Title6,
			String Title7, String Title8, String Title9, String Title10, String Title11, String Title12, String Title13,
			String Title14, String Title15, String Title16, String Title17, String Title18, String Title19,
			String Title20) {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll();

		ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();
		vbl.clickaccessibility(Title1);
		vbl.clickaccessibility(Title2);
		vbl.clickTermsandConditons(Title3);
		vbl.clickTermsandConditons(Title4);
		vbl.clickPrivacy(Title5);
		vbl.clickPrivacy(Title6);
		vbl.clickInterestBasedAds(Title7);
		vbl.clickInterestBasedAds(Title8);
		vbl.clickStatePrivacyRights(Title9);
		vbl.clickStatePrivacyRights(Title10);
		vbl.clickHealthDataPrivacy(Title11);
		vbl.clickHealthDataPrivacy(Title12);
		vbl.clickDoNotSellOrShareMyPersonalInformation(Title13);
		vbl.clickDoNotSellOrShareMyPersonalInformation(Title14);
		vbl.clickLimitUseOfMySensitivePersonalInformation(Title15);
		vbl.clickLimitUseOfMySensitivePersonalInformation(Title16);
		vbl.clickTargetedAdvertisingOptOut(Title17);
		vbl.clickTargetedAdvertisingOptOut(Title18);
		vbl.clickCASupplyChainTransparencyAct(Title19);
		vbl.clickCASupplyChainTransparencyAct(Title20);
		}
	}



/*


List<WebElement> menuLink = vbl.getbottomlinkname();

for (WebElement menuItem : menuLink) {

	menuItem.click();
*/
	*/