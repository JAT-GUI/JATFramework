package mfp.product;

import mfp.productBase.ElementPath;
import mfp.productBase.PageObjectPB;
import mfp.productBase.PageObjectPBI;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class ManesWinchsterPracticesPO extends PageObjectPB implements PageObjectPBI{
	String Url="/practices.html";
	public ManesWinchsterPracticesPO(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	private ElementPath aboutButtonPath = new ElementPath(ElementPath.xpath,"//*[text()='About']");
	/*
	private String aboutButtonPath = "//*[text()='About']";
	private String aboutButtonPathType = type_xpath;
	*/
	public void clickaboutButtonPath(){
		try {
			findElement(aboutButtonPath).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isaboutButtonPathDsipayed(){
		try {
			return findElement(aboutButtonPath).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	/*
	public static class Test
	{
		public static void main(final String[] args){
			WebDriver driver = new FirefoxDriver();
			if(driver != null){
				GooglePO mvpo = new GooglePO(driver);
				driver.get(mvpo.URL);
				mvpo.enterSearchInputText("factory pattern");
				mvpo.clickSearchButton();
			}
			
		}
	
	}
	*/

	@Override
	public boolean areBasicElementsDisplayed() {
		if(!isaboutButtonPathDsipayed()) return false;
		return true;
	}

	@Override
	public void setBaseUrl(String baseUrl) {
		this.setBaseUrl(baseUrl);
	}

	@Override
	public void getUrl() {
		driver.get(getBaseUrl()+this.Url);
	}

	@Override
	public void validatePageElements(boolean showWarnings) {
		// TODO Auto-generated method stub
		
	}
}
