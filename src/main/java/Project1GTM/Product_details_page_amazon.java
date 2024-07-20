package Project1GTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_details_page_amazon
{
	WebDriver driver;
	//Locating the elements by using the FindBy Annotation
	@FindBy(id ="productTitle")
	WebElement products;
	
	@FindBy(xpath ="(//span[@class ='a-price-whole'])[1]")
	WebElement Price_det;
	
	@FindBy(xpath  ="(//span[@class ='a-text-bold'])[19]")
	WebElement Customer;
	
	
	//Seperate the Class 
	public boolean Prod_title()
	{
		products.isDisplayed();
		return true;	
	}
	public boolean price_details() 
	{
		Price_det.isDisplayed();
		return false;	
	}
	public boolean Customer_reviews() 
	{
		Customer.isDisplayed();
		return false;	
	}
	
	//using the PageFactory create the inside the constructor
	public Product_details_page_amazon(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
