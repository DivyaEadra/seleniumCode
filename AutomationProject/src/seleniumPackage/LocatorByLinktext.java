package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://www.automationpractice.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Printed Summer Dress")).click();
		  driver.findElement(By.partialLinkText("Summer Dress")).click();
		  driver.close();
	}

}
