package DAtadriven;


import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class PropertyFile {



	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
p.load(fis);

String url = p.getProperty("Url");
String user = p.getProperty("username");
p.getProperty(user);
String pass = p.getProperty("password");

///WebDriverManager.chromedriver().setup();
//WebDriver driver=new ChromeDriver();

WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(url);
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(user);
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);

	

}
}
