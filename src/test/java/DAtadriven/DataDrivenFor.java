package DAtadriven;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.util.Properties; 
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver;
public class DataDrivenFor {

	public static void main(String[] args) throws Throwable {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		

	}

}
