package mfp.product;

import mfp.productBase.ElementPath;
import mfp.productBase.PageObjectPB;
import mfp.productBase.PageObjectPBI;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class GooglePO extends PageObjectPB implements PageObjectPBI{
	String URL="";
	public GooglePO(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	private ElementPath searchInputTextPath = new ElementPath(ElementPath.css,"[role='combobox']");
	private ElementPath searchButtonPath = new ElementPath(ElementPath.css,"[role='option']");
	//private String searchInputTextPath = "[role='combobox']";
	//private String searchInputTextPathType = type_css;
	//private String searchButtonPath = "[role='option']";
	//private String searchButtonPathType = type_css;
	
	public void enterSearchInputTextPath(String keys){
		try {
			findElement(searchInputTextPath).sendKeys(keys);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isSearchInputTextPathDisplayed(){
		try {
			return findElement(searchInputTextPath).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickSearchButtonPath(){
		try {
			findElement(searchButtonPath).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isSearchButtonPathDsipayed(){
		try {
			return findElement(searchButtonPath).isDisplayed();
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
		if(!isSearchButtonPathDsipayed()) return false;
		if(!isSearchInputTextPathDisplayed())return false;
		return true;
	}

	@Override
	public void setBaseUrl(String baseUrl) {
		this.setBaseUrl(baseUrl);
	}

	@Override
	public void getUrl() {
		driver.get(getBaseUrl()+this.URL);
	}

	@Override
	public void validatePageElements(boolean showWarnings) {
		// TODO Auto-generated method stub
		
	}
}
