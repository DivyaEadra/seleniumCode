package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagAndId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://www.facebook.com");
		  driver.manage().window().maximize();	
		  //tag and id use# and id name
		 driver.findElement(By.cssSelector("#email")).sendKeys("divya.eadara@gmail.com");
		 //tag and class use . and class name
		 driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc");
		  //Tag and Attribute use square bracket [any attribute name or class or id]
		  
		 driver.findElement(By.cssSelector("[name=pass]")).sendKeys("password");
		  //Tag,class and attribute("tagname.classname[attribute name]")
		  driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("divu@gmail.com");
		  
	}

}
