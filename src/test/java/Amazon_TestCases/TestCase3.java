package Amazon_TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Process_POM.Amazon_AddtoWhislist;
import Amazon_Process_POM.Amazon_HomePage;
import Amazon_Process_POM.Amazon_Login_page;
import Amazon_Process_POM.Amazon_SearchResults;
import java.time.Duration;

public class TestCase3 
{
	@Test
	public void Amazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289449%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D14031505644103179192%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9197649%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2359492%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		Amazon_Login_page Am1 = new Amazon_Login_page(driver);
		Am1.Un();
		Am1.Continues();
		Am1.Passwords();
		Am1.Signin();

		Amazon_HomePage A1 = new Amazon_HomePage(driver);
		A1.Search();

		
		  Amazon_SearchResults S1 = new Amazon_SearchResults(driver); 
		  S1.shoes();
		  
		  Set<String> S2 = driver.getWindowHandles();
			Iterator<String> S21 =  S2.iterator();
		String Parent_ID = 	S21.next();
		String Child_ID = 	S21.next();
		System.out.println(Child_ID);
		driver.switchTo().window(Child_ID);
		
		Amazon_AddtoWhislist Amazon = new Amazon_AddtoWhislist(driver);
		Amazon.Addto_whiskist();
		Amazon.View_List();	
  }	
	}


