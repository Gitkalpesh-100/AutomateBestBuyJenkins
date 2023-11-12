package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import stepdefinitions.BestBuySignUpAndLogin;

public class TC04_ValidateTitle extends ProjectSpecifications{

	@Test
	public void ValidateTitle() {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		home.clickTopDeals();
	    home.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy");
	    
		home.clickDealOftheDay();
		home.validateTitle("Deal of the Day: Electronics Deals - Best Buy");
		
		home.clickMyBestBuyMemberships();
		home.validateTitle("My Best Buy Memberships");
		
		/*home.clickMore();
		home.clickCreditCards();
		home.validateTitle("Best Buy Credit Card: Rewards & Financing");
*/
		
		home.clickMore();
		home.clickgiftCards();
		home.validateTitle("Gifts Cards and E-Gift Cards - Best Buy");
		
		
		/*home.clickMore();
        home.clickYesBestBuySellsThat();
        home.validateTitle("Yes, Best Buy Sells That - Best Buy");
			*/
		home.clickMore();
		home.clickGiftIdeas();
		home.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		
		home.clickMore();
		home.clickDonatetoStJude();
		home.validateTitle("St. Jude Children's Research Hospital - Best Buy");
		
		/*home.clickMore();
		home.clickBestBuyOutlet();
		home.validateTitle("Best Buy Outlet: Clearance Electronics Outlet Store - Best Buy");
		*/
		
		home.clickMore();
		home.clickBestBuyBusiness();
		home.validateTitle("Best Buy for Business - Best Buy");
		
		home.clickMore();
		home.clickClose();
		
		
		home.clickAccount1();
		home.clickSignIn1();
		home.validateTitle("Sign In to Best Buy");
		
		home.clickReturntopreviouspage();
		
		/*home.clickAccount1();
		home.validateTitle("Best Buy: Create an Account");
		*/
		
		home.RecentlyViewed();
		home.ManageAllYourRecentlyViewedItems();
		home.validateTitle("Recently Viewed - Best Buy");
		
		home.OrderStatus();
		home.clickContinueButton();
		home.validateTitle("Sign In for Order Status");
		home.clickReturntopreviouspage();
		home.SavedItems();
		home.SeeAllYourSavedItems();
		home.validateTitle("Saved Items - Best Buy");
		
		
		
	}
	
	
}
