package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import constants.Constants;
import resources.Testcaseexecution;

public class CommomFunctions extends Testcaseexecution {

	Constants obj1=new Constants();
	
	public void scrolldown()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)  (driver);
		js.executeScript("windows.scrollBy,(0,250)","" );
	}
	
	public void takesreenshot () throws IOException
	{
		
		
		TakesScreenshot srcshot=(TakesScreenshot) driver;

        File Srcfile=srcshot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File(Constants.SCREENSHOTPATH);
        FileUtils.copyFile(Srcfile, DestFile);
	}
	
	
}
