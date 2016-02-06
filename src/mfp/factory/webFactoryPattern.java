package mfp.factory;

import map.adapter.Chrome;
import map.adapter.Firefox;
import map.adapter.IExplorer;
import map.adapter.OperaAdapter;
import map.target.Browser;
import mfp.product.GooglePO;
import mfp.product.GoogleResultsPagePO;
import mfp.product.ManesWinchsterAboutPO;
import mfp.product.ManesWinchsterContactsPO;
import mfp.product.ManesWinchsterHomePO;
import mfp.product.ManesWinchsterPracticesPO;

import org.openqa.selenium.WebDriver;

public class webFactoryPattern {
	private String baseUrl ="";
	private static WebDriver driver;
	//public static String browserStackWebDriver = "browserStack";
	//boolean remote = false;
	//String methodName;
	public final static String Browser_Chrome = "Chrome";
	public final static String Browser_Firefox = "Firefox";
	public final static String Browser_IExplorer = "Internet Explorer";
	public final static String Browser_Opera = "Opera";
	
	/*
	 * all page objects
	 */
	
	
	ManesWinchsterHomePO manesWinchsterHomePO;
	ManesWinchsterAboutPO manesWinchsterAboutPO;
	ManesWinchsterPracticesPO manesWinchsterPracticesPO;
	ManesWinchsterContactsPO manesWinchsterContactsPO;
	GoogleResultsPagePO googleResultsPagePO;
	
	/*
	 * 
	 */
	public webFactoryPattern(String baseUrl){
		this.baseUrl = baseUrl;
		/*googlePO = null;
		manesWinchsterHomePO = null;
		manesWinchsterAboutPO = null;
		manesWinchsterPracticesPO = null;
		manesWinchsterContactsPO = null;
		googleResultsPagePO = null;
		*/
	}
	
	/*
	 * Build browser method
	 */
	
	public static WebDriver buildBrowser(String Browser_Type){

		Browser browser = null; 
		try {
			switch (Browser_Type) {
			case Browser_Chrome :
				browser = new Chrome();
				browser.launchBrowser(driver);
				break;
					
			case Browser_Firefox:
				browser = new Firefox();
				browser.launchBrowser(driver);
				break;
			
			case Browser_IExplorer:
				browser = new IExplorer();
				browser.launchBrowser(driver);
				break;
			
			case Browser_Opera:
				browser = new OperaAdapter();
				browser.launchBrowser(driver);
				break;
				
			default:
				System.out.println("no Browser found !!!!");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver = browser.getDriver();
		return driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	/*
	 * all getters for page objects
	 */
	public void cleanWebDriver(){
		/*
		googlePO = null;
		manesWinchsterHomePO = null;
		manesWinchsterAboutPO = null;
		manesWinchsterPracticesPO = null;
		manesWinchsterContactsPO = null;
		googleResultsPagePO = null;
		*/
		/*
		 * all page objects to null
		 */
	}
	/*
	 * all page objects
	 */

	public GooglePO getGooglePO(){
		if (googlePO == null) {
			googlePO = new GooglePO(driver, baseUrl);
		}
		return googlePO;
	}
	
	public ManesWinchsterHomePO getManesWinchsterHomePO(){
		if (manesWinchsterHomePO == null) {
			manesWinchsterHomePO = new ManesWinchsterHomePO(driver, baseUrl);
		}
		return manesWinchsterHomePO;
	}
	
	public ManesWinchsterAboutPO getManesWinchsterAboutPO(){
		if (manesWinchsterAboutPO == null) {
			manesWinchsterAboutPO = new ManesWinchsterAboutPO(driver, baseUrl);
		}
		return manesWinchsterAboutPO;
	}
	
	public ManesWinchsterPracticesPO getManesWinchsterPracticesPO(){
		if (manesWinchsterPracticesPO == null) {
			manesWinchsterPracticesPO = new ManesWinchsterPracticesPO(driver, baseUrl);
		}
		return manesWinchsterPracticesPO;
	}
	
	public ManesWinchsterContactsPO getWinchsterContactsPO(){
		if (manesWinchsterContactsPO == null) {
			manesWinchsterContactsPO = new ManesWinchsterContactsPO(driver, baseUrl);
		}
		return manesWinchsterContactsPO;
	}
	
	public GoogleResultsPagePO getGoogleResultsPagePO(){
		if (googleResultsPagePO == null) {
			googleResultsPagePO = new GoogleResultsPagePO(driver, baseUrl);
		}
		return googleResultsPagePO;
	}
	GooglePO googlePO;
}
