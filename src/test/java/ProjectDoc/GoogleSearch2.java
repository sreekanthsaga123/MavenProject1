package ProjectDoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchpages;




public class GoogleSearch2 {
private static WebDriver driver=null;
	public static void main(String[] args) {
	googleSearch();
	}
	
	public static void googleSearch(){
		 driver=new ChromeDriver() ;
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		GoogleSearchpages.text_box_search(driver).sendKeys("Automation step by step");
	
		//click on google search
		//driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).sendKeys(Keys.RETURN);
		GoogleSearchpages.button_search(driver).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		System.out.println("Test completed sucessfully");
	
	}

}
