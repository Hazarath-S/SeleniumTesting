package Amazon_Process_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Amazon_AddtoWhislist 
{
	WebDriver driver;
	@FindBy(xpath ="//span[@id ='wishListMainButton']")
	WebElement addtowhilist;

	
	@FindBy (xpath ="//span[@id ='huc-view-your-list-button']")
	WebElement View_ListAmazon;
	
	public void Addto_whiskist() 
	{	
		addtowhilist.click();	
	}
	public void View_List() 
	{	
		View_ListAmazon.click();	
	}
	public Amazon_AddtoWhislist(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
}
