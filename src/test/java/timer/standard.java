package timer;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.Point;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager; 


public class standard {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.id("email"));
Point Coordinate=ele.getLocation();
System.out.println(Coordinate.getX());
System.out.println(Coordinate.getY());






		
		
		

	}

}
