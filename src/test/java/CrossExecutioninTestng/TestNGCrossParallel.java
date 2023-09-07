package CrossExecutioninTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Parameters;




public class TestNGCrossParallel
{
//Parameters({"browsername"})/Parameters({"browsername"})
@Parameters({"browsername"})

	@Test
	public void crossBroswer (String browser)throws Throwable {
	
		WebDriver driver;
		
		if(browser.equals("edge")) {
			
		
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		}
		else {
			//WebDriverManager.Firefoxdriver().setup();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		 driver.close();
		

}
}