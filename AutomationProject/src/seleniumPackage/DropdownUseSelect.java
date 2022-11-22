package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUseSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://training.qaonlinetraining.com/testPage.php");
		  driver.manage().window().maximize();
		 Select CountrySelect= new Select( driver.findElement(By.name("country")));
		
		 CountrySelect.selectByVisibleText("USA");
		 CountrySelect.selectByVisibleText("India");
		
		 Select SkillSelect= new Select(driver.findElement(By.name("skill")));
		 SkillSelect.selectByVisibleText("Database");
		 SkillSelect.selectByVisibleText("Programming");
		try {
			 driver.findElement(By.name("submit")).click();
		} catch(Exception e) {
			System.out.println("Exception occured"+e.getMessage());
		}
		
		 driver.close();
	}

}
