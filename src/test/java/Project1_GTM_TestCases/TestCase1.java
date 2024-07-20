package Project1_GTM_TestCases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import IRetryAnalyzer_TestCase.Registration_IretryAnalyser;
import Project1GTM.Registration_Process;
import Project1_Listersns.Listern_Class;
import java.time.Duration;
@Listeners(Listern_Class.class)
public class TestCase1 extends Listern_Class
{
	
	@Test(retryAnalyzer =Registration_IretryAnalyser.class)
	@Parameters("Broswers")
	public void registration(String NameoftheBroswer) throws InterruptedException 
	{
		 if(NameoftheBroswer.equals("Chrome")) 
		 {
			 driver = new ChromeDriver();	 
		 }
		 if(NameoftheBroswer.equals("Edge")) 
		 {
			 driver = new EdgeDriver(); 
		 }
		 if(NameoftheBroswer.equals("FireFox")) 
		 {
			 driver = new FirefoxDriver();
		 }	 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 
		 Registration_Process R1 = new Registration_Process(driver);
		 R1.FN();
		 R1.MobileNum();
		 R1.pwd();
		 R1.Continue_Button();	 
//	WebElement text = 	driver.findElement(By.xpath("//a[@id='ab-enhanced-registration-link']"));
	//Assert.assertEquals(text.isDisplayed(), true,"The String is same ");
	}
}
