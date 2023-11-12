package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

	@Test

public class TC07_SelectFromShopBy extends ProjectSpecifications {

	public void SelectFromShopBy() {

		HomePage home = new HomePage();
		home.chooseCountry();

		home.SelectFromShopBy();

	}

}
