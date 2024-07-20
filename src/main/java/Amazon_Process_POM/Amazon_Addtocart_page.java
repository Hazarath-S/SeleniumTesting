package Amazon_Process_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Addtocart_page
{
	WebDriver driver;
	@FindBy(id ="add-to-cart-button")
	WebElement Addtocart;
	
	@FindBy(name ="proceedToRetailCheckout")
	WebElement proceed;
	
	public void cart() 
	{
		Addtocart.click();
		
	}
	
	public void proceedtopay()
	{
		proceed.click();	
	}
	
	public Amazon_Addtocart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
