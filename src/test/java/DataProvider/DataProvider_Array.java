package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;


public class DataProvider_Array {
	
	
	//@org.testng.annotations.DataProvider

	public Object [][] getData()
	{
		
		Object [][] a=new Object[3][2];
		a[0][0]="abcd";
		a[0][1]="abcd1124";
		

				
		a[1][0]="abcd";
		a[1][1]="abcd11114441";
			
		a[2][0]="abcd";
		a[2][1]="abcd11155511";		
		return a;		
		
		
	}
@Test(dataProvider="getdata")
public void demo(String Usernmae, String pwd) {
	WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.id("email")).
	
}
}
