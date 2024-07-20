package Project1_GTM_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import IRetryAnalyzer_TestCase.Login_IncorrectPwd_IretryAnalyzer;
import Project1GTM.amazon_login_incorrect_pwd;
import Project1_Listersns.Listerns_Class3;
import java.time.Duration;

@Listeners(Listerns_Class3.class)
public class TestCase3 extends Listerns_Class3
{
	@Test (retryAnalyzer=Login_IncorrectPwd_IretryAnalyzer.class)
	@Parameters("Broswers")
	public void Login_Incorrect(String nameoftheBroswer) 
	{
		
		if(nameoftheBroswer.equals("Edge")) 
		{
			 driver = new EdgeDriver();
		}
		
		if(nameoftheBroswer.equals("Chrome")) 
		{
			 driver = new ChromeDriver();
		}
		
		if(nameoftheBroswer.equals("FireFox")) 
		{
			 driver = new FirefoxDriver();
		} 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289449%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D3719840259103010918%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9147461%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2359492%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	
		amazon_login_incorrect_pwd A1 = new amazon_login_incorrect_pwd(driver);
		A1.email();
		A1.Continue_Button();
		A1.Passwordfield();
		A1.sign();	
	}
}
