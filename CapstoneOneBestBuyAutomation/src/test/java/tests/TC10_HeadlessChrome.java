package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecifications;

@Test

public class TC10_HeadlessChrome extends ProjectSpecifications {
	
	public void HeadlessChrome() {
		
		HeadlessChrome();
		
		driver.quit();
	}
}
	

