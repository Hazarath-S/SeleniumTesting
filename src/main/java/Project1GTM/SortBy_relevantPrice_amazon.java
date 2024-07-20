package Project1GTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortBy_relevantPrice_amazon 
{
	WebDriver driver;
	
	//Locating the Elements using the FindBy annotation
	@FindBy(xpath ="//span[@class ='a-button-text a-declarative']")
	WebElement dropdown;
	
	@FindBy(xpath ="//a[@id ='s-result-sort-select_4']")
	WebElement arrivals;
	
	@FindBy(xpath ="(//a[@id ='s-result-sort-select_2'])[6]")
	WebElement high_pri;
	
	@FindBy(xpath ="(//a[@id ='s-result-sort-select_3'])[6]")
	WebElement customer;
	
	
//Create a seperate methods to perform an action
	public void dropdown_Button()
	{
		dropdown.click();
	}
	public void newarrivals() 
	{
		arrivals.click();
	}
	public void high_price() throws InterruptedException
	{
		Thread.sleep(2000);
		high_pri.click();
	}
	public void Customer_review() throws InterruptedException
	{
		Thread.sleep(2000);
		customer.click();
	}
	
	
	//Create a Seperate Methods using the PageFactory Class inside the Constructor
	public SortBy_relevantPrice_amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
