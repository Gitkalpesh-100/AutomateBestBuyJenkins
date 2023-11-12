package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.CheckoutPage;
import pages.HomePage;


@Test
public class TC09_NavigateCheckoutAndDummyPayment extends ProjectSpecifications{

	
	public void NavigateCheckoutAndDummyPayment () {
		
		HomePage home = new HomePage();
		home.chooseCountry();
		home.hamburgericon();
		home.Brands();
		home.Samsung();
		home.TvsAndHomeTheater();
		home.Tvs();
		home.AddToCartButton2();
		home.GotoCartButton();
		
		CheckoutPage check = new CheckoutPage();
		check.CheckoutButton();
		check.email1("onetwothree@gmail.com");
		check.Password1("One+TwoEqualsThree");
		check.Signin1();
		check.ContinueToPaymentInformation();
		check.CreditOrDebitCardNumber("1234 5678 1234 5678");
		check.FirstName1("First");
		check.LastName1("Last");
		check.Address1("Abc road, New York, USA");
				
	}
}
