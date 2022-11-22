package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://training.qaonlinetraining.com/testPage.php");
		  driver.manage().window().maximize();
		 
		  driver.findElement(By.id("alert")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(6000);
		alert.accept();
		
		driver.findElement(By.id("confirm")).click();
		Alert alert1= driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(6000);
		alert1.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Alert alert2= driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(6000);
	alert2.sendKeys("Mr.Bond");
	alert2.accept();
	
	driver.close();
		
		
	}

}
