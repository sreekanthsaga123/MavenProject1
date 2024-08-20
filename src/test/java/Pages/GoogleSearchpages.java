package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchpages {
	private static WebElement element=null;
	
	
	public static WebElement text_box_search(WebDriver driver)  {
		element=driver.findElement(By.xpath("//*[@class='gLFyf']"));
		return element;
	}

	public static WebElement button_search(WebDriver driver) {
		 element=driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
	return element;
	}

}
