package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCodeGoogle {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			  WebDriver driver = new ChromeDriver();
				
		      driver.get("http://www.google.com");
		       driver.manage().window().maximize();
		      driver.findElement(By.name("q")).sendKeys(" selenium Python");
		      
		      driver.findElement(By.name("btnK")).submit();
		      
		    
		}

}
