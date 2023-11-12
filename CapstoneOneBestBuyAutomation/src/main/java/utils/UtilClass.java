package utils;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;
import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.dockerjava.api.model.Link;

public class UtilClass<HttpURLConnection> {

	
	public static WebDriver driver;
	
	public void launch (String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
			
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	public void url(String url){
		driver.get(url);
		
	}
	
	
	public void click(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
	public void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}	
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void CheckBrokenLink(String urlToCheck) {
	   
	        // Define the URL to check.
	       // String urlToCheck = "https://www.bestbuy.com";//pass url as a parameter to this method
	        {
	        try {
	            URL url = new URL(urlToCheck);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            ((java.net.HttpURLConnection) connection).setRequestMethod("GET");
	            ((URLConnection) connection).connect();

	            int statusCode = ((java.net.HttpURLConnection) connection).getResponseCode();

	            if (statusCode == 200) {
	                System.out.println("Link is valid: " + urlToCheck);
	            } else {
	                System.out.println("is a Broken Link: " + urlToCheck + " (Status Code: " + statusCode + ")");
	            }
	        } catch (IOException e) {
	            System.out.println("Exception occurred while checking the link: " + urlToCheck);
	        }
	    }
	}
	
	 public void validateTitle(String expected_title ) {
	       
	        	
	        String my_title = driver.getTitle();
	        
	        System.out.println("Title is: " + my_title);
	        
	        Assert.assertEquals(my_title,expected_title); 
	 }
	 
	 public void bottomLinks() {
		 
		 String[] expectedTitles = {
				
				 "Accessibility",
				 "Terms & Conditions",
				 "Privacy",
				 "Interest-Based Ads",
				 "State Privacy Rights",
				 "Health Data Privacy",
				 "Do not sell/share my personal information",
				 "Limit Use of my Sensitive Personal Information",
				 "Targeting Advertising opt out",
				 "CA Supply Chain Transparency Act"
				 
		 };
		 
		 
		 
		 String my_title = driver.getTitle();
	        
	        System.out.println("Title is: " + my_title);
	        
	        String expected_title = "Accessibility - Best Buy";
	        
	        Assert.assertEquals(my_title,expected_title);
	        
	        	
	        
	 }
	 
	 public void AddingItemToCart() {
		 
		 WebElement searchBox = driver.findElement(By.xpath("//input[@class='search-input']"));
		 searchBox.click();
	     searchBox.sendKeys("WD Easystore 2TB External USB 3.0 Portable hard drive - Black");
	     searchBox.submit();
	     
	     
	     WebElement product = driver.findElement(By.xpath("//div[@data-sku-id=\"6406513\"]"));
	     JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
	     jsExecutor.executeScript("window.scrollTo(0,550)",product.getLocation().x,product.getLocation().y);
	     product.click();
	     
	     WebElement addToCartButton = driver.findElement(By.xpath("(//div[@class ='fulfillment-add-to-cart-button'])[1]"));
	     addToCartButton.click();
	     
	     WebElement goToCartButton = driver.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-sm c-button-block ']"));
	     goToCartButton.click();
	 
	 }
	 
	 
	 public void SelectFromShopBy()  {
		 
		 WebElement hamburgericon = driver.findElement(By.xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]"));
         hamburgericon.click();
         
         WebElement appliances = driver.findElement(By.xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Appliances' )]"));
         appliances.click();
         
         WebElement majorkitchenappliances = driver.findElement(By.xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Major Kitchen Appliances' )]"));
         majorkitchenappliances.click();
         
         WebElement refrigerators = driver.findElement(By.xpath("//a[@href=\"/site/home-appliances/refrigerators/abcat0901000.c?id=abcat0901000\"]"));
         refrigerators.click();
         
         WebElement frenchdoorrefrigerators = driver.findElement(By.xpath("//div[@class='flex-copy-wrapper']/a[@href='/site/refrigerators/french-door-refrigerators/abcat0901004.c?id=abcat0901004']"));
         frenchdoorrefrigerators.click();
                 
         WebElement addToCartButton1 = driver.findElement(By.xpath("//button[@data-sku-id='6546220' and contains(text(), 'Add to Cart')]"));
	     addToCartButton1.click();
	     
	     WebElement goToCartButton = driver.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-sm c-button-block ']"));
	     goToCartButton.click();
	        
	 }
	 
	 public void SelectFromBrands() {
		 
		 WebElement hamburgericon = driver.findElement(By.xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]"));
         hamburgericon.click();
         
         WebElement brands = driver.findElement(By.xpath("//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]"));
         brands.click();
         
         WebElement samsung = driver.findElement(By.xpath("//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]"));
		 samsung.click();
		 
		 WebElement tvandhometheater = driver.findElement(By.xpath("//a[contains(text(), 'TV & Home Theater')]"));
		 tvandhometheater.click();
		 
		 WebElement tvs = driver.findElement(By.xpath("//a[contains(text(), 'TVs') and (@class = 'link-element')]"));
		 tvs.click();
		 
		 WebElement addToCartButton2 = driver.findElement(By.xpath("//button[@data-sku-id='6514052' and contains(text(), 'Add to Cart')]"));
	     addToCartButton2.click();
	     
	     WebElement goToCartButton = driver.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-sm c-button-block ']"));
	     goToCartButton.click();
	 }
	
	 public void NavigateCheckoutAndDummyPayment() {
		 
		 WebElement hamburgericon = driver.findElement(By.xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]"));
         hamburgericon.click();
         
         WebElement brands = driver.findElement(By.xpath("//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]"));
         brands.click();
         
         WebElement samsung = driver.findElement(By.xpath("//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]"));
		 samsung.click();
		 
		 WebElement tvandhometheater = driver.findElement(By.xpath("//a[contains(text(), 'TV & Home Theater')]"));
		 tvandhometheater.click();
		 
		 WebElement tvs = driver.findElement(By.xpath("//a[contains(text(), 'TVs') and (@class = 'link-element')]"));
		 tvs.click();
		 
		 WebElement addToCartButton2 = driver.findElement(By.xpath("//button[@data-sku-id='6514052' and contains(text(), 'Add to Cart')]"));
	     addToCartButton2.click();
	     
	     WebElement goToCartButton = driver.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-sm c-button-block ']"));
	     goToCartButton.click();
	     
	     WebElement checkoutButton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary' and contains(text(), 'Checkout')]"));
	     checkoutButton.click();
	     
	     WebElement password1 = driver.findElement(By.xpath("//input[@class='tb-input' and @type='password']"));
		 password1.click();
		 
		 
		 
}
	 
	
	 
	 
	public void scroll() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 }
	 
}
