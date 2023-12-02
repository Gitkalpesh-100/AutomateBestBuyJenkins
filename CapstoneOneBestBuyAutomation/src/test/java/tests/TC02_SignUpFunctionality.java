package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.Utils;

import base.ProjectSpecifications;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;
import pages.SignInPage;
import pages.SignUpPage;
import utils.UtilClass;

public class TC02_SignUpFunctionality extends ProjectSpecifications {
	
	@Test(priority = 1)
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
		
		try {
		    CaptureScreen("Snap2A1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		signup.createAnAccountButton();	
		
		try {
		     CaptureScreen("Snap2A2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	    public void SignUpNegativeTest() {

	        HomePage home = new HomePage();
	        home.chooseCountry();
	        home.clickAccount();
	        home.clickCreateAccount();

	        SignUpPage signup = new SignUpPage();
	        
	        signup.firstName(""); 
	        signup.lastName(""); 
	        signup.password("First@1"); 
	        signup.confirmPassword("First@2"); //Pswd not matching
	        signup.mobilePhoneNumber("123"); //Incomplete phone number                  

	        try {
			    CaptureScreen("Snap2B1");
			} catch (IOException e) {
			    e.printStackTrace();
			}
	        
	        signup.createAnAccountButton();
	        
	        try {
			    CaptureScreen("Sanp2B2");
			} catch (IOException e) {
			    e.printStackTrace();
			}

	 }
	
}
