package DAtadriven;

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

import io.github.bonigarcia.wdm.WebDriverManager;
public class DataDrivenExel {

	public static void main(String[] args) throws Throwable {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
 String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
 String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
 String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
 System.out.println(username);
 System.out.println(password);
 WebDriverManager.edgedriver().setup();
 WebDriver driver=new EdgeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get(url);
String title = driver.getTitle();

wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
wb.write(fos);





	}

}
