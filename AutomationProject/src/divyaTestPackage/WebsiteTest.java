package divyaTestPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
			
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;     
driver.get("http://practice.automationtesting.in/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[normalize-space()='Shop']")).click();

//Thread.sleep(2000);
driver.navigate().back();
driver.navigate().forward();
driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();


		
		  
		  
int sliders= driver.findElements(By.className("n2-ss-slide-background-image")).size();
		
System.out.println("total number of sliders present: "+sliders);

driver.findElement(By.className("woocommerce-LoopProduct-link")).click();
//Thread.sleep(3000);	 

driver.findElement(By.xpath("//input[@name='add-to-cart']")).submit();

driver.findElement(By.className("description_tab")).click();

driver.findElement(By.id("tab-description")).click();
//Thread.sleep(3000);

driver.findElement(By.className("reviews_tab")).click();
driver.findElement(By.className("woocommerce-Reviews-title")).click();
//Thread.sleep(2000);

String cart_contents = driver.findElement(By.xpath("//span[@class='cartcontents']")).getText();
System.out.println("the cart contents is: " + cart_contents); 

if (cart_contents.contentEquals("1 Item"))
	System.out.println("Test Passed");
else 
	System.out.println("Test Failed");

int links= driver.findElements(By.tagName("a")).size();
System.out.println("total no of links is :" + links);

WebElement cart= driver.findElement(By.className("cartcontents"));
cart.click();
System.out.println("Menu items are displayed");
driver.navigate().to("http://practice.automationtesting.in/");

driver.findElement(By.className("button")).click();
driver.findElement(By.linkText("View Basket")).click();

System.out.println("Add to cart is working");

String cart_contents2 = driver.findElement(By.xpath("//span[@class='cartcontents']")).getText();

System.out.println("the cart contents is: " + cart_contents2 ); 
if (cart_contents2 .contentEquals("2 Items"))
	System.out.println("Test Passed");
else 
	System.out.println("Test Failed");
driver.close();
		}
		  
	}


