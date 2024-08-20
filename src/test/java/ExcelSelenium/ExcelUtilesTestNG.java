package ExcelSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Config.PropertiesFiles;

public class ExcelUtilesTestNG {
	
		WebDriver driver=null;

	
	@BeforeTest
	public void setUp() throws IOException {


	 driver = new ChromeDriver() ;

	
	}
	@Test(dataProvider = "test1data")
public void test1(String username,String password) throws InterruptedException {
		System.out.println(username+" |"+password);
		
		driver.get("https://google.com");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		textbox.sendKeys("Udemy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='sbct PZPZlf sbre']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in to your Udemy account']")).click();
		

		Thread.sleep(1000);
		//Enter email
		driver.findElement(By.xpath("//*[@class='ud-text-input ud-text-input-large ud-text-md ud-compact-form-control']")).sendKeys(username);
		//enter password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@class,'ud-text-input ud-text-input-large ud-text-md ud-compact-form-control ')]")).sendKeys(password);
	//login
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--W3Tqk ']")).click();
		
		
	}


	@DataProvider(name="test1data")
	public static Object[][]  getData() throws IOException {
		String projectPath=System.getProperty("user.dir");
		String workBook = projectPath+"\\Excel\\Data.xlsx";
		testData(workBook,"sheet1");
		Object data[][]=testData(workBook,"sheet1");
		return data;

	}
	public static Object[][] testData(String workBook,String sheetName) throws IOException {
		ExcelUtilies excel=new ExcelUtilies(workBook, sheetName);
		int rowcount=excel.getRowCount();
		int colcount=excel.getColCount();
		Object data[][]=new Object[rowcount-1][colcount];




		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				String cellData=excel.getCellData(i,j);
				System.out.print(cellData+" | ");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}
		return data;
	}


}
