package mf.client;

import mfp.factory.webFactoryPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class sampleTest

{
	public String baseUrl="https://www.google.com";

	@Test
	// This is TestNG annotation
	public void testRegister() 
	{	
		webFactoryPattern webDriver = new webFactoryPattern(baseUrl);
		WebDriver driver = webFactoryPattern.buildBrowser(webFactoryPattern.Browser_Chrome);
		System.out.println(webDriver.getGooglePO().getBaseUrl());
		webDriver.getGooglePO().getUrl();
		webDriver.getGooglePO().enterSearchInputTextPath("hola mundo");
		
		try {
			Thread.sleep(3500);
			webDriver.getGoogleResultsPagePO().clickfirsResultLinkPath();
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
			driver.navigate().back();
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no hubo espera");
		}
		
		driver.close();
	}
	
}