package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("https://www.itlearn360.com/");
		  driver.manage().window().maximize();
		  int count=0;
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	for( WebElement link: allLinks){
		   System.out.println(link.getAttribute("href"));
           count ++;
	}
	
	 System.out.println("total number of links present: "+count);
	 driver.close();
	}

}
