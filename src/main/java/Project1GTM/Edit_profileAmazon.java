package Project1GTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_profileAmazon
{
	WebDriver driver;
	//Locating the Elements using the FindBy Annotation
	@FindBy(xpath ="//span[@class ='editProfile']")
	WebElement edit;
	
	
	
	
	
	

	
	//Seperate the Class 
	public void editProfile() 
	{
		edit.click();
	}
	
	
	
	
	
	
	
	
	
	
	//Create PageFactory Class inside the Constructor
	public Edit_profileAmazon(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
