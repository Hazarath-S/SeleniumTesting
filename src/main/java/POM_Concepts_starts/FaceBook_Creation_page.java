package POM_Concepts_starts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class FaceBook_Creation_page
{
	WebDriver driver;
	
// Step1 : Locating the Elements of Using the FindBy
	@FindBy(name ="firstname")
	WebElement Firstname;
	
	@FindBy(name ="lastname")
	WebElement Surname;
	
	@FindBy(name ="reg_email__")
	WebElement email;
	
	@FindBy(id ="password_step_input")
	WebElement password;
	
	@FindBy(id ="day")
	WebElement  Day;
	
	@FindBy(name ="birthday_month")
	WebElement month;
	
	@FindBy(id ="year")
	WebElement year;
	
	@FindBy(xpath ="(//label[@class ='_58mt'])[2]")
	WebElement Gender;
	
	@FindBy(name ="websubmit")
	WebElement Submit;
	
	//Step2: Seperate the Methods of each Component to perform action
	
	public void Fn()
	{
		Firstname.sendKeys("Hazarath");
		
	}
	
	public void Sn()
	{
		Surname.sendKeys("Shaik");
	}
	
	public void Em()
	{
		email.sendKeys("hazarathshaiteafd@gmail.com");
	}
	
	public void Pwd()
	{
		password.sendKeys("Hazarath@123");
	}
	
	public void date()
	{
	Select S1 = new Select(Day);
	S1.selectByValue("8");
		
	}	
	public void months()
	{
		Select S2 = new Select(month);
		S2.selectByVisibleText("Apr");	
	}
	public void Years()
	{
		Select S3 = new Select(year);
		S3.selectByValue("2003");	
	}
	public void Gen()
	{
		Gender.click();
	}	
	public void Submit_Button()
	{
		Submit.click();
	}	
	//Step 3: Initiazing the Each Elements using the pageFactory inside the Constructor	
	public FaceBook_Creation_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
}
