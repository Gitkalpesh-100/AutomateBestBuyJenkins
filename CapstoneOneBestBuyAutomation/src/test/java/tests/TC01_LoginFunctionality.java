package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignInPage;
import pages.ValidateTitlePage;
//import utils.DataSupplierClass;
import utils.UtilClass;


public class TC01_LoginFunctionality extends ProjectSpecifications {
	@Test(priority = 1)
	public void SignInTest(String userName, String password) throws IOException {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		ValidateTitlePage vt = new ValidateTitlePage();
		vt.SavedItems();
		home.clickAccount();
		home.clickSignIn();
		System.out.println(driver.getTitle());	
		SignInPage signin = new SignInPage();
		signin.emailAddress("demo1@gmail.com");
		signin.password("Demo123");
		try {
		    CaptureScreen("Snap1A1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		signin.clickSignInButton();
		try {
		    CaptureScreen("Snap1A2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
			
		@DataProvider(name = "loginTestData")
		public Object[][] LoginData(){
		{		
			Object[][] data = new Object[2][2];
			data [0][0] = "Admin";
			data [0][1] = "Admin123";	
			data [1][0] = "Admin";
			data [1][1] = "Test123";		
			return data;
		}
		    
	}
	
	
	@Test(priority = 2)
	public void SignInNegativeTest(String userName, String password) throws IOException {
	    HomePage home = new HomePage();
	    home.chooseCountry();
	    
	    ValidateTitlePage vt = new ValidateTitlePage();
	    vt.SavedItems();
	    
	    home.clickAccount();
	    home.clickSignIn();
	    System.out.println(driver.getTitle());
	    SignInPage signin = new SignInPage();
	    signin.emailAddress("onetwothree");
	    signin.password("");   
	    try {
		    CaptureScreen("Snap1B1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    signin.clickSignInButton();
	    
	    try {
		    CaptureScreen("Snap1B2");
		} catch (IOException e) {
		    e.printStackTrace();
		}    
	    Assert.assertTrue(signin.isSignInFailed(), "The Sign In should fail, but it passed.");
	  
	}
	@DataProvider(name = "loginTestData")
	public Object [] [] loginData()
	{
		Object[][] data = new Object[2][2];
		data [0][0] = "Admin";
		data [0][1] = "Admin123";		
		data [1][0] = "Admin";
		data [1][1] = "Test123";	
		return data;
	}

}
