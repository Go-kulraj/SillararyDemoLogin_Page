
public class Righrclick {
	import java.util.concurrent.TimeUnit; 


	import org.openqa.selenium.Point;

	import org.openqa.selenium.By; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.xpath("\"//input[@id='twotabsearchtextbox']));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	
	}}
	}

}
