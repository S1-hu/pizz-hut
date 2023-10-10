package testNg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ExtentReportNew.ExtentTestReport;
import io.netty.handler.timeout.TimeoutException;
import pagefactoryelements.PageobjectTestNg;
import utilities.GetDataFromExcel;



@Listeners(utilities.ListenersNew.class)
public class Pizzahut001 extends ExtentTestReport{
 	
	

	


	
	 	
	 	public static WebDriver driver=new ChromeDriver();

	 	GetDataFromExcel obj=new GetDataFromExcel();
	 	
	 	
	 	PageobjectTestNg obj2=new PageobjectTestNg(driver);
	 	
	 	
	 	
	 	@BeforeTest
	 	public void openBrowser()
	 	{
	 		
	 		
	 		try {
	 			driver.get(obj.getUrl());
	 		} catch (IOException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 		driver.manage().window().maximize();
	 		
	 		
	 	}
	 	@Test
	 	public void executePageobjectTestNg()
	 	{
	 		ConfigReport();
	 		CreateTest();
	 		
	 		obj2.CloseBlackPopupScreen();
	 		
	 		obj2.PopUpScreenLocation();
	 		
	 		obj2.deleiverypopups();
	 		
	 		obj2.EnterDeliveryLocation("Latur St stand ");
	 		
	 		obj2.SelectFirstDropdownOption();
	 		try {
	 			Thread.sleep(2000);
	 		} catch (InterruptedException e1) {
	 			// TODO Auto-generated catch block
	 			e1.printStackTrace();
	 		}
	 		obj2.navigateToDealPage();
	 		
	 		obj2.sidesbaroption();
	 		
	 		// Wait for the blocking element to become invisible
	 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 		try {
	 		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".pt-20.bg-white.p-20.m-20.rounded.text-center.shadow.relative")));
	 		} catch (TimeoutException e) {
	 		    // Handle the timeout exception here
	 		    System.out.println("Timeout occurred while waiting for element to become invisible.");
	 		}
	 		
	 		obj2.exoticveggiepizza();
	 		
	 		obj2.addbasket();
	 		
	 		obj2.checkoutButtonpriceitem();
	 		
	 		
	 		try {
	             obj2.drniksmenuoption();
	         } catch (org.openqa.selenium.ElementClickInterceptedException e) {
	             // If ElementClickInterceptedException occurs, handle it
	             WebElement blockingElement = driver.findElement(By.cssSelector(".pt-20.bg-white.p-20.m-20.rounded.text-center.shadow.relative"));

	             // Wait for the blocking element to become invisible
	             WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	             wait1.until(ExpectedConditions.invisibilityOf(blockingElement));

	             // Click using JavaScript to bypass any intercepting elements
	             JavascriptExecutor executor = (JavascriptExecutor) driver;
	             executor.executeScript("arguments[0].click();", blockingElement);
	         }

	         // ...
	     
	 		

	 		obj2.removepopup();
	 		
	 		
	 		obj2.pepsi();
	 		
	 		obj2.sevenup();
	 		
	 		
	 		obj2.clickoncheckout();
	 		
	 		
	 		obj2.onlinepayment();
	 		
	 		
	 		obj2.cashoption();
	 		
	 		
	 		obj2.checkboxcheked();
	 		
	 		
	 		obj2.addname();
	 		
	 		
	 		obj2.addmobile();
	 		
	 		
	 		obj2.addemail();
	 		
	 		
	 		obj2.giftcard();
	 		
	 		
	 		obj2.clickvoucher();
	 		
	 		
	 		obj2.addvouchercode();
	 		
	 		
	 		obj2.clicksubmitt();
	 		
	 		
	 		
	 		obj2.closevoucherpopup();
	 		
	 		
	 	
	 	}
	 	
	 	@AfterTest
	 	
	 	public void Testcompleted()
	 	{
	 		FlushTest();
	 	}
	 	
	 	public void executecompleted()
	 	{
	 		driver.quit();
	 	}
	 	
	 }




