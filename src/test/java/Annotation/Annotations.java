package Annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void openong() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	 
	 @Test(priority=1, invocationCount=5)
	 public void fblogin() {
	 
	 driver.get("https://www.facebook.com/");	
	 
	
		
	}
	 @Test(priority=-1)
	 public void Azlogin() {
	 
	 driver.get("https://www.amazon.in/");	
	 
	 
	 }
	 
	 @AfterMethod
	 public void closing() {
		 driver.close();
	 }
}
