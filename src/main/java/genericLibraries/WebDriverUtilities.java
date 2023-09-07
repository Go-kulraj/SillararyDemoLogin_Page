package genericLibraries;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class WebDriverUtilities {
	public void mouseOvering(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
		
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	public void dragAndDrop(WebDriver driver,WebElement ele1, WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
		
		
	}	
public void dropDown(WebElement ele,String Value)
{
	 Select s = new Select(ele);
	 s.selectByVisibleText(Value);
}
	
	
	
	

	public void frame (WebDriver driver, String ele) {
driver.switchTo().frame(ele);
	}

public void frame (WebDriver driver) {
	driver.switchTo().defaultContent();
}
public void implictWaitMethod(WebDriver driver, int time ) {
driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}
public void alterpopAccept(WebDriver driver)
{
	driver.switchTo().alert().accept();
}

public void alterpopUPDismiss(WebDriver driver) 
{
	driver.switchTo().alert().dismiss();
}

public void parentWindow(WebDriver driver)
{
	driver.getWindowHandle();
}
public void childwindow(WebDriver driver)
{
	driver.getWindowHandle();
}

public void implicitWaitMethod(WebDriver driver, int i) 
{
	// TODO Auto-generated method stub
	
}

public void implicitWaitMethod(WebDriver driver, int i)
{
	// TODO Auto-generated method stub
	
}
}