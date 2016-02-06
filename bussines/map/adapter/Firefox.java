package map.adapter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import map.target.Browser;


public class Firefox extends Browser{
	private WebDriver driver;
	
	public Firefox() {
		super();
		System.out.println("Firefox has been initialized");
	}
	
	@Override
	public void launchBrowser(WebDriver driver) {
		setDriver(((new FirefoxDriver())));
		System.out.println("launching Firefox Browser");	
	}

	@Override
	public void closeBrowser() {
		driver.close();
		System.out.println("Closing Firefox Browser");
		
	}

	@Override
	public WebDriver getDriver() {
		return driver;
	}

	@Override
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
