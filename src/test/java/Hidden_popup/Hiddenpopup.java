package Hidden_popup;
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
public class Hiddenpopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Aug']/../../..//span[text()='27']")).click();
		
		

	}

}
