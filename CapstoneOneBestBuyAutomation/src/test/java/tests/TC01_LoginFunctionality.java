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
import utils.UtilClass;


public class TC01_LoginFunctionality extends ProjectSpecifications {
	
	@Test(priority = 1)
	public void SignInTest() throws IOException {
		
		HomePage home = new HomePage();
		home.chooseCountry(); 
		home.SavedItems();
		home.clickAccount();
		home.clickSignIn();
		System.out.println(driver.getTitle());
		/*
		ExtentReports extentReports = new ExtentReports();
		
		File file = new File("./Reports/report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		*/
		SignInPage signin = new SignInPage();
		signin.emailAddress("demo1@gmail.com");
		signin.password("demo@123");
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
      //  extentReports.flush();
		//Desktop.getDesktop().browse(new File("./Reports/report.html").toURI());	
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
	    
		Desktop.getDesktop().browse(new File("./Reports/report.html").toURI());
	}
	
	@DataProvider(name = "loginTestData")
	{
		
	}
}
