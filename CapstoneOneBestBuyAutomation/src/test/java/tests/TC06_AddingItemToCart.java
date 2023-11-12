package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC06_AddingItemToCart extends ProjectSpecifications {

	@Test
	public void AddingItemToCart() {

		HomePage home = new HomePage();
		home.chooseCountry();

		home.AddingItemToCart();
	}
}
