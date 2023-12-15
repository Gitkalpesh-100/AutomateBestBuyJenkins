package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecifications;

public class TC10_HeadlessChrome extends ProjectSpecifications {
	
	@Test
	public void HeadlessChrome() {
		
		HeadlessChrome();
		
		driver.quit();
	}
}
	

