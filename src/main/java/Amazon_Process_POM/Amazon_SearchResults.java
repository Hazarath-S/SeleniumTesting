package Amazon_Process_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResults 
{
	WebDriver driver;
	// Locating the Elements using the FindBy
	@FindBy(xpath ="(//span[@class ='rush-component'])[4]")
	WebElement FirstShoes;

	//Create a Seperate classes 
	public void shoes()
    {
		FirstShoes.click();		
	}
	//Using the pageFactory Class inside the Class
	public Amazon_SearchResults(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}	
}

