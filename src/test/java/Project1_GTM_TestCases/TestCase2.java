package Project1_GTM_TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import IRetryAnalyzer_TestCase.Login_page_IretryAnalyzer;
import Project1GTM.amazon_login;
import Project1_Listersns.Listern_Class1;
import java.time.Duration;

@Listeners(Listern_Class1.class)
public class TestCase2  extends Listern_Class1
{
	@Test(retryAnalyzer =Login_page_IretryAnalyzer.class)
	@Parameters("Broswers")
	public void amazon_loginprocess(String nameoftheBroswer) 
	{
		if(nameoftheBroswer.equals("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		
		if(nameoftheBroswer.equals("Edge")) 
		{
			driver = new EdgeDriver();
		}
		if(nameoftheBroswer.equals("FireFox"))
		{
			driver = new FirefoxDriver();
		}	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		amazon_login a1 = new amazon_login(driver);
		a1.mobilenum();
		a1.Continue_Button();
		a1.pwd();
		a1.sign_button();	
		WebElement Search_tf = driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertEquals(Search_tf.isDisplayed(), true,"The Strings are not same");	
	}
}
