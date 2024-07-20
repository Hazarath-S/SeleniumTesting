package POM_Continues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 
{
	@Test
	public void FaceBook_Creation_page()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		POM_Concepts_starts.FaceBook_Creation_page Fb1 = new POM_Concepts_starts.FaceBook_Creation_page(driver);
Fb1.Fn();
Fb1.Em();
Fb1.Sn();
Fb1.Pwd();
Fb1.date();
Fb1.months();
Fb1.Years();
Fb1.Gen();
Fb1.Submit_Button();
	}

}
