package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC04_ValidateTitle extends ProjectSpecifications {

	@Test(priority = 1)
	public void ValidateTitle() {
		HomePage home = new HomePage();
		home.chooseCountry();

		ValidateTitlePage vt = new ValidateTitlePage();
		
		/*
		 * vt.clickgiftCards(); try { CaptureScreen("giftCards1"); } catch (IOException
		 * e) { e.printStackTrace(); }
		 * vt.validateTitle("Gifts Cards and E-Gift Cards - Best Buy"); try {
		 * CaptureScreen("giftCards2"); } catch (IOException e) { e.printStackTrace(); }
		 * 
		 * 
		 * vt.clickGiftIdeas(); try { CaptureScreen("GiftIdeas1"); } catch (IOException
		 * e) { e.printStackTrace(); }
		 * 
		 * vt.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		 * try { CaptureScreen("GiftIdeas2"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 * 
		 * vt.clickTopDeals(); try { CaptureScreen("TopDeals1"); } catch (IOException e)
		 * { e.printStackTrace(); }
		 * home.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy"
		 * ); try { CaptureScreen("TopDeals2"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 * vt.clickDealOftheDay(); try { CaptureScreen("DealOfTheDay1"); } catch
		 * (IOException e) { e.printStackTrace(); }
		 * home.validateTitle("Deal of the Day: Electronics Deals - Best Buy"); try {
		 * CaptureScreen("DealOfTheDay2"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * //vt.clickMore();
		 * 
		 */

		/*
		 * vt.clickMore(); vt.clickyesBestBuySellsThat(); try {
		 * CaptureScreen("yesBestBuySellsThat1"); } catch(IOException e) {
		 * e.printStackTrace(); }
		 * vt.validateTitle("Yes, Best Buy Sells That - Best Buy"); try {
		 * CaptureScreen("yesBestBuySellsThat2"); }catch(IOException e) {
		 * e.printStackTrace(); }
		 */

		vt.clickMore();
		vt.clickyesBestBuySellsThat();
		try {
			CaptureScreen("YesBestBuySellsThat1");
		} catch (IOException e) {
			e.printStackTrace();
		}
	//	home.validateTitle("Yes, Best Buy Sells That - Best Buy");
		//System.out.println("");
		try {
			CaptureScreen("YesBestBuySellsThat2");
		} catch (IOException e) {
			e.printStackTrace();
		}

		vt.clickMore();
		vt.clickDonatetoStJude();
		try {
			CaptureScreen("DonatetoStJude1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.validateTitle("St. Jude Children's Research Hospital - Best Buy");
		try {
			CaptureScreen("DonatetoStJude2");
		} catch (IOException e) {
			e.printStackTrace();
		}

		vt.clickMore();
		vt.clickMyBestBuyMemberships();
		try {
			CaptureScreen("MyBestBuyMemberships1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.validateTitle("My Best Buy Memberships");
		try {
			CaptureScreen("MyBestBuyMemberships2");
		} catch (IOException e) {
			e.printStackTrace();
		}

		vt.clickMore();
		vt.clickCreditCards();
		try {
			CaptureScreen("CreditCards1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.validateTitle("Best Buy Credit Card: Rewards and Financing");
		try {
			CaptureScreen("CreditCards2");
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * vt.clickMore(); vt.clickBestBuyBusiness(); try {
		 * CaptureScreen("BestBuyBusiness1"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * home.validateTitle("Best Buy for Business - Best Buy"); try {
		 * CaptureScreen("BestBuyBusiness2"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */

		vt.clickMore();
		try {
			CaptureScreen("More1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.clickClose();
		try {
			CaptureScreen("Close1");
		} catch (IOException e) {
			e.printStackTrace();
		}

		vt.clickAccount1();
		home.clickSignIn1();
		try {
			CaptureScreen("SignIn11");
		} catch (IOException e) {
			e.printStackTrace();
		}
		home.validateTitle("Sign In to Best Buy");
		try {
			CaptureScreen("SignIn12");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.clickReturntopreviouspage();

		vt.RecentlyViewed();
		vt.ManageAllYourRecentlyViewedItems();
		try {
			CaptureScreen("ManageAllYourRecentlyViewedItems1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		home.validateTitle("Recently Viewed - Best Buy");
		try {
			CaptureScreen("ManageAllYourRecentlyViewedItems2");
		} catch (IOException e) {
			e.printStackTrace();
		}

		vt.OrderStatus();
		vt.clickContinueButton();
		try {
			CaptureScreen("ContinueButton1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.validateTitle("Sign In for Order Status");
		try {
			CaptureScreen("ContinueButton2");
		} catch (IOException e) {
			e.printStackTrace();
		}
		vt.clickReturntopreviouspage();

		vt.SavedItems();
		vt.SeeAllYourSavedItems();
		try {
			CaptureScreen("SeeAllYourSavedItems1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		home.validateTitle("Saved Items - Best Buy");
		try {
			CaptureScreen("SeeAllYourSavedItems2");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
}
