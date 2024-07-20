package POM_Continues;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_Concepts_starts.FaceBook_Login_Page;
public class TestCase1 
{
	@Test
	public void Facebook_Login_validCredentails()
	{
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FaceBook_Login_Page F1 = new FaceBook_Login_Page(driver);
		F1.Un();
		F1.Pwd();
		F1.Login();	
		}
}
