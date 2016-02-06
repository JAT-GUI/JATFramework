package map.target;

import org.openqa.selenium.WebDriver;

public abstract class Browser {
	abstract public void launchBrowser(WebDriver driver);
	abstract public void closeBrowser();
	abstract public WebDriver getDriver();
	abstract public void setDriver(WebDriver driver);
}
