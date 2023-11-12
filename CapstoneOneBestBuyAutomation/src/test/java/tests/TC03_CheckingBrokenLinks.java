package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignInPage;

public class TC03_CheckingBrokenLinks extends ProjectSpecifications{
	@Test
	public void CheckBrokenLinksTest() {
		
		HomePage home = new HomePage();
		home.chooseCountry();   	
		home.CheckBrokenLink("https://www.bestbuy.com");
		
  }

}
