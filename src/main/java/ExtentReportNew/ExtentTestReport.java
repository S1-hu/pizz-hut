package ExtentReportNew;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import constants.Constants;

public class ExtentTestReport extends Constants{
	
	ExtentReports extent;
	
	public void ConfigReport()
	{
		
		String Path=Constants.EXTENTREPORTPATH;
		ExtentSparkReporter reporter=new ExtentSparkReporter(Path);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("My Test Automation TestNG rrsult");
		reporter.config().setDocumentTitle("Test Result");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Shubham");
		
	}
	
	public void CreateTest()
	{
		extent.createTest("My Test Execution");
	}
	
	public void FlushTest()
	{
		extent.flush();
	}
	

}
