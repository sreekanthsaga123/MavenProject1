package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import ProjectDoc.UdemyTestNg;

public class UdemyPropertiesFiles {

	public static void main(String[] args) throws FileNotFoundException {
		getProperties();
		
	
		

	}
	public static void getProperties() throws FileNotFoundException {
		Properties prop=new Properties();
		try {
		InputStream input=new FileInputStream("C:\\Selenium\\sprint 2\\Zomato_TestNg\\src\\Zomato_TestNg\\MavenProject\\src\\test\\java\\Config\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
	
		
		UdemyTestNg.username=username;
		UdemyTestNg.password=password;
		UdemyTestNg.browserName1=browser;
		
		}
		catch(Exception e) {
			e.getCause();
		}
	}

}
