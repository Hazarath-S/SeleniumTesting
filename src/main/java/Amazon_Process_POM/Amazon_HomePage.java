package Amazon_Process_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage 
{
	WebDriver driver;
	//locating the Elements FindBy
	@FindBy(id ="twotabsearchtextbox")
	WebElement Search_Tf;
	
	//Create the Seperate Classes	
	public void Search() 
	{
		Search_Tf.sendKeys("Shoes",Keys.ENTER);
		
	}
	// Using the PageFactory Class inside the Constructor
	public Amazon_HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver , this);
		
	}
	

}
