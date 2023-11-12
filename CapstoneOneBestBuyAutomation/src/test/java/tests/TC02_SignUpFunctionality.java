package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignInPage;
import pages.SignUpPage;

public class TC02_SignUpFunctionality extends ProjectSpecifications {
	
	@Test
	public void SignUpTest() {
		
		HomePage home = new HomePage();
		home.chooseCountry();       
		home.clickAccount();
		home.clickCreateAccount();
		
		SignUpPage signup = new SignUpPage();
		signup.firstName("First");
		signup.lastName("Last");
		signup.password("First@1");
		signup.confirmPassword("First@1");
		signup.mobilePhoneNumber("9889988911");
		signup.createAnAccountButton();
		
	}
}
