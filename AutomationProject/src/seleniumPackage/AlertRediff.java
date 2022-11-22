package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertRediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("proceed")).click();
		  Alert alert= driver.switchTo().alert();
		  System.out.println(alert.getText());
		  Thread.sleep(5000);
		  alert.accept();
		  driver.close();
	}

}
