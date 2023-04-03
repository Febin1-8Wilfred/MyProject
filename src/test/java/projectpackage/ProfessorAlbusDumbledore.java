package projectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class ProfessorAlbusDumbledore extends RubeusHagrid
	{		
		@Parameters ("browser")
		@BeforeClass
		public void settingUp(String browser) 
			{
				//ExtentReport:
//				reporter = new ExtentHtmlReporter("./Report/TestReport.html");
//		 		reporter.config().setDocumentTitle("Febin's Family Framework - the 3 level structure");
//		 		reporter.config().setReportName("Automation Testing");
//		 		reporter.config().setTheme(Theme.DARK);
//		 		
//		 		extent = new ExtentReports();
//		 		extent.attachReporter(reporter);
//		 		extent.setSystemInfo("hostname", "localhost");
//		 		extent.setSystemInfo("os", "windows10");
//		 		extent.setSystemInfo("testername", "Febin Wilfred");
//		 		extent.setSystemInfo("Browser Name", "firefox");
		 		
				if(browser.equals("chrome"))
					{
						driver = new ChromeDriver();							
					}
				else if(browser.equals("firefox"))
					{
						driver = new FirefoxDriver();
					}
				else if(browser.equals("edge"))
					{
						driver = new EdgeDriver();
					}
			}
		
		 @BeforeMethod
		 public void beforeMethod() 
			 {
			 		driver.get(URL);
			 		driver.manage().window().maximize();
			 }
		 
		 
//		@AfterMethod
//		public void afterMethod(ITestResult result) 
//			{
//				 if(result.getStatus() == ITestResult.FAILURE)
//					{
//						test.log(Status.FAIL, "Failed test case is: " + result.getName());
//						test.log(Status.FAIL, "Failed test case is: " + result.getThrowable());
//					}
//				else if(result.getStatus() == ITestResult.SKIP)
//					{
//						test.log(Status.SKIP, "Skipped test case is: " + result.getName());
//					}
//				else if(result.getStatus() == ITestResult.SUCCESS)
//					{
//						test.log(Status.PASS, "Passed test case is: " + result.getName());
//					}
//			}
	
//		@AfterTest
//		public void afterTest() 
//			{
//				extent.flush();
//			}
		
//		@AfterClass
//		public void nox() 
//			{
////				driver.quit();
//			}
	}
