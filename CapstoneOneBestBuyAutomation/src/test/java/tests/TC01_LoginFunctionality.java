package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignInPage;

public class TC01_LoginFunctionality extends ProjectSpecifications {
	
	@Test
	public void SignInTest() {
		
		HomePage home = new HomePage();
		home.chooseCountry();       
		home.clickAccount();
		home.clickSignIn();
		
		SignInPage signin = new SignInPage();
		signin.emailAddress("demo1@gmail.com");
		signin.password("demo@123");
		signin.clickSignInButton();
		
	}

}
