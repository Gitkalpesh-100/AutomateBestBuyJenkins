package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import stepdefinitions.BestBuySignUpAndLogin;
import utils.UtilClass;

public class TC04_ValidateTitle extends ProjectSpecifications{

	@Test(priority = 1)
	public void ValidateTitle() {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		home.clickTopDeals();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    home.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy");
	    try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    
		home.clickDealOftheDay();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Deal of the Day: Electronics Deals - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMyBestBuyMemberships();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("My Best Buy Memberships");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickgiftCards();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Gifts Cards and E-Gift Cards - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickGiftIdeas();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		home.clickMore();
		home.clickDonatetoStJude();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("St. Jude Children's Research Hospital - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickBestBuyBusiness();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy for Business - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickClose();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		home.clickAccount1();
		home.clickSignIn1();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Sign In to Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.RecentlyViewed();
		home.ManageAllYourRecentlyViewedItems();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Recently Viewed - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.OrderStatus();
		home.clickContinueButton();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Sign In for Order Status");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.SavedItems();
		home.SeeAllYourSavedItems();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Saved Items - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}	
	
	@Test(priority = 2)
	public void NegativeValidateTitle() {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		home.clickTopDeals();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    home.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy");
	    try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    
		home.clickDealOftheDay();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Deal of the Day: Electronics Deals - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMyBestBuyMemberships();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("My Best Buy Memberships");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickgiftCards();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Gifts Cards and E-Gift Cards - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickGiftIdeas();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickDonatetoStJude();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("St. Jude Children's Research Hospital - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickBestBuyBusiness();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Best Buy for Business - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.clickMore();
		home.clickClose();
		
		
		home.clickAccount1();
		home.clickSignIn1();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Sign In to Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.RecentlyViewed();
		home.ManageAllYourRecentlyViewedItems();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Recently Viewed - Best Buy");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.OrderStatus();
		home.clickContinueButton();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Sign In for Order Status");
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.clickReturntopreviouspage();
		
		home.SavedItems();
		home.SeeAllYourSavedItems();
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		home.validateTitle("Saved Items - Best Bui");	
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}	
}
