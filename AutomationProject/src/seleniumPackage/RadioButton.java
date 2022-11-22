package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://training.qaonlinetraining.com/testPage.php");
		  driver.manage().window().maximize();
		  WebElement radioButtonFemale = driver.findElement(By.xpath("//body/form[1]/input[4]"));
		  WebElement radioButtonMale =  driver.findElement(By.xpath("//body/form[1]/input[5]"));
		  WebElement radioButtonOther =  driver.findElement(By.xpath("//input[@id='other']"));
		  WebElement submitButton =  driver.findElement(By.xpath(" //body/form[1]/input[11]"));
		  
		  radioButtonFemale.click();
		  
		  Thread.sleep(7000);
		  
		  radioButtonMale.click();
		  Thread.sleep(5000);
		  
		  radioButtonOther.click();
		  Thread.sleep(5000);
		  
		  submitButton.submit();
		  driver.close();
		  
	}

}
