package Project1_GTM_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4
{
	@Test
	public void Editprofile_amazon()
	{
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/slc/hub?disablePicker=1&shoppingAs=1&ref=sl_ph_navpicker&encodedActorId=AAAAAAAAAQDeQm%2Fx%2FT7WZCI07gos%2BO8qQQAAAAAAAADm3GUWNhwKA%2BmfDjKw4j%2B6ohWHndIHIaVpLFrBt9eowIox3ECaayYRDNk0FO%2FcNLKvrraqGd7YPy2h9jqbAMJA8w%3D%3D&qap=");
	}

}
