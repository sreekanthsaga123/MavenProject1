package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	WebDriver driver=null;
	By textbox_search=By.xpath("//*[@class='gLFyf']");

	By search_button=By.xpath("(//*[@class='gNO89b'])[2]");
	
	
	public GoogleSearchPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void  setTextIndex(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickSearchButton() {
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}


		
	}


