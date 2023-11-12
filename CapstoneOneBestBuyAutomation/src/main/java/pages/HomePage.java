package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.autofill.model.CreditCard;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class HomePage extends ProjectSpecifications {

	@FindBy(xpath = ("(//img[@alt='United States'])[1]")) // img[@alt='United States'])[1]
	WebElement country;

	@FindBy(xpath = "//span[text()=\"Account\"]")
	WebElement account;

	@FindBy(xpath = "//a[text()=\"Sign In\"]")
	WebElement SignIn;

	@FindBy(xpath = "//a[text()=\"Create Account\"]")
	WebElement CreateAccount;

	@FindBy(xpath = "//a[text()=\"Top Deals\"]")
	WebElement TopDeals;

	@FindBy(xpath = "//a[text()=\"Deal of the Day\"]")
	WebElement DealoftheDay;

	@FindBy(xpath = "//a[text()=\"My Best Buy Memberships\"]")
	WebElement MyBestBuyMemberships;

	@FindBy(xpath = "//a[@data-lid='hdr_gift_cards' and contains(@class, 'utility-menu-flyout-list-item')]")
	WebElement creditCards;
	
	@FindBy (xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Donate to St. Jude')]")
	WebElement donatetoStJude;
	
	@FindBy (xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Best Buy Outlet')]")
    WebElement bestBuyOutlet;
	
	@FindBy (xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Best Buy Business')]")
	WebElement bestBuyBusiness;
	
	@FindBy (xpath = "//span[contains(@class, 'accountMenuCloseText')]")
	WebElement close;
	
	@FindBy(xpath = "//span[contains(text(), 'More')]")
	WebElement more;

	@FindBy(xpath = "//span[contains(@class, 'v-p-right-xxs line-clamp')]")
	WebElement Account;
	
	@FindBy (xpath = "//a[contains(@class, 'mini-header__nav')]")
	WebElement returntopreviouspage;
	
	@FindBy (xpath = "//a[contains(text(), 'Create Account') and (@class = 'c-button c-button-outline c-button-sm create-account-btn')]")
	WebElement CreateAccount1;

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
	
	@FindBy (xpath = "//a[contains(text(), 'Accessibility')]")
	WebElement accessibility;
	
	@FindBy (xpath = "//a[contains(text(), 'Terms & Conditions')]")
	WebElement TermsandConditions;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Privacy')][1]")
	WebElement Privacy;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Interest-Based Ads')]")
	WebElement InterestBasedAds;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'State Privacy Rights')]")
	WebElement StatePrivacyRights;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Health Data Privacy')]")
	WebElement HealthDataPrivacy;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Do Not Sell/Share My Personal Information')]")
	WebElement DoNotSellOrShareMyPersonalInformation;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Limit Use of My Sensitive Personal Information')]")
	WebElement LimitUseofMySensitivePersonalInformation;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Targeted Advertising Opt Out')]")
	WebElement TargetedAdvertisingOptOut;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'CA Supply Chain Transparency Act')]")
	WebElement CASupplyChainTransparencyAct;
	
	@FindBy (xpath = "//input[@class='search-input']")
	WebElement seacrhBox;
	
	@FindBy (xpath = "//span[@class='header-search-icon']")
	WebElement searchIcon;
	
	@FindBy (xpath = "//a[contains(text(), 'Gift Cards') and contains(@class, 'utility-menu-flyout-list-item')]")
	WebElement giftCards;
	/*
	@FindBy (xpath = "//a[contains(text(), 'Yes, Best Buy Sells That') and contains(@class, 'bottom-left-links')]")
	WebElement YesBestBuySellsThat;
	*/
	
	@FindBy (xpath = "/html/body/div[3]/div/div/div[1]/header/div[2]/nav/div/div/div/div/div[1]/ul/li[3]/a")
	WebElement GiftIdeas;
	
	@FindBy (xpath = "//div[@data-sku-id=\"6406513\"]")
    WebElement product;     
	
	@FindBy (xpath = "(//div[@class ='fulfillment-add-to-cart-button'])[1]")
	WebElement AddToCartButton;
	
	@FindBy (xpath = "//a[@class='c-button c-button-secondary c-button-sm c-button-block ']")
	WebElement gotoCartButton;
	
	@FindBy (xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]")
	WebElement hamburgericon;
	
	@FindBy (xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Appliances' )]")
 	WebElement appliances;
	
	@FindBy (xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Major Kitchen Appliances' )]")
	WebElement majorkitchenappliances;
	
	@FindBy (xpath = "//a[@href=\\\"/site/home-appliances/refrigerators/abcat0901000.c?id=abcat0901000\\\"]")
	WebElement refrigerators;
	
	@FindBy (xpath = "//div[@class='flex-copy-wrapper']/a[@href='/site/refrigerators/french-door-refrigerators/abcat0901004.c?id=abcat0901004']")
	WebElement FrenchDoorRefrigerators;
	
	@FindBy (xpath = "//a[contains(@class, 'sku-title') and contains(@href, 'https://www.bestbuy.com/site/samsung-bespoke-23-cu-ft-4-door-french-door-counter-depth-smart-refrigerator-with-family-hub-custom-panel-ready/6493530.p?skuId=6493530')]")
	WebElement SamsungRefrigerator;
	
	@FindBy (xpath = "//button[@data-sku-id=\\\"6546220\\\" and contains(text(), 'Add to Cart')]")
	WebElement addtocartbutton1;
	
	@FindBy (xpath = "//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]")
	WebElement brands;
	
	@FindBy (xpath = "//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]")
	WebElement samsung;
	
	@FindBy (xpath = "//a[contains(text(), 'TV & Home Theater')]")
	WebElement tvsandhometheater;
	
	@FindBy (xpath = "//a[contains(text(), 'TVs') and (@class = 'link-element')]")
	WebElement tvs;
	
	@FindBy (xpath = "//button[@data-sku-id='6514052' and contains(text(), 'Add to Cart')]")
	WebElement addtocartbutton2;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void chooseCountry() {
		click(country);
	}

	public void clickAccount() {
		click(account);
	}

	public void clickSignIn() {
		click(SignIn);
	}

	public void clickCreateAccount() {
		click(CreateAccount);

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

	public void clickMore() {
		click(more);
	}
	
	public void clickgiftCards() {
		click(giftCards);
	}
	
	/*public void clickYesBestBuySellsThat(){
		click(YesBestBuySellsThat);
	}*/
	
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
	
	public void clickSignIn1() {
		clickSignIn();
	}
	
	public void clickCreateAccount1() {
		click(CreateAccount1);
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

	public void SavedItems() {
		click(SavedItems);
	}
	
	public void SeeAllYourSavedItems() {
		click(seeallyoursaveditems);
	}
	
	public void Accessibility() {
		click(accessibility);
	}
	
	public void TermsandConditons() {
		click(TermsandConditions);
	}
	
	public void Privacy() {
		click(Privacy);
	}
	
	public void InterestBasedAds() {
		click(InterestBasedAds);
	}

	public void StatePrivacyRights() {
		click(StatePrivacyRights);
	}
	
	public void HealthDataPrivacy() {
		click(HealthDataPrivacy);
	}
	
	public void DoNotSellOrShareMyPersonalInformation() {
		click(DoNotSellOrShareMyPersonalInformation);
	}
	
	public void LimitUseOfMySensitivePersonalInformation() {
		click(LimitUseofMySensitivePersonalInformation);
	}
	
	public void TargetedAdvertisingOptOut() {
		click(TargetedAdvertisingOptOut);
	}
	
	public void CASupplyChainTransparencyAct() {
		click(CASupplyChainTransparencyAct);
	}	
	
	public void SearchBox() {
		click(seacrhBox);
		
	}
	
	
	public void SearchBoxIcon() {
		click(searchIcon);
	}

	public void clickContinueButton() {
		click(ContinueButton);
		
	}
	
	public void clickproduct() {
		click(product);
	}
	
	public void AddToCartButton(){
		click(AddToCartButton);
	}
	
	public void GotoCartButton() {
		click(gotoCartButton);
	}
	
	public void refrigerators() {
		click(refrigerators);
	}
	
	public void hamburgericon() {
		click(hamburgericon);
	}
	
	public void MajorKitchenAppliances() {
		click(majorkitchenappliances);
	}
	
	public void Refrigerators() {
		click(refrigerators);
	}
	
	public void FrenchDoorRefrigerators() {
		click(FrenchDoorRefrigerators);
	}
	
	public void SamsungRefrigerator() {
		click(SamsungRefrigerator);
	}
		
	public void AddToCartButton1() {
		click(AddToCartButton);
	}
	
	public void Brands() {
		click(brands);
	}
	
	public void Samsung() {
		click(samsung);
	}
	
	public void TvsAndHomeTheater() {
		click(tvsandhometheater);
	}
	
	public void Tvs() {
		click(tvs);
	}
	
	public void AddToCartButton2() {
		click(addtocartbutton2);
	}

}
