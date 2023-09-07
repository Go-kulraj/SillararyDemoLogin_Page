
public class Location {

	
	public static void main(String[] args) {
	

		public class Startingstage {

			public static void main(String[] args)  {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hi");
				
			}

				
				

			


				
			

		}


	}

}
