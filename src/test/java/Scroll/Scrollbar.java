package Scroll;
import java.util.List;

import java.util.concurrent.TimeUnit; 


import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;



import io.github.bonigarcia.wdm.WebDriverManager; 

public class Scrollbar {

	


	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
	//	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeAsyncScript(null, args)
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",career);
		//js.executeScript("arguments[0].scrollIntoView();",career);
		js.executeScript("arguments[0].scrollIntoView();",career);  
//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("arguments[0].scrollIntoView();",career);
		Thread.sleep(3000);
		career.click();
		
		
		

	}

}
