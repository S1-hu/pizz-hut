package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Original {
	

	public WebDriver driver;
	
	@Test
	
	public void lauchurl()
	{
		driver=new ChromeDriver();
		driver.get("https://www.pizzahut.co.in/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	
	public void blackpopupscreen()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='notification-container notification-container__basket']//div")).click();
	}

	@Test
	
	public void closepopupscreen()
	{
		driver.findElement(By.xpath("//div[@class='home-localise-product-box-overlap flex justify-start items-center flex-col'])[1]")).isDisplayed();
	}
	
	@Test
	
	public void enterloacation()
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']")).click();
	}
}
