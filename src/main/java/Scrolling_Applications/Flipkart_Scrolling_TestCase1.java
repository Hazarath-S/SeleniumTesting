package Scrolling_Applications;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

 @Listeners(Flipkart_Scrolling_Listern.class)
	
	public class Flipkart_Scrolling_TestCase1 extends Flipkart_Scrolling_Listern
	{
		
		@Test
		public void flipkart_scrolling() throws InterruptedException 
		{
			 driver = new ChromeDriver ();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 WebElement terms = driver.findElement(By.linkText("Terms Of Use"));
			Point P1 =  terms.getLocation();
		int x = 	P1.getX();
		int y = 	P1.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor e2 = (JavascriptExecutor) driver;
		//Scrolling Down
		Thread.sleep(2000);
		e2.executeScript("window.scrollBy("+x+","+y+")");
		
		//scrolling up
		//e2.executeScript("window.scrollBy("+x+",0)");
		//Assert.assertEquals(terms.isDisplayed(), true,"String is not same");
		}
	}



