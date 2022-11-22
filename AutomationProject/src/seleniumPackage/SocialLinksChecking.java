package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialLinksChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	       driver.get("http://www.itlearn360.com");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.className("fa-facebook")).click();
	       driver.navigate().back();
	       
	       driver.findElement(By.className("fa-twitter")).click();
	       driver.navigate().back();
	      
	       driver.findElement(By.className("fa-instagram")).click();
	    driver.navigate().back();
	    
	    driver.findElement(By.className("fa-youtube")).click();
	    driver.navigate().back();
	    
	    driver.findElement(By.className("fa-linkedin")).click();
	    driver.navigate().back();
	   
	    driver.close();
	}

}
