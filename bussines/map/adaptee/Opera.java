package map.adaptee;

import org.openqa.selenium.WebDriver;

import com.opera.core.systems.OperaDriver;



public class Opera{

	public Opera() {
		System.out.println("Opera has been initialized");
	}
	
	public void openOpera(WebDriver driver) {
		driver =((new OperaDriver()));
		System.out.println("getting Opera Browser");	
	}

}
