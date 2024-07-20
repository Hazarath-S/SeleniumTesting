package Project1_GTM_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import IRetryAnalyzer_TestCase.SearchShoes_IretryAnalyzer;
import Project1GTM.amazon_add_to_Cart_product;
import Project1_Listersns.Listerns_Class5;
import java.time.Duration;

@Listeners(Listerns_Class5.class)
public class TestCase5  extends Listerns_Class5
{
	@Test(retryAnalyzer = SearchShoes_IretryAnalyzer.class)
	@Parameters("Broswers")
	public void addtocart(String NameoftheBroswer) 
	{
		if(NameoftheBroswer.equals("Chrome"))
		{
			driver  = new ChromeDriver();
		}
		if (NameoftheBroswer.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		if(NameoftheBroswer.equals("FireFox")) 
		{
			driver = new FirefoxDriver();
		}
		  
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_9a64ngqb9c_e&adgrpid=155259813353&hvpone=&hvptwo=&hvadid=674893539992&hvpos=&hvnetw=g&hvrand=2677047511288282281&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147461&hvtargid=kwd-298110271803&hydadcr=5625_2359479&gad_source=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		amazon_add_to_Cart_product a1 = new amazon_add_to_Cart_product(driver);
		a1.search();		
	}
}
