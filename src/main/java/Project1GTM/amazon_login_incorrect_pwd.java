package Project1GTM;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class amazon_login_incorrect_pwd 
{
	WebDriver driver;
	
	//Locating the Elements of the using the FindBy Annotation
	@FindBy(name ="email")
	WebElement ems;
	
	@FindBy(id ="continue")
	WebElement Cont_But;
	
	@FindBy(id ="ap_password")
	WebElement pwd;
	
	@FindBy(id ="signInSubmit")
	WebElement Sigin_But;
	
	//Separate the Class the inside the Constructor
	public void email() 
	{
		ems.sendKeys("8121199851");
	}
	public void Continue_Button()
	{
		Cont_But.click();
	}
	public void Passwordfield()
	{
		pwd.sendKeys("Shakeeeela@123");
	}
	public void sign() 
	{
		Sigin_But.sendKeys(Keys.ENTER);
	}
	// create a pageFactory Class inside the Constructor 
	public amazon_login_incorrect_pwd(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}	
}
