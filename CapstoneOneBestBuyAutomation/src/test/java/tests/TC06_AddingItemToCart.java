package tests;

import java.io.IOException;

import org.openqa.selenium.remote.server.handler.GoBack;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecifications;

import pages.HomePage;
import utils.UtilClass;

public class TC06_AddingItemToCart extends ProjectSpecifications {

	@Test (priority = 1)
	public void AddingItemToCart() throws InterruptedException, IOException {

		HomePage home = new HomePage();
		home.chooseCountry();
		
		
		
		
		home.AddingItemToCart();
		UtilClass.CaptureScreen();
		
	}
	
	
	 @Test(priority = 2)
	    public void negativeAddingItemToCart() {

	        HomePage home = new HomePage();
	        home.chooseCountry();	       
	        try {
			    UtilClass.CaptureScreen();
			} catch (IOException e) {
			    e.printStackTrace();
			}
	        boolean addItemResult = home.FailAddingItemToCart();
	        Assert.assertTrue(addItemResult, "Adding item to cart failed, but it was expected to fail.");
	        try {
			    UtilClass.CaptureScreen();
			} catch (IOException e) {
			    e.printStackTrace();
			}
	 }
	 
}
