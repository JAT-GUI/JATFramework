package map.adapter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import map.target.Browser;

public class Chrome extends Browser{
	private WebDriver driver;
	
	public Chrome() {
		super();
		System.out.println("Chrome has been initialized");
	}

	@Override
	public void launchBrowser(WebDriver driver) {
		setDriver(driver);
		System.setProperty("webdriver.chrome.driver", "bussines/browsers/chromedriver.exe");
		setDriver(((new ChromeDriver())));
		System.out.println("launching Chrome Browser");
	}

	@Override
	public void closeBrowser() {
		driver.close();
		System.out.println("Closing Chrome Browser");
		
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
