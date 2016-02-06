package map.adapter;

import map.adaptee.Opera;
import map.target.Browser;

import org.openqa.selenium.WebDriver;

public class OperaAdapter extends Browser{
	private WebDriver driver;
	private Opera opera;
	
	public OperaAdapter() {
		super();
		this.opera = new Opera();
		System.out.println("Opera adapter has been initialized");
	}

	@Override
	public void launchBrowser(WebDriver driver) {
		opera.openOpera(driver);
		System.out.println("launching Opera Browser by adapter");
		
	}

	@Override
	public void closeBrowser() {
		driver.close();
		System.out.println("Closing Opera Browser");
		
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
