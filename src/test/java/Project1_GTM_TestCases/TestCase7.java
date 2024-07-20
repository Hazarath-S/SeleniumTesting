package Project1_GTM_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import IRetryAnalyzer_TestCase.pri_Titl_Des_retryAnalyzer;
import Project1GTM.Product_details_page_amazon;
import Project1_Listersns.Listerns_Class7;
import java.time.Duration;

@Listeners(Listerns_Class7.class)
public class TestCase7 extends Listerns_Class7
{
	//WebDriver driver;
	@Test(retryAnalyzer =pri_Titl_Des_retryAnalyzer.class)
	@Parameters("Broswers")
	public void product_page(String nameoftheBroswer) 
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
		driver.get("https://www.amazon.in/OFF-LIMITS-STUSSYY-Memory-Running/dp/B0B42Z98YT/ref=sr_1_1_sspa?crid=QTLVAJ5EUX7J&dib=eyJ2IjoiMSJ9.IXNNoqTIKeMjxDK8_s_sWRtIa64l6DzUKDh1D7UQHfmEX79W-lWABKHiE7QRVlaveF0gfbS7ChGPO1Cnt8fngFKRjvLtUgMqiDu97BC-cApIP-1_khZRwjIBckHa8iXX9fDJ7Cml52lb-VAR-asPrbUD1NOj_iY0ZBR5EFzPFAhMuz5KaUu58cphEl5TK1xhAbr6Jq6s0UvB_TQDSsjY4tJjnOlOMEEKkcB-mHm3QyZKk5zdA_E-oZ0JGDcX9nHh8D53aUTe4xd0yTu32F0dn6o2cNPRo-hlVNnYiAfW_Ds.4kK3wbknnw9JGqzrSbam00yfLV7I8QElpbecVNV9dCI&dib_tag=se&keywords=shoes&qid=1720938574&sprefix=shoes%2Caps%2C268&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.manage().window().maximize();
		
		Product_details_page_amazon Product_page = new Product_details_page_amazon(driver);
		boolean Prod_title=   	Product_page.Prod_title();
		 boolean price =        Product_page.price_details();
		boolean  description =  Product_page.Customer_reviews();
		
		if(Prod_title==true)
		{
			System.out.println("The product title is Visible");
		}
		else
		{
			System.out.println("The prodcut is NOT VISIBLE");
		}
		
		if(price ==true)
		{
			System.out.println("The Price is visible");
		}
		else 
		{
			System.out.println("The Price is NOT VISIBLE");
		}
		if (description==true)
		{
			System.out.println("The Description is visible");
		}
		else
		{
			System.out.println("The Description is NOT VISIBLE");
		}	
	}
}
