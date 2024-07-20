package Project1GTM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Registration_Process 
{
	WebDriver driver;
	//Locating the Elements by using the FindBy annotation.
	@FindBy(id ="ap_customer_name")
	WebElement firstname;
	
	@FindBy(id ="ap_phone_number")
	WebElement mobilenumber;
	
	@FindBy(id ="ap_password")
	WebElement password;
	
	@FindBy(xpath ="//input[@class ='a-button-input']")
	WebElement  Submit;
	
	//seperate the methods for each components to perform action.
	public void FN() 
	{
		firstname.sendKeys("Shakeela");	
	}
	public void MobileNum() 
	{
		mobilenumber.sendKeys(" 8121199851");
	}
	public void pwd() 
	{
		password.sendKeys("Shakeela@123");
	}
	public void Continue_Button() throws InterruptedException 
	{
		Thread.sleep(2000);
		Submit.click();
	}
	
	// Create a PagaFactory class inside the Constructor.
	public Registration_Process(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
