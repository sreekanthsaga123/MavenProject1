package ProjectDoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObject;

public class GoogleserachPageTest {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		googlesearchPOM();
		
	}
	public static void googlesearchPOM() {
		 driver=new ChromeDriver() ;
		
		GoogleSearchPageObject google=new GoogleSearchPageObject(driver);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		google.setTextIndex("Automation step by step");
		google.clickSearchButton();
		System.out.println("Opearion is done");
		driver.close();
	
	
	}

}
