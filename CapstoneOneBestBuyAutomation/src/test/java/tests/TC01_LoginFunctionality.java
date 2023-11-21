package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignInPage;
import utils.UtilClass;


public class TC01_LoginFunctionality extends ProjectSpecifications {
	
	@Test(priority = 1)
	public void SignInTest() throws IOException {
		
		HomePage home = new HomePage();
		home.chooseCountry(); 
		home.SavedItems();
		home.clickAccount();
		home.clickSignIn();
		
		SignInPage signin = new SignInPage();
		signin.emailAddress("demo1@gmail.com");
		signin.password("demo@123");
		
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
			
		signin.clickSignInButton();
	
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
	}
	
	
	@Test(priority = 2)
	public void SignInNegativeTest() throws IOException {

	    HomePage home = new HomePage();
	    home.chooseCountry();
	    home.SavedItems();
	    home.clickAccount();
	    home.clickSignIn();

	    SignInPage signin = new SignInPage();
	    signin.emailAddress("onetowthree");
	    signin.password("");
	    
	    try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    signin.clickSignInButton();
	    
	    try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    
	    Assert.assertTrue(signin.isSignInFailed(), "The Sign In should fail, but it passed.");
	}
}
