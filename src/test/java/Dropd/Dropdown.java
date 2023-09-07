package Dropd;
import java.util.List;

import java.util.concurrent.TimeUnit; 


import org.openqa.selenium.Point;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager; 
public class Dropdown {


	
	public static void main(String[] args) throws Throwable  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

	 Select s=new Select(dropDown);
	 s.selectByIndex(4);
	 Thread.sleep(2000);
	 s.selectByValue("search-alias=baby");
	 Thread.sleep(2000);
	 s.selectByVisibleText("Apps & Games");
	 List<WebElement> alloptions = s.getOptions();
	 for ( WebElement b: alloptions);
	


	
	
	 
	 
	

	
		
		
;
	}

}
