package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignInPage;
import utils.UtilClass;

public class TC03_CheckingBrokenLinks extends ProjectSpecifications{
	@Test(priority = 1)
	public void CheckBrokenLinksTest() {
		
		HomePage home = new HomePage();
		home.chooseCountry();   	
		
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		home.CheckBrokenLink("https://www.bestbuy.com");		
  
		try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
	@Test(priority = 2)
	public void CheckNonBrokenLinksTest() {

        HomePage home = new HomePage();
        home.chooseCountry();
        home.CheckBrokenLink("https://www.bestbuy.com");   
        
        try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
        
        Assert.assertTrue(home.isLinkBroken(), "This is not a valid link");
        
        try {
		    UtilClass.CaptureScreen();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	
	}

}
