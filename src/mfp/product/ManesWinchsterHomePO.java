package mfp.product;

import mfp.productBase.ElementPath;
import mfp.productBase.PageObjectPB;
import mfp.productBase.PageObjectPBI;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class ManesWinchsterHomePO extends PageObjectPB implements PageObjectPBI{
	String Url="/index.html";
	public ManesWinchsterHomePO(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	private ElementPath homeButtonPath = new ElementPath(ElementPath.xpath,"//*[text()='Home']");
	private ElementPath aboutButtonPath = new ElementPath(ElementPath.xpath,"//*[text()='About']");
	private ElementPath practicesButtonPath = new ElementPath(ElementPath.xpath,"//*[text()='Practices']");
	private ElementPath contactButtonPath = new ElementPath(ElementPath.xpath,"//*[text()='Contact']");
	
	/*
	private String homeButtonPath = "//*[text()='Home']";
	private String homeButtonPathType = type_xpath;
	private String aboutButtonPath = "//*[text()='About']";
	private String aboutButtonPathType = type_xpath;
	private String practicesButtonPath = "//*[text()='Practices']";
	private String practicesButtonPathType = type_xpath;
	private String contactButtonPath = "//*[text()='Contact']";
	private String contactButtonPathType = type_xpath;
	*/
	public void clickhomeButtonPath(){
		try {
			findElement(homeButtonPath).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean ishomeButtonPathDsipayed(){
		try {
			return findElement(homeButtonPath).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
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
	
	public void clickpracticesButtonPath(){
		try {
			findElement(practicesButtonPath).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean ispracticesButtonPathDsipayed(){
		try {
			return findElement(practicesButtonPath).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void clickcontactButtonPath(){
		try {
			findElement(contactButtonPath).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean iscontactButtonPathDsipayed(){
		try {
			return findElement(contactButtonPath).isDisplayed();
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
		if(!ishomeButtonPathDsipayed()) return false;
		if(!isaboutButtonPathDsipayed()) return false;
		if(!ispracticesButtonPathDsipayed()) return false;
		if(!iscontactButtonPathDsipayed()) return false;
		System.out.print("the basic elements are displayed");
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
