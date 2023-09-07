package Pom_Practice;


import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties; 
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver;

import POM.Fb_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");	
		 Fb_LoginPage FbLogin = new Fb_LoginPage(driver);//here use what POM name we created in src/main resource (Fb_Login name is POM)
		FbLogin.emailTextField("Gokul");
		FbLogin.passwordtextfield("Raja");
		FbLogin.loginBtn();
	}

}
