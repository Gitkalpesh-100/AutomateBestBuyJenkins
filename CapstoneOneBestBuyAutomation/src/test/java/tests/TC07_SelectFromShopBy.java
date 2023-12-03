/*package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import utils.UtilClass;

@Test(priority = 1)
public class TC07_SelectFromShopBy extends ProjectSpecifications {

	public void SelectFromShopBy() {

		HomePage home = new HomePage();
		home.chooseCountry();

		
		/*
		try {
			home.SelectFromShopBy();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

	/*
	@Test(priority = 2)
	public class TC07_SelectFromShopByNegative extends ProjectSpecifications {

		public void SelectFromShopBy() {

			HomePage home = new HomePage();
			home.chooseCountry();

			home.SelectFromShopBy();
			Assert.assertFalse(true, "Intentional failure: This test case should fail.");

		}
	}
	
}
		*/