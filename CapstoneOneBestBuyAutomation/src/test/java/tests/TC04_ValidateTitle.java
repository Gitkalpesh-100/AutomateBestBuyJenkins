package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidateTitlePage;
import stepdefinitions.BestBuySignUpAndLogin;
import utils.UtilClass;

public class TC04_ValidateTitle extends ProjectSpecifications{

	@Test(priority = 1)
	public void ValidateTitle() {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		ValidateTitlePage vt = new ValidateTitlePage();
		
		
		vt.clickTopDeals();
		try {
		    CaptureScreen("Snap4A1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    home.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy");
	    try {
		    CaptureScreen("Snap4A2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    
	    vt.clickDealOftheDay();
		try {
		    CaptureScreen("Snap4A3");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Deal of the Day: Electronics Deals - Best Buy");
		try {
		    CaptureScreen("Snap4A");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMyBestBuyMemberships();
		try {
		    CaptureScreen("Snap4A5");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("My Best Buy Memberships");
		try {
		    CaptureScreen("Snap4A6");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickgiftCards();
		try {
		    CaptureScreen("Snap4A7");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Gifts Cards and E-Gift Cards - Best Buy");
		try {
		    CaptureScreen("Snap4A8");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickGiftIdeas();
		try {
		    CaptureScreen("Snap4A9");
		} catch (IOException e) {
		    e.printStackTrace();
		}
        
	//	vt.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		try {
		    CaptureScreen("Snap4A10");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		vt.clickMore();
		vt.clickDonatetoStJude();
		try {
		    CaptureScreen("Snap4A11");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("St. Jude Children's Research Hospital - Best Buy");
		try {
		    CaptureScreen("Snap4A12");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickBestBuyBusiness();
		try {
		    CaptureScreen("Snap4A13");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy for Business - Best Buy");
		try {
		    CaptureScreen("Snap4A14");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		try {
		    CaptureScreen("Snap4A15");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickClose();
		try {
		    CaptureScreen("Snap4A16");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		vt.clickAccount1();
		home.clickSignIn1();
		try {
		    CaptureScreen("Snap4A17");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Sign In to Best Buy");
		try {
		    CaptureScreen("Snap4A18");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		vt.RecentlyViewed();
		vt.ManageAllYourRecentlyViewedItems();
		try {
		    CaptureScreen("Snap4A19");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Recently Viewed - Best Buy");
		try {
		    CaptureScreen("Snap4A20");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.OrderStatus();
		vt.clickContinueButton();
		try {
		    CaptureScreen("Snap4A21");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Sign In for Order Status");
		try {
		    CaptureScreen("Snap4A22");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		vt.SavedItems();
		vt.SeeAllYourSavedItems();
		try {
		    CaptureScreen("Snap4A23");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Saved Items - Best Buy");
		try {
		    CaptureScreen("Snap4A24");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}	
	
	@Test(priority = 2)
	public void NegativeValidateTitle() {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		ValidateTitlePage vt = new ValidateTitlePage();
		
		vt.clickTopDeals();
		try {
			 CaptureScreen("Snap4B1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy");
	    try {
	    	 CaptureScreen("Snap4B2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    
	    vt.clickDealOftheDay();
		try {
			 CaptureScreen("Snap4B3");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Deal of the Day: Electronics Deals - Best Buy");
		try {
			CaptureScreen("Snap4B4");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMyBestBuyMemberships();
		try {
			CaptureScreen("Snap4B4");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("My Best Buy Memberships");
		try {
			CaptureScreen("Snap4B5");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickgiftCards();
		try {
			CaptureScreen("Snap4B6");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Gifts Cards and E-Gift Cards - Best Buy");
		try {
			CaptureScreen("Snap4B7");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickGiftIdeas();
		try {
			CaptureScreen("Snap4B8");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	//	vt.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		try {
			CaptureScreen("Snap4B9");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickDonatetoStJude();
		try {
			CaptureScreen("Snap4B10");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("St. Jude Children's Research Hospital - Best Buy");
		try {
			CaptureScreen("Snap4B11");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickBestBuyBusiness();
		try {
			CaptureScreen("Snap4B12");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Best Buy for Business - Best Buy");
		try {
			CaptureScreen("Snap4B13");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.clickMore();
		vt.clickClose();
		
		
		vt.clickAccount1();
		home.clickSignIn1();
		try {
			CaptureScreen("Snap4B14");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Sign In to Best Buy");
		try {
			CaptureScreen("Snap4B15");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		vt.RecentlyViewed();
		vt.ManageAllYourRecentlyViewedItems();
		try {
			CaptureScreen("Snap4B16");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Recently Viewed - Best Buy");
		try {
			CaptureScreen("Snap4B17");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		vt.OrderStatus();
		vt.clickContinueButton();
		try {
			CaptureScreen("Snap4B18");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Sign In for Order Status");
		try {
			CaptureScreen("Snap4B19");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.clickReturntopreviouspage();
		
		vt.SavedItems();
		vt.SeeAllYourSavedItems();
		try {
			CaptureScreen("Snap4B20");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		vt.validateTitle("Saved Items - Best Bui");	
		try {
			CaptureScreen("Snap4B21");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}	
}
