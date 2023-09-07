package POM;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;





//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class Fb_LoginPage {
	
	
	//Declaration
	//address of email text field
	
	@FindBy(id="email")
	private WebElement emailTf;
	
	//address of password text field
	
	//@FindBy(//input[@type='password'])
			@FindBy(id="pass")
			private WebElement passwordTf;
			//address login text Field
			
			@FindBy(xpath="//button[@name='login']")
			private WebElement loginBtn;
			
			
			//Initialization
			
			public Fb_LoginPage(WebDriver driver)
			{
				
				PageFactory.initElements(driver, this);
			}
			
			///Utilization
			
			public void emailTextField(String Value) {
				emailTf.sendKeys(Value);
				
			}
			public void passwordtextfield(String Value) {
				passwordTf.sendKeys(Value);
			}
			
			public void loginBtn() {
			
		
				loginBtn.click();
			}

		
			
			
			
			//getter and setter
			public WebElement getEmailTf() {
				return emailTf;
			}

			public void setEmailTf(WebElement emailTf) {
				this.emailTf = emailTf;
			}

			public WebElement getPasswordTf() {
				return passwordTf;
			}

			public void setPasswordTf(WebElement passwordTf) {
				this.passwordTf = passwordTf;
			}

			public WebElement getLoginbtn() {
				return loginbtn;
			}

			public void setLoginbtn(WebElement loginbtn) {
				this.loginbtn = loginbtn;
			}

			public void loginbutton() {
				// TODO Auto-generated method stub
				
			}
			
			// getter and setter 
			
	
	
	
	
	
}


