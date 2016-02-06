package mfp.productBase;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;



public class PageObjectPB {
	public WebDriver driver;
	private String baseUrl;

	public PageObjectPB(WebDriver driver, String baseUrl){
		this.driver = driver;
		this.baseUrl=baseUrl;
	}
	
	public String getBaseUrl(){
		return this.baseUrl;
	}
	
	protected WebElement findElement(ElementPath elementPath){
		try {
			if(elementPath.pathType==ElementPath.xpath){
				return driver.findElement(By.xpath(elementPath.path));
			}else if(elementPath.pathType==ElementPath.css){
				return driver.findElement(By.cssSelector(elementPath.path));
			}else if(elementPath.pathType==ElementPath.className){
				return driver.findElement(By.className(elementPath.path));
			}else if(elementPath.pathType==ElementPath.id){
				return driver.findElement(By.id(elementPath.path));
			}else if(elementPath.pathType==ElementPath.linkText){
				return driver.findElement(By.linkText(elementPath.path));
			}else if(elementPath.pathType==ElementPath.tagName){
				return driver.findElement(By.tagName(elementPath.path));
			}else if(elementPath.pathType==ElementPath.partialLinkText){
				return driver.findElement(By.partialLinkText(elementPath.path));
			}else if(elementPath.pathType==ElementPath.name){
				return driver.findElement(By.name(elementPath.path));
			}else if(elementPath.pathType==""){ // xpath by default
				return driver.findElement(By.xpath(elementPath.path));
			}else{
				System.err.println("Error: "+elementPath.pathType +" Type not found");
			}
		} catch (Exception e) {
			System.err.println("Error: "+elementPath.pathType+" with path: "+elementPath.path +" not found");
		}
		return null;
	}
	
	protected List<WebElement> findElements(ElementPath elementPath){
		try {
			if(elementPath.pathType==ElementPath.xpath){
				return driver.findElements(By.xpath(elementPath.path));
			}else if(elementPath.pathType==ElementPath.css){
				return driver.findElements(By.cssSelector(elementPath.path));
			}else if(elementPath.pathType==ElementPath.className){
				return driver.findElements(By.className(elementPath.path));
			}else if(elementPath.pathType==ElementPath.id){
				return driver.findElements(By.id(elementPath.path));
			}else if(elementPath.pathType==ElementPath.linkText){
				return driver.findElements(By.linkText(elementPath.path));
			}else if(elementPath.pathType==ElementPath.tagName){
				return driver.findElements(By.tagName(elementPath.path));
			}else if(elementPath.pathType==ElementPath.partialLinkText){
				return driver.findElements(By.partialLinkText(elementPath.path));
			}else if(elementPath.pathType==ElementPath.name){
				return driver.findElements(By.name(elementPath.path));
			}else if(elementPath.pathType==""){ // xpath by default
				return driver.findElements(By.xpath(elementPath.path));
			}else{
				System.err.println("Error: "+elementPath.pathType +" Type not found");
			}
		} catch (Exception e) {
			System.err.println("Error: "+elementPath.pathType+" with path: "+elementPath.path +" not found");
		}
		return null;
	}
	
	public boolean isTextPresent(String text){
		return driver.getPageSource().contains(text);
	}
	/*
	public void verifyFoundPage(int waitTime, String URL, String errorMessage) {

		final String thisURL = new String(URL);
		try{
			(new WebDriverWait(driver, waitTime)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return d.getCurrentUrl().contains(thisURL);
						}
					});
		}catch (TimeoutException e){
			Reporter.log("Failed to find: " + thisURL);
		}
	}
	*/
}
