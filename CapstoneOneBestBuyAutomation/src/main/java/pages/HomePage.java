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

	

	

	
	
	
	
	
	
	
	

	
	
	
	
		

	
	@FindBy (xpath = "//input[@class='search-input']")
	WebElement seacrhBox;
	
	@FindBy (xpath = "//span[@class='header-search-icon']")
	WebElement searchIcon;
	
	
	
	@FindBy (xpath = "//*[@data-sku-id = '6406513' and contains(text(), 'Add to Cart')]")
    WebElement product;     
	
	@FindBy (xpath = "(//div[@class ='fulfillment-add-to-cart-button'])[2]")
	WebElement AddToCartButton;
	
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
	
	@FindBy (xpath = "//a[contains(@class, 'sku-title') and contains(@href, 'https://www.bestbuy.com/site/samsung-bespoke-23-cu-ft-4-door-french-door-counter-depth-smart-refrigerator-with-family-hub-custom-panel-ready/6493532.p?skuId=6493530')]")
	WebElement SamsungRefrigerator;
	
	@FindBy (xpath = "//button[@data-sku-id=\\\"6493532\\\" and contains(text(), 'Add to Cart')]")
	WebElement addtocartbutton1;
	
	@FindBy (xpath = "//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]")
	WebElement brands;
	
	@FindBy (xpath = "//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]")
	WebElement samsung;
	
	@FindBy (xpath = "//a[contains(text(), 'TV & Home Theater')]")
	WebElement tvsandhometheater;
	
	@FindBy (xpath = "//a[contains(text(), 'TVs') and (@class = 'link-element')]")
	WebElement tvs;
	
	@FindBy (xpath = "//button[@data-sku-id='6547490' and contains(text(), 'Add to Cart')]")
	WebElement addtocartbutton2;
	
	@FindBy (xpath = "//div[@class = 'go-to-cart-button']")
	WebElement gotoCartButton;
	
	
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

	
	

	

	

	
	
	
	
	
	
	
	
	public void clickSignIn1() {
		clickSignIn();
	}
	
	
	
	

	
	
	
	
	public void SearchBox() {
		click(seacrhBox);
		
	}
	
	public void SearchBoxIcon() {
		click(searchIcon);
	}

	
	public void clickproduct() {
		click(product);
	}
	
	public void AddToCartButton(){
		click(AddToCartButton);
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
	
	public void GotoCartButton() {
		click(gotoCartButton);
	}
	

	public boolean isLinkBroken() {
			return false;
	}

	public boolean FailAddingItemToCart() {	
		return false;
	}
	
}
