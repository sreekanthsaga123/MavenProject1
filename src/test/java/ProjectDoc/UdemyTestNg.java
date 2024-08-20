package ProjectDoc;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.UdemyPropertiesFiles;

public class UdemyTestNg {
public static   WebDriver driver=null;
public static String username=null;
public static String password=null;
public static   String browserName1=null;
	
	@BeforeTest
	public static void setup() throws FileNotFoundException {
		
		if(browserName1.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver() ;
		}
	UdemyPropertiesFiles.getProperties();
	}
	@Test
	public static void Login() throws InterruptedException {
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//launch google.com
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		textbox.sendKeys("Udemy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='sbct PZPZlf sbre']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in to your Udemy account']")).click();
	//js.executeScript("arguments[0].scrollIntoView();", ele);
	//ele.click();
	
	
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
	@AfterTest
	public void down() {
	//driver.close();
	}
}
