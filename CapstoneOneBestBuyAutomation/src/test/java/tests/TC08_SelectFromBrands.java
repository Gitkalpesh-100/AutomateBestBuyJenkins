package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

@Test


public class TC08_SelectFromBrands extends ProjectSpecifications{

	public void SelectFromBrands() {
		
		HomePage home = new HomePage();
		home.chooseCountry();

		home.SelectFromBrands();
		
	}
	
}
