package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(0);
		WebElement source=  driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=  driver.findElement(By.xpath("//div[@id='droppable']"));
Thread.sleep(3000);
Actions act= new Actions(driver);
	act.dragAndDrop(source, target).build().perform();
	Thread.sleep(3000);
	driver.close();
	}

}
