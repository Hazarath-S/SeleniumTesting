package POM_Concepts_starts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Login_Page 
{
	WebDriver driver;
	//Step1: Locate each element by using the FindBy.
	@FindBy(id ="email")
	WebElement Username;
	
	@FindBy(name ="pass")
	WebElement Password;
	
	@FindBy(xpath ="//button[@name ='login']")
	WebElement login_Button;
	
	//Step 2: Create a Separate methods for each component to perform Action.
	
	public void Un()
	{
		Username.sendKeys("hazarathygf@gmail.com");
	}
	
	public void Pwd()
	{
		Password.sendKeys("Hazarath@123");
	}
	
	public void Login()
	{
		login_Button.click();
	}
	
// step 3 : Initilzing the Each elements using the pageFactory class inside the constructor.
	
	public FaceBook_Login_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
