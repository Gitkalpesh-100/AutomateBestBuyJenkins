package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class ValidataBottomLinksPage extends ProjectSpecifications{

	
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
	
	
	public ValidataBottomLinksPage() {
		PageFactory.initElements(driver, this);
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


	
}
