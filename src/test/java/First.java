import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:/Selenium/sprint 2/Zomato_TestNg/src/Zomato_TestNg/MavenProject/Drivers/Chrome");
		//WebDriverManager.chromedriver.setup();
		WebDriver driver=new ChromeDriver() ;
		driver.get("http://google.com");

driver.manage().window().maximize();
WebElement textbox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
textbox.sendKeys("Automation step by step");
Thread.sleep(2000);
List<WebElement> listofclasselemnets=driver.findElements(By.xpath("//class"));
int count =listofclasselemnets.size();
System.out.println("count of class elements:"+count);
driver.close();
	}

}

