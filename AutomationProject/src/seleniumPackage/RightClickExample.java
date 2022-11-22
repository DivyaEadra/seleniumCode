package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		  driver.manage().window().maximize();
		  Actions action = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	action.contextClick(rightclick).build().perform();
	driver.close();
	}

}
