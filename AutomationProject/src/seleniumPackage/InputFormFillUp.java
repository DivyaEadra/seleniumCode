
package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputFormFillUp {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			  WebDriver driver = new ChromeDriver();
				
		       driver.get("http://training.qaonlinetraining.com/testPage.php");
		   driver.findElement(By.name("name")).sendKeys("Divya");    
		   driver.findElement(By.name("email")).sendKeys("divya.eadara2@gmail.com");   
		   driver.findElement(By.name("website")).sendKeys("qaonlinetraining.com");    
		   driver.findElement(By.name("comment")).sendKeys("website is good"); 
		       driver.findElement(By.name("submit")).click();
		//driver.close();
		}

}
