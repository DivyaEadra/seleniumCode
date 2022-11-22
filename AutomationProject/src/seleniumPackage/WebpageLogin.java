package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("https://admin-demo.nopcommerce.com/login");
		  WebElement email = driver.findElement(By.name("Email"));
		  email.clear();
		  email.sendKeys("admin@yourstore.com");
		  
		  WebElement password =  driver.findElement(By.name("Password"));
		  password.clear();
		  password.sendKeys("admin");
		  driver.findElement(By.className("button-1")).click();
		  
		  driver.close();
	}

}
