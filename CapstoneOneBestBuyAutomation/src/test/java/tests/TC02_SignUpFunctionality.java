package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import base.ProjectSpecifications;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;
import pages.LogInPage;
import pages.SignUpPage;
import utils.UtilClass;

public class TC02_SignUpFunctionality extends ProjectSpecifications {
	
	@BeforeTest()
	public void setup() {
		sheetName = "SignUpTest";//same name for the sheet in excel sheet
	}
	
	@Test(priority = 1, dataProvider = "getInputData")
	public void SignUpTest(String firstName, String lastName, String password, String confirmPassword, String mobilePhoneNumber) throws InterruptedException {
		
		HomePage home = new HomePage();
		home.chooseCountry();       
		home.clickAccount();
		home.clickCreateAccount();
		
		SignUpPage signup = new SignUpPage();
		signup.firstName(firstName);
		signup.lastName(lastName);
		signup.password(password);
		signup.confirmPassword(confirmPassword);
		signup.mobilePhoneNumber(mobilePhoneNumber);
		
		
		System.out.println("");
		
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
	
	@Test(enabled = false)
	    public void SignUpNegativeTest() throws InterruptedException {

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
	        Assert.assertTrue(signup.isSignUpFailed(), "The Sign In should fail, but it passed.");
	 }
	
}
