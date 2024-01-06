package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC04_ValidateTitle extends ProjectSpecifications {

	@Test()
	public void validatetitle() {

		HomePage home = new HomePage();
		home.chooseCountry(); 
		ValidateTitlePage vt = new ValidateTitlePage();

		vt.clickTopDeals("Top Deals and Featured Offers on Electronics - Best Buy");
		vt.clickDealOftheDay("Deal of the Day: Electronics Deals - Best Buy");
		vt.clickyesBestBuySellsThat("Yes, Best Buy Sells That - Best Buy");
		vt.clickMyBestBuyMemberships("");
		vt.clickMore();
		vt.clickGiftCards("");
		vt.clickMore();
		vt.clickGiftIdeas("");
		vt.clickMore();
		vt.clickDonatetoStJude("");
		vt.clickClose();
		vt.clickAccount1();
		vt.clickCreateAccount1("");
		vt.clickReturntopreviouspage();
		vt.clickAccount1();
		vt.clickSignIn1("");
		vt.clickReturntopreviouspage();
		vt.clickRecentlyViewed("");
		vt.clickManageAllYourRecentlyViewedItems();
		vt.clickOrderStatus("");
		vt.clickContinueButton();
		vt.clickReturntopreviouspage();     
		vt.clickSavedItems("");
		vt.clickSeeAllYourSavedItems();
}
}




/*
 * @BeforeTest() public void setup() { sheetName = "ValidateTitleTest1"; }
 * 
 * @Test(dataProvider = "getInputData") public void ValidateTitle(String Title1,
 * String Title2, String Title3, String Title4, String Title5, String Title6,
 * String Title7, String Title8, String Title9, String Title10, String Title11,
 * String Title12, String Title13, String Title14, String Title15, String
 * Title16, String Title17, String Title18, String Title19, String Title20,
 * String Title21, String Title22, String Title23, String Title24, String
 * Title25, String Title26, String Title27) {
 * 
 * HomePage home = new HomePage(); home.chooseCountry();
 * 
 * ValidateTitlePage vt = new ValidateTitlePage(); //
 * vt.clickHolidayDeals(Title1); // vt.clickHolidayDeals(Title2);
 * 
 * vt.clickTopDeals(Title7); vt.clickTopDeals(Title8);
 * vt.clickDealOftheDay(Title9); vt.clickDealOftheDay(Title10);
 * vt.clickyesBestBuySellsThat(Title11); vt.clickyesBestBuySellsThat(Title12);
 * vt.clickMyBestBuyMemberships(Title13); vt.clickMyBestBuyMemberships(Title14);
 * vt.clickAccount1(); vt.clickCreateAccount1(Title19);
 * vt.clickReturntopreviouspage(Title27); vt.clickAccount1();
 * vt.clickCreateAccount1(Title20); vt.clickReturntopreviouspage(Title27);
 * vt.clickAccount1(); vt.clickSignIn1(Title17);
 * vt.clickReturntopreviouspage(Title27); vt.clickAccount1();
 * vt.clickSignIn1(Title18); vt.clickReturntopreviouspage(Title27);
 * 
 * 
 * vt.clickRecentlyViewed(Title21); vt.clickRecentlyViewed(Title22);
 * vt.clickOrderStatus(Title23); vt.clickOrderStatus(Title24);
 * vt.clickSavedItems(Title25); vt.clickSavedItems(Title26);
 * 
 * vt.clickMore(); vt.clickgiftCards(Title3); vt.clickMore();
 * vt.clickgiftCards(Title4); vt.clickMore(); vt.clickGiftIdeas(Title5);
 * vt.clickMore(); vt.clickGiftIdeas(Title6); vt.clickMore();
 * vt.clickDonatetoStJude(Title15); vt.clickMore();
 * vt.clickDonatetoStJude(Title16); vt.clickClose(); }
 */
