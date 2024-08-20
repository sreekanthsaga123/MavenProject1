package ProjectDoc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFiles;

public class Test_NG2 {
	public static  WebDriver driver=null;
	public static String browserName=null;
	 @BeforeTest
	 public void setUp() throws IOException {

		PropertiesFiles.getProperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver() ;
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//driver=new FireFoxDriver();
			System.out.println("Its firefox browser");
		}

	}
	 @Test
	public  void googleSearch2() throws InterruptedException{

		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		textbox.sendKeys("Automation step by step");
		Thread.sleep(2000);
		//click on google search
		driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
	}
	
	 @AfterTest
		//close browser
		public void down() {
		driver.close();
		System.out.println("Test completed sucessfully");
		
	}

}
