package Filedownload;
import java.io.File; import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
 import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
 import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Downlaod {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[text()='sample.png']")).click();

	}

}
