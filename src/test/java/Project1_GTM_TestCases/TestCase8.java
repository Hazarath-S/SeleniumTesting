package Project1_GTM_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Project1GTM.SortBy_relevantPrice_amazon;
import java.time.Duration;

public class TestCase8
{
	@Test
	public void amazon_sorting() throws InterruptedException
	{
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/s?k=shoes&crid=2HJ6LOH1V56HC&sprefix=shoes%2Caps%2C250&ref=nb_sb_noss_1");
		driver.manage().window().maximize();
		
		SortBy_relevantPrice_amazon S1 = new SortBy_relevantPrice_amazon(driver);
		S1.dropdown_Button();
		S1.newarrivals();
		S1.high_price();
		S1.Customer_review();	
	}
}
