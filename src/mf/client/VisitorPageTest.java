package mf.client;

import mfp.factory.webFactoryPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class VisitorPageTest

{
	public String baseUrl="file:///G:/devs/arquitectura";

	@Test
	// This is TestNG annotation
	public void test1() 
	{	
		try {
			webFactoryPattern webDriver = new webFactoryPattern(baseUrl);
			WebDriver driver = webFactoryPattern.buildBrowser(webFactoryPattern.Browser_Chrome);
			webDriver.getManesWinchsterHomePO().getUrl();
			Thread.sleep(5000);
			webDriver.getManesWinchsterHomePO().areBasicElementsDisplayed();
			Thread.sleep(3500);
			webDriver.getManesWinchsterHomePO().clickaboutButtonPath();
			Thread.sleep(3500);
			webDriver.getManesWinchsterHomePO().clickpracticesButtonPath();
			Thread.sleep(3500);
			webDriver.getManesWinchsterHomePO().clickcontactButtonPath();
			Thread.sleep(3500);
			driver.close();
		}	 catch (Exception e) {
		// TODO: handle exception
		}
	
		
	}
	
}