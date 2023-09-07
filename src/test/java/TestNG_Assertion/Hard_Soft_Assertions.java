package TestNG_Assertion;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hard_Soft_Assertions {

	@Test
	public void Assertions()
	{
		

		WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.amazon.in/");	
		}
		
		
		
		
	}
	
	
}

