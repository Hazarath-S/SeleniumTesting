package Scrolling_Applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(Scrolling_myntra.class)
public class Scrolling_myntra extends Myntra_ItestListern
{
	@Test
	public void Scrolling() throws InterruptedException 
	{
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		WebElement Contact = driver.findElement(By.linkText("Contact Us"));
		Point P1 = Contact.getLocation();
		int x = P1.getX();
		int y = P1.getY();

		System.out.println(x);
		System.out.println(y);

		JavascriptExecutor e2 = (JavascriptExecutor) driver;
		// Scrolling Down Side
		e2.executeScript("window.scrollBy(0," + y + ")");
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra", "The String is not sutiable");

		Thread.sleep(2000);
		// Scrolling Upside
		e2.executeScript("window.scrollBy(200,0)");
		WebElement Whislists = driver.findElement(By.linkText("Wishlist"));
		Assert.assertEquals(driver.getTitle(), "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra", "The String message is False");

	}
}
