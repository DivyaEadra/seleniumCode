package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	
		        WebDriver browserObject = new ChromeDriver();
			
		        browserObject.get("http://www.google.com/");
		        
	}
	

}
