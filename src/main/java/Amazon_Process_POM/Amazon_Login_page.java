package Amazon_Process_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_page 
{
	WebDriver driver;
	//Locating the Elements using the FindBy Annotation
	@FindBy(name ="email")
	WebElement mobile;
	
	@FindBy(id ="continue")
	WebElement Cont;
	
	@FindBy(id ="ap_password")
	WebElement Pwd;
	
	@FindBy(id ="signInSubmit")
	WebElement Sign;
	
//Step 2 Seperate the Classes 
	
	public void Un() 
	{
		mobile.sendKeys("8121199851");		
	}
	public void Continues() 
	{
		Cont.click();
	}
	public void Passwords() 
	{
		Pwd.sendKeys("Shakeela@123");
	}
	public void Signin()
	{
		Sign.click();
	}
	
	//Step3: Using the PageFactory class inside the Constructor
	
	public Amazon_Login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}	
}
