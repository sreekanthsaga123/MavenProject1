package ProjectDoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
	googleSearch();

	}
	public static void googleSearch() throws InterruptedException{
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		textbox.sendKeys("Automation step by step");
		Thread.sleep(2000);
		//click on google search
		driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		//close browser
		driver.close();
		System.out.println("Test completed sucessfully");
		
	}

}
