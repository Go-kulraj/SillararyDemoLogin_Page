package Google;

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

import io.github.bonigarcia.wdm.WebDriverManager; 



public class GooleSearch {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("Phone");
List<WebElement>allList=driver.findElements(By.xpath("//li [@data-view-type='1']"));
		for (WebElement list:allList) {
			System.out.println(list.getText());
		}
	
		

	

	}

}
