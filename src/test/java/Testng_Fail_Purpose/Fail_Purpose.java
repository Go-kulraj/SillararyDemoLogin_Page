package Testng_Fail_Purpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fail_Purpose {
	
	@Test
	public void Amazon() throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("https://www.amazon.in/");
		 
		 Thread.sleep(2000);
		 driver.close();
	}
	
	}



