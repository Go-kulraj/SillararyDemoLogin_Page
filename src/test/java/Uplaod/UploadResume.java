package Uplaod;
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
 import org.openqa.selenium.interactions.Actions;



public class UploadResume {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\Documents\\Gokulraj's Resume (1)");
		
		

	}}


