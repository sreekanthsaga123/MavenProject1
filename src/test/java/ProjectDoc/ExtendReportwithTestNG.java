package ProjectDoc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportwithTestNG {
	WebDriver driver=null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite

	public void setUP() {

		htmlReporter=new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


	}
	@BeforeTest
	public void setUpTest() {
		driver=new ChromeDriver() ;
	}
	@Test
	public  void test1() throws IOException {
		ExtentTest test = extent.createTest("Google Search Test One", "This is to test to validate google search function");
		driver.get("https://google.com");
		test.pass("Navigated to google.com");
		driver.manage().window().maximize();
		test.pass("Extended the chrome successfuilly");
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		test.info("This step shows usage of info(details)");

		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		test.addScreenCaptureFromPath("screenshot.png");
	}
	 @AfterTest
		//close browser
		public void down() {
		driver.close();
		System.out.println("Test completed sucessfully");
	 }
	@AfterSuite
	public void tearDown() {
		extent.flush();

	}










}


