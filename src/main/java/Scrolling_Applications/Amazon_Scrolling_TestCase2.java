package Scrolling_Applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(amazon_Scrolling_Listern.class)

public class Amazon_Scrolling_TestCase2 
{
	@Test
	public class Listern_Scrolling extends amazon_Scrolling_Listern {
		{
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			WebElement About_us = driver.findElement(By.linkText("About Us"));
			Point P1 = About_us.getLocation();
			int x = P1.getX();
			int y = P1.getY();

			System.out.println(x);
			System.out.println(y);

			JavascriptExecutor e1 = (JavascriptExecutor) driver;
			e1.executeScript("window.scrollBy("+x+", " +y+ ")");
			Reporter.log("Scrolling is Passed");
			
			Assert.assertEquals(About_us.isDisplayed(), true,"Strings are not both same");
		}
	}
}
