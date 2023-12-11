package tests;

import java.io.IOException;
import java.nio.channels.NonWritableChannelException;

import org.openqa.selenium.remote.server.handler.GoBack;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.AddingItemToCartPage;
import pages.HomePage;
import utils.UtilClass;

public class TC06_AddingItemToCart extends ProjectSpecifications {

	@Test (priority = 1)
	public void AddingItemToCart(String searchbox) throws InterruptedException, IOException {

		HomePage home = new HomePage();
		home.chooseCountry();
		
		AddingItemToCartPage itc = new AddingItemToCartPage();
		
		itc.searchBox();
		itc.product1();
		itc.addtoCartButton();
		itc.goToCartButton();
		CaptureScreen("Snap6A1");
		
		itc.hamburgericon();
		itc.appliances();
		itc.majorkitchenappliances();
		itc.refrigerators();
		itc.frenchdoorrefrigerators();
		itc.product2();
		itc.addToCartButton1();
		itc.goToCartButton1();
		itc.closeicon();
		CaptureScreen("Snap6A2");
			
		itc.hamburgericon();
		itc.brands();
		itc.samsung();
		itc.tvandhometheater();
		itc.tvs();
		itc.product3();
		itc.addToCartButton2();
		itc.goToCartButton2();
		CaptureScreen("Snap6A3");	
	}
	
	
	
	 @Test(priority = 2)
	    public void negativeAddingItemToCart() throws InterruptedException, IOException {

	        HomePage home = new HomePage();
	        home.chooseCountry();	    
	        
	        AddingItemToCartPage itc = new AddingItemToCartPage();
	        
	        itc.searchBox();
			itc.product1();
			itc.addtoCartButton();
			itc.goToCartButton();
			CaptureScreen("Snap6B1");
			
			itc.hamburgericon();
			itc.appliances();
			itc.majorkitchenappliances();
			itc.refrigerators();
			itc.frenchdoorrefrigerators();
			itc.product2();
			itc.addToCartButton1();
			itc.goToCartButton1();
			itc.closeicon();
			CaptureScreen("Snap6B2");
			
			itc.hamburgericon();
			itc.brands();
			itc.samsung();
			itc.tvandhometheater();
			itc.tvs();
			itc.product3();
			itc.addToCartButton2();
			itc.goToCartButton2();
			CaptureScreen("Snap6B3");
			
			
	        try {
	        	CaptureScreen("Snap6B4");
			} catch (IOException e) {
			    e.printStackTrace();
			}
	        boolean addItemResult = home.FailAddingItemToCart();
	        Assert.assertTrue(addItemResult, "Adding item to cart failed, and it was expected to fail.");
	        try {
	        	CaptureScreen("Snap6B5");
			} catch (IOException e) {
			    e.printStackTrace();
			}
	 }	 
}
