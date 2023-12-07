package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;
import javax.net.ssl.HttpsURLConnection;
import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.api.model.Link;
import org.openqa.selenium.interactions.Actions;

public class UtilClass<HttpURLConnection> {

	public static WebDriver driver;
	 public String sheetName;

	public void launch(String browser) {

		ChromeOptions options = new ChromeOptions();
		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("Chrome-Headless")) {

			options.addArguments("headless");
			
			driver = new ChromeDriver(options);
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	public void url(String url) {
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

	public void validateTitle(String expected_title) {

		String my_title = driver.getTitle();

		System.out.println("Title is: " + my_title);

		Assert.assertEquals(my_title, expected_title);
	}

	public void bottomLinks() {

		String[] expectedTitles = {

				"Accessibility", "Terms & Conditions", "Privacy", "Interest-Based Ads", "State Privacy Rights",
				"Health Data Privacy", "Do not sell/share my personal information",
				"Limit Use of my Sensitive Personal Information", "Targeting Advertising opt out",
				"CA Supply Chain Transparency Act"

		};

		String my_title = driver.getTitle();

		System.out.println("Title is: " + my_title);

		String expected_title = "Accessibility - Best Buy";

		Assert.assertEquals(my_title, expected_title);
	}

	/*
	 * public void AddingItemToCart() throws InterruptedException, IOException {
	 * 
	 * WebElement searchBox =
	 * driver.findElement(By.xpath("//input[@class='search-input']"));
	 * searchBox.click(); searchBox.
	 * sendKeys("WD Easystore 2TB External USB 3.0 Portable hard drive - Black");
	 * searchBox.submit();
	 * 
	 * WebElement product = driver.findElement(By.
	 * xpath("//*[@data-sku-id = '6406513' and contains(text(), 'Add to Cart')]"));
	 * JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
	 * jsExecutor.executeScript("window.scrollTo(0,700)", product.getLocation().x,
	 * product.getLocation().y); product.click();
	 * 
	 * WebElement addToCartButton = driver
	 * .findElement(By.xpath("(//div[@class ='fulfillment-add-to-cart-button'])[2]")
	 * ); addToCartButton.click();
	 * 
	 * //UtilClass.CaptureScreen();
	 * 
	 * 
	 * WebElement goToCartButton =
	 * driver.findElement(By.xpath("//div[@class = 'go-to-cart-button']"));
	 * Thread.sleep(3000); goToCartButton.click();
	 * 
	 * 
	 * // CaptureScreen();
	 * 
	 * }
	 */

	/*
	 * public void SelectFromShopBy() throws IOException {
	 * 
	 * WebElement hamburgericon = driver .findElement(By.
	 * xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]"
	 * )); hamburgericon.click();
	 * 
	 * WebElement appliances = driver.findElement(By.xpath(
	 * "//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Appliances' )]"
	 * )); appliances.click();
	 * 
	 * WebElement majorkitchenappliances = driver.findElement(By.xpath(
	 * "//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Major Kitchen Appliances' )]"
	 * )); majorkitchenappliances.click();
	 * 
	 * WebElement refrigerators = driver.findElement( By.xpath(
	 * "//a[@href=\"/site/home-appliances/refrigerators/abcat0901000.c?id=abcat0901000\"]"
	 * )); refrigerators.click();
	 * 
	 * WebElement frenchdoorrefrigerators = driver.findElement(By.xpath(
	 * "//div[@class='flex-copy-wrapper']/a[@href='/site/refrigerators/french-door-refrigerators/abcat0901004.c?id=abcat0901004']"
	 * )); frenchdoorrefrigerators.click();
	 * 
	 * WebElement addToCartButton1 = driver.findElement(By.
	 * xpath("//button[@data-sku-id='6546220' and contains(text(), 'Add to Cart')]")
	 * ); JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
	 * jsExecutor.executeScript("window.scrollTo(0,500)",
	 * addToCartButton1.getLocation().x, addToCartButton1.getLocation().y);
	 * addToCartButton1.click();
	 * 
	 * CaptureScreen("AddToCartButton1");
	 * 
	 * WebElement goToCartButton = driver .findElement(By.
	 * xpath("//a[@class='c-button c-button-secondary c-button-md c-button-block ']"
	 * )); goToCartButton.click();
	 * 
	 * CaptureScreen("GoToCartButton1"); }
	 */

	public void SelectFromBrands() throws InterruptedException, IOException {

		WebElement hamburgericon = driver
				.findElement(By.xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]"));
		hamburgericon.click();

		WebElement brands = driver.findElement(By.xpath(
				"//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]"));
		brands.click();

		WebElement samsung = driver.findElement(
				By.xpath("//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]"));
		samsung.click();

		WebElement tvandhometheater = driver.findElement(By.xpath("//a[contains(text(), 'TV & Home Theater')]"));
		tvandhometheater.click();

		WebElement tvs = driver.findElement(By.xpath("//a[contains(text(), 'TVs') and (@class = 'link-element')]"));
		tvs.click();

		WebElement addToCartButton2 = driver
				.findElement(By.xpath("//button[@data-sku-id='6547490' and contains(text(), 'Add to Cart')]"));

		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		jsExecutor.executeScript("window.scrollTo(0,600)", addToCartButton2.getLocation().x,
				addToCartButton2.getLocation().y);

		addToCartButton2.click();

		CaptureScreen("AddToCart");

		WebElement goToCartButton = driver
				.findElement(By.xpath("//a[@class='c-button c-button-secondary c-button-md c-button-block ']"));
		goToCartButton.click();

		CaptureScreen("GoToCart");
	}

	/*
	 * public void NavigateCheckoutAndDummyPayment() {
	 * 
	 * WebElement hamburgericon = driver.findElement(By.
	 * xpath("//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]"
	 * )); hamburgericon.click();
	 * 
	 * WebElement brands = driver.findElement(By.
	 * xpath("//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]"
	 * )); brands.click();
	 * 
	 * WebElement samsung = driver.findElement(By.
	 * xpath("//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]"
	 * )); samsung.click();
	 * 
	 * WebElement tvandhometheater =
	 * driver.findElement(By.xpath("//a[contains(text(), 'TV & Home Theater')]"));
	 * tvandhometheater.click();
	 * 
	 * WebElement tvs = driver.findElement(By.
	 * xpath("//a[contains(text(), 'TVs') and (@class = 'link-element')]"));
	 * tvs.click();
	 * 
	 * WebElement addToCartButton2 = driver.findElement(By.
	 * xpath("//button[@data-sku-id='6514055' and contains(text(), 'Add to Cart')]")
	 * ); addToCartButton2.click();
	 * 
	 * WebElement goToCartButton = driver.findElement(By.
	 * xpath("//a[@class='c-button c-button-secondary c-button-sm c-button-block ']"
	 * )); goToCartButton.click();
	 * 
	 * WebElement checkoutButton = driver.findElement(By.
	 * xpath("//button[@class='btn btn-lg btn-block btn-primary' and contains(text(), 'Checkout')]"
	 * )); checkoutButton.click();
	 * 
	 * WebElement continueasGuest = driver.findElement(By.
	 * xpath("//*[contains(@class, 'c-button c-button-secondary c-button-lg cia-guest-content__continue guest')]"
	 * )); continueasGuest.click();
	 * 
	 * WebElement switchalltodelivery = driver.findElement(By.
	 * xpath("//button[@class='c-button-link card-call-to-action-button']"));
	 * switchalltodelivery.click();
	 * 
	 * WebElement firstname2 =
	 * driver.findElement(By.xpath("//input[@class='tb-input' and @id='firstName']")
	 * ); firstname2.click();
	 * 
	 * WebElement lastname2 =
	 * driver.findElement(By.xpath("//*[@class='tb-input' and @id='lastName']"));
	 * lastname2.click();
	 * 
	 * WebElement address2 = driver.findElement(By.
	 * xpath("//*[@class='tb-input  autocomplete__input' and @role='combobox']"));
	 * address2.click();
	 * 
	 * WebElement city =
	 * driver.findElement(By.xpath("//*[@class='tb-input' and @id='city']"));
	 * city.click();
	 * 
	 * WebElement state =
	 * driver.findElement(By.xpath("//*[@class='tb-select' and @id='state']"));
	 * state.click();
	 * 
	 * WebElement zipcode =
	 * driver.findElement(By.xpath("//*[@class='tb-input' and @id='zipcode']"));
	 * zipcode.click();
	 * 
	 * WebElement apply = driver.findElement(By.xpath("//span[text()= 'Apply']"));
	 * apply.click();
	 * 
	 * WebElement useremailaddress = driver.findElement(By.
	 * xpath("//*[@class='tb-input' and @id='user.emailAddress']"));
	 * useremailaddress.click();
	 * 
	 * WebElement userphonenumber =
	 * driver.findElement(By.xpath("//*[@class='tb-input' and @id='user.phone']"));
	 * userphonenumber.click();
	 * 
	 * WebElement continuetoscheduledelivery =
	 * driver.findElement(By.xpath("//span[text()='Continue to Schedule Delivery']")
	 * ); continuetoscheduledelivery.click();
	 * 
	 * WebElement creditcardordebitcardnumber = driver.findElement(By.
	 * xpath("//input[contains(@class, 'tb-input') and contains(@class, 'v-medium') and @pattern='[0-9]*']"
	 * )); creditcardordebitcardnumber.click();
	 * 
	 * WebElement expirationmonth =
	 * driver.findElement(By.xpath("//select[@class='tb-select' and @id='expMonth']"
	 * )); expirationmonth.click();
	 * 
	 * WebElement expirationyear =
	 * driver.findElement(By.xpath("//select[@class='tb-select' and @id='expYear']")
	 * ); expirationyear.click();
	 * 
	 * WebElement securitycode = driver.findElement(By.
	 * xpath("//input[contains(@class, 'tb-input') and contains(@class, 'v-medium') and @id='cvv']"
	 * )); securitycode.click();
	 * 
	 * WebElement placeyourorder =
	 * driver.findElement(By.xpath("//span[text() = 'Place Your Order']"));
	 * placeyourorder.click();
	 * 
	 * WebElement continuetopaymentinformation = driver.findElement(By.
	 * xpath("//span[text()='Continue to Payment Information']"));
	 * continuetopaymentinformation.click();
	 * 
	 * }
	 */

	public String CaptureScreen(String snap) throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("src/screenshots/" + snap + System.currentTimeMillis() + ".png");
		String absolutepath_screen = destinationfile.getAbsolutePath();

		FileUtils.copyFile(srcFile, destinationfile);

		System.out.println("Screenshot captured at: " + absolutepath_screen);

		return absolutepath_screen;
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
		
	public static String[][] readExcel(String sheetName) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./data/CommonData.xlsx");
		XSSFSheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}
		}
		book.close();
		return data;
	}
}