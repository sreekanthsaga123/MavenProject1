package ProjectDoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportTestNG {
	private static WebDriver driver=null;
	public static void main(String[]args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test = extent.createTest("Google Search Test One", "This is to test to validate google search function");
		driver=new ChromeDriver() ;
		driver.get("https://google.com");
		test.pass("Navigated to google.com");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		textbox.sendKeys("Automation step by step");
		test.pass("Entered text in search box");
		Thread.sleep(2000);
		//click on google search
		driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).sendKeys(Keys.RETURN);
		test.pass("Pressed Keyboard keys");
		Thread.sleep(2000);
		//close browser
		driver.close();
		test.pass("Closed the browser ");
		System.out.println("Test completed sucessfully");
		test.info("Test completed");
		extent.flush();










	}

}
