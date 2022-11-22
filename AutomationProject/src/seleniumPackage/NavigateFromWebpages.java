package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFromWebpages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
			
	     
		  driver.get("http://www.google.com");
	      System.out.println("this is " + driver.getTitle() + " website");
	      System.out.println("url is: " + driver.getCurrentUrl());
	    
	      driver.navigate().to("http://www.instagram.com/");
	     System.out.println("this is " + driver.getTitle() + " website");
	      System.out.println("url is: " + driver.getCurrentUrl());
	     
	      driver.navigate().to("http://www.amazon.com/");
		     System.out.println("this is " + driver.getTitle() + " website");
		      System.out.println("url is: " + driver.getCurrentUrl());
		     
		      driver.navigate().to("http://www.facebook.com/");
			     System.out.println("this is " + driver.getTitle() + " website");
			      System.out.println("url is: " + driver.getCurrentUrl());
			     
			      driver.navigate().to("http://www.github.com/");
				     System.out.println("this is " + driver.getTitle() + " website");
				      System.out.println("url is: " + driver.getCurrentUrl());
				     
				      driver.navigate().to("http://www.twitter.com/");
					     System.out.println("this is " + driver.getTitle() + " website");
					      System.out.println("url is: " + driver.getCurrentUrl());
					     		      
					     driver.navigate().back();
					     System.out.println("this is " + driver.getTitle() + " website");
					        System.out.println("url is: " + driver.getCurrentUrl());
				     
					        driver.navigate().back();
					        driver.navigate().forward();
					        System.out.println("this is " + driver.getTitle() + " website");
					        System.out.println("url is: " + driver.getCurrentUrl());
					        driver.close();
	}

}
