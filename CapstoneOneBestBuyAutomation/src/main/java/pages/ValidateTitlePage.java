package pages;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.pkix.SubjectPublicKeyInfoChecker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.command.PullImageCmd;

import base.ProjectSpecifications;

public class ValidateTitlePage extends ProjectSpecifications{

	@FindBy(xpath = "//a[text() = 'Holiday Deals']")
	WebElement HolidayDeals;
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement TopDeals;
	
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement DealoftheDay;
	
	@FindBy(xpath = "(//a[text()='My Best Buy Memberships'])[2]")
	WebElement MyBestBuyMemberships;

	@FindBy(xpath = "(//a[text()='Credit Cards'])[2]")
	WebElement creditCards;
	
	@FindBy(xpath = "//span[text()='More']")
	WebElement More;
	
	@FindBy (xpath = "(//a[text()='Gift Cards'])[1]")
	WebElement GiftCards;
	
	@FindBy (xpath = "//a[text()='Gift Ideas']")
	WebElement GiftIdeas;
	
	@FindBy (xpath = "(//a[text()='Yes, Best Buy Sells That'])[2]")
	WebElement yesBestBuySellsThat;
	
	@FindBy (xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Donate to St. Jude')]")
	WebElement donatetoStJude;
	
	@FindBy (xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Best Buy Outlet')]")
    WebElement bestBuyOutlet;
	
	@FindBy (xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Best Buy Business')]")
	WebElement bestBuyBusiness;
	
	@FindBy (xpath = "//span[contains(@class, 'accountMenuCloseText')]")
	WebElement close;
	
	@FindBy(xpath = "//*[local-name()='svg' and namespace-uri()='http://www.w3.org/2000/svg' and @viewBox='0 0 100 100']/ancestor::div[@class='flyout-button-wrapper']")
	WebElement Account;
	
	@FindBy (xpath = "//a[contains(@class, 'mini-header__nav')]")
	WebElement returntopreviouspage;
	
	@FindBy (xpath = "//a[contains(text(), 'Create Account') and (@class = 'c-button c-button-outline c-button-sm create-account-btn')]")
	WebElement CreateAccount1;
	
	@FindBy (xpath = "//a[contains(text(), 'Sign In') and (@class = 'c-button c-button-secondary c-button-sm sign-in-btn')]")
	WebElement SignIn1;

	@FindBy(xpath = "//span[contains(text(), 'Recently Viewed')]")
	WebElement RecentlyViewed;
	
	@FindBy (xpath = "//a[contains(text(), 'Manage all your recently viewed items')]")
	WebElement Manageallyourrecentlyvieweditems;

	@FindBy(xpath = "//span[contains(text(), 'Order Status')]")
	WebElement OrderStatus;
	
	@FindBy (xpath = "//a[contains(text(), 'Continue')]")
	WebElement ContinueButton;

	@FindBy(xpath = "//span[contains(text(), 'Saved Items')]")
	WebElement SavedItems;
	
	@FindBy (xpath = "//a[contains(text(), 'See all your saved items')]")
	WebElement seeallyoursaveditems;

	public ValidateTitlePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHolidayDeals(String title1) {
		click(HolidayDeals);
		validateTitle(title1);
		
	}
	
	public void clickTopDeals() {
		click(TopDeals);
	}

	public void clickDealOftheDay() {
		click(DealoftheDay);
	}
	
	public void clickMyBestBuyMemberships() {
		click(MyBestBuyMemberships);
	}
	
	public void clickCreditCards() {
		click(creditCards);
	}
	
	public void clickyesBestBuySellsThat() {
		click(yesBestBuySellsThat);
	}
	
	public void clickMore() {
		click(More);
	}
	

	public void clickgiftCards() {
		click(GiftCards);
	}
	
	public void clickGiftIdeas() {
		click(GiftIdeas);
	}
	
	public void clickDonatetoStJude() {
		click(donatetoStJude);
	}
    
	public void clickBestBuyOutlet() {
		click(bestBuyOutlet);
	}

	public void clickBestBuyBusiness() {
		click(bestBuyBusiness);
	}
	
	public void clickClose() {
		click(close);
	}
    
	public void clickAccount1() {
		click(Account);
	}
	
	public void clickCreateAccount1() {
		click(CreateAccount1);
	}
	
	public void clickSignIn1() {
		click(SignIn1);
	}
	
	public void clickReturntopreviouspage()
	{
		click(returntopreviouspage);
	}
	
	public void RecentlyViewed() {
		click(RecentlyViewed);
	}
	
	public void ManageAllYourRecentlyViewedItems() {
		click(Manageallyourrecentlyvieweditems);
	}

	public void OrderStatus() {
		click(OrderStatus);
	}

	public void clickContinueButton() {
		click(ContinueButton);
		
	}
	
	public void SavedItems() {
		click(SavedItems);
	}
	
	public void SeeAllYourSavedItems() {
		click(seeallyoursaveditems);
	}
	
}

	

