package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://training.qaonlinetraining.com/testPage.php");
		  driver.manage().window().maximize();
		  
		WebElement checkboxBike=  driver.findElement(By.xpath("//input[@name='bike']"));
		WebElement checkboxCar=  driver.findElement(By.xpath("//input[@name='car']"));
		WebElement checkboxBoat=  driver.findElement(By.xpath("//input[@name='boat']"));
		WebElement checkboxHorse=  driver.findElement(By.xpath(" //input[@name='horse']"));
	
		WebElement submitButton=  driver.findElement(By.xpath("//input[@name='submit']"));
		
		checkboxBike.click();
		checkboxCar.click();
		checkboxBoat.click();
		checkboxHorse.click();
		
		System.out.println("wait 5 seconds and submit and close");
		
		submitButton.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
