package Project1GTM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon_add_to_Cart_product 
{
	WebDriver driver;
	//Locating the Elements using the FindByAnnotation
	@FindBy(id ="twotabsearchtextbox")
	WebElement  Searchtf;
	
	// Seperate the Class inside the Constructor
	public void search() 
	{
		Searchtf.sendKeys("Shoes",Keys.ENTER);
	}
	
	
	//Create the PageFactory Class inside the Constructor
	public amazon_add_to_Cart_product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
