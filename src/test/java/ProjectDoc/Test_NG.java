package ProjectDoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_NG {
	 WebDriver driver=null;
	
	 @BeforeTest
	 public void setUp() {
		driver=new ChromeDriver() ;

	}
	 @Test
	public  void googleSearch() throws InterruptedException{

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
