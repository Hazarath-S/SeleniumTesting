package Project1GTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_login
{
	WebDriver driver;
	//Locating the Elements of using the Find By Annotation
	@FindBy(id ="ap_email")
	WebElement mobile;
	
	@FindBy(id ="continue")
	WebElement Continue;
	
	@FindBy(name ="password")
	WebElement pass;
	
	@FindBy(id ="signInSubmit")
	WebElement Sig;
	

	//Sepearate the Class into the Constrcutor
	
	public void mobilenum() 
	{
		mobile.sendKeys(" 81211 99851");
	}
	public void Continue_Button() 
	{
		Continue.click();
	}
	public void pwd()
	{
		pass.sendKeys("Shakeela@123");
	}
	public void sign_button() 
	{
		Sig.click();
	}
	//Create a method PageFacotry Class inside the Constructor
	public amazon_login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
