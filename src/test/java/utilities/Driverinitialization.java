package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driverinitialization {

	


	//public static void    main(method)
			public static  WebDriver getDriver() 
			
			{
				ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.pizzahut.co.in/");
			    driver.manage().window().maximize();
				return driver;
				
				
				
				

				
				
				
			}
}
