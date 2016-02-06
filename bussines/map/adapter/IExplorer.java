package map.adapter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import map.target.Browser;

public class IExplorer extends Browser{
	private WebDriver driver;
	
	public IExplorer() {
		super();
		System.out.println("Internet Explorer has been initialized");;
	}


	@Override
	public void launchBrowser(WebDriver driver) {
		System.setProperty("webdriver.ie.driver", "src/browsers/IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		setDriver(((new InternetExplorerDriver())));
		System.out.println("launching Internet-Explorer Browser");
	}
	
	@Override
	public void closeBrowser() {
		driver.quit();
		System.out.println("Closing Internet-Explorer Browser");
		
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
