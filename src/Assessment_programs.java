package Scrolling_Applications;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assessment_programs 
{
	
	@Test
	public void VerifyingRevenueCalculator () throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement RevenueCal = driver.findElement(By.xpath("(//div[@class ='satoshi MuiBox-root css-1aspamu'])[5]"));
		RevenueCal.click();

		WebElement Textfield = driver.findElement(By.xpath(
				"//input[@class ='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		Textfield.sendKeys(selectAll+"560");

		Thread.sleep(2000);
		WebElement CPT091 = driver.findElement(By.xpath("(//input[@class ='PrivateSwitchBase-input css-1m9pwf3'])[1]"));
		CPT091.click();

		WebElement CPT453 = driver.findElement(By.xpath("(//input[@class ='PrivateSwitchBase-input css-1m9pwf3'])[2]"));
		CPT453.click();

		WebElement CPT454 = driver.findElement(By.xpath("(//input[@class ='PrivateSwitchBase-input css-1m9pwf3'])[3]"));
		CPT454.click();

		WebElement CPT474 = driver.findElement(By.xpath("(//input[@class ='PrivateSwitchBase-input css-1m9pwf3'])[8]"));
		CPT474.click();
	}
}
