package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.LogInPage;
import pages.ValidateTitlePage;
//import utils.DataSupplierClass;
import utils.UtilClass;


public class TC01_LoginFunctionality extends ProjectSpecifications {
	
	@BeforeTest()
	public void setup() {
		sheetName = "LoginTest";//same name for the sheet in excel sheet
	}
	
	@Test(priority = 1, dataProvider = "getInputData")
	public void LoginTest(String userName, String password) throws IOException {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		ValidateTitlePage vt = new ValidateTitlePage();
		//vt.SavedItems();
		home.clickAccount();
		home.clickSignIn();
		System.out.println(driver.getTitle());	
		LogInPage signin = new LogInPage();
		signin.emailAddress(userName);
		signin.password(password);
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
		/*	
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
		 */   
	

	@Test(priority = 2, dataProvider = "getInputData_2")
	public void LogInTestNegative(String userName, String password) throws IOException {
	    HomePage home = new HomePage();
	    home.chooseCountry();
	    
	    ValidateTitlePage vt = new ValidateTitlePage();
	  //  vt.SavedItems();
	    
	    home.clickAccount();
	    home.clickSignIn();
	    System.out.println(driver.getTitle());
	    LogInPage signin = new LogInPage();
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
	/*
	@DataProvider(name = "loginTestData1")
	public Object [] [] loginData()
	{
		Object[][] data = new Object[2][2];
		data [0][0] = "Admin";
		data [0][1] = "Admin123";		
		data [1][0] = "Admin";
		data [1][1] = "Test123";	
		return data;
	}
*/
}
