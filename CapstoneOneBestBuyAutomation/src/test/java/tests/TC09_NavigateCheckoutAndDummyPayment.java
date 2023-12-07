package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.CheckoutPage;

import pages.HomePage;
import utils.UtilClass;

public class TC09_NavigateCheckoutAndDummyPayment extends ProjectSpecifications {

	@Test
	public void NavigateCheckoutAndDummyPayment() throws IOException {

		HomePage home = new HomePage();
		home.chooseCountry();

		CheckoutPage check = new CheckoutPage();
		check.hamburgericon();
		check.brands();
		check.samsung();
		check.tvandhometheater();
		check.tvs();
		check.product4();
		check.addToCartButton3();
		check.goToCartButton3();
		check.CheckoutButton();
		check.ContinueasGuest();
		check.switchalltodelivery();
		check.firstName2("Purchase");
		check.lastName2("Something");
		check.address2("AB Goose Creek Resort");
		check.city("Newport");
		check.state("NC");
		check.zipcode("28570");
		check.apply();
		check.useremailaddress("useremail@gmail.com");
		check.userphonenumber("980-563-1724");
		CaptureScreen("Snap9A1");
		check.continuetoscheduledelivery();
		try {
			CaptureScreen("Snap9A2");
		} catch (IOException e) {
			e.printStackTrace();
		}
		check.creditcardordebitcardnumber("4263 9826 0269 5299");
		check.expirationmonth("2");
		check.expirationyear("2026");
		check.securitycode("837");
		try {
			Thread.sleep(5000);
			check.ContinueToPaymentInformation();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		check.scroll();
		check.placeyourorder();

		try {
			CaptureScreen("Snap9A2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public class TC09_NavigateCheckoutAndDummyPaymentNegative extends ProjectSpecifications {

		@Test
		public void NavigateCheckoutAndDummyPayment() {

			HomePage home = new HomePage();
			home.chooseCountry();

			CheckoutPage check = new CheckoutPage();
			check.hamburgericon();
			check.brands();
			check.samsung();
			check.tvandhometheater();
			check.tvs();
			check.product4();
			check.addToCartButton3();
			check.goToCartButton3();
			check.CheckoutButton();
			check.ContinueasGuest();
			check.switchalltodelivery();
			check.firstName2("Purchase");
			check.lastName2("Something");
			check.address2("AB Goose Creek Resort");
			check.city("Newport");
			check.state("NC");
			check.zipcode("28570");
			check.apply();
			check.useremailaddress("useremail@gmail.com");
			check.userphonenumber("980-563-1724");

			try {
				check.ContinueToPaymentInformation();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			try {
				CaptureScreen("Snap9B1");
			} catch (IOException e) {
				e.printStackTrace();
			}

			// check.continuetoscheduledelivery();
			// check.ContinueToPaymentInformation();
			check.creditcardordebitcardnumber("4263 9826 0269 5299");
			check.expirationmonth("2");
			check.expirationyear("2026");
			check.securitycode("837");
			check.scroll();
			check.placeyourorder();

			try {
				CaptureScreen("Snap9B2");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
