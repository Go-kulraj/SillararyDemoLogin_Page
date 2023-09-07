package SampleProgram;


import java.io.File; import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.OutputType;
 import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import genericLibraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
 import org.openqa.selenium.By;


public class Samplepro {



	public static void main(String[] args) {
		WebDriverUtilities utilities=new WebDriverUtilities(); 
		WebDriverManager.edgedriver().setup(); 
		
	
		
		// opening chrome browser
		WebDriver driver = new EdgeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//implicit statement 
		utilities.implictWaitMethod(driver, 10);
		driver.get("https://www.amazon.in/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']")); 
		utilities.dropDown(dropDown, "Baby"); 

		

			

	}

}
