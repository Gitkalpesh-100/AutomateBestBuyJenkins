package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class CheckoutPage extends ProjectSpecifications{
	
	
	
	@FindBy (xpath = "//button[@class='btn btn-lg btn-block btn-primary' and contains(text(), 'Checkout')]")
	WebElement checkoutbutton;
	
	@FindBy (xpath ="//input[@id='fld-e']")
	WebElement email1;
	
	@FindBy (xpath = "//input[@class='tb-input' and @type='password']")
	WebElement passoword1;
	
	@FindBy (xpath = "//button[@type='submit' and contains(text(), 'Sign In')]")
	WebElement signin;
	
	@FindBy (xpath = "//span[contains(text(), 'Continue to Payment Information')]")
	WebElement continuetopaymentinformation;
	
	@FindBy (xpath = "//input[@id='number']")
	WebElement creditordebitcardnumber;
	
	@FindBy (xpath = "//input[@id='first-name']")
	WebElement firstname1;
	
	@FindBy (xpath = "//input[@id='last-name']")
	WebElement lastname1;
	
	@FindBy (xpath = "//input[@class = 'tb-input v-medium addressLine1']")
	WebElement address;
	
	
	public CheckoutPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void CheckoutButton() {
		click(checkoutbutton);
	}
	
	public void email1(String email1value) {
		sendKeys(email1, email1value);
	}

	public void Password1(String passowrd1value) {
		
		sendKeys(passoword1,passowrd1value);
	}
	
	public void Signin1() {
		click(signin);
	}
	
	public void ContinueToPaymentInformation() {
		click(continuetopaymentinformation);
	}
	
	public void CreditOrDebitCardNumber(String cardnumbervalue) {
		sendKeys(creditordebitcardnumber, cardnumbervalue);
	}
	
	public void FirstName1(String firstname1value) {
		sendKeys(firstname1, firstname1value);
	}
	
	public void LastName1(String lastname1value) {
		sendKeys(lastname1, lastname1value);
	}

	public void Address1(String addressvalue) {
		sendKeys(address, addressvalue);
	}
	
}
