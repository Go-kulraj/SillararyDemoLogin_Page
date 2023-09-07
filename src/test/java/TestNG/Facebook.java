package TestNG;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties; 
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	@Test
	public void fb() throws Throwable {
		WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");	
		 Thread.sleep(2000);
		 driver.close();
		
	}
}
