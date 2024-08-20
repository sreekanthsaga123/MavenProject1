package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import ProjectDoc.Test_NG2;

public class PropertiesFiles {
	public static Properties prop=new Properties();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getProperties();
		setProperties();
	}
	public static void getProperties() throws IOException {
		
		InputStream input=new FileInputStream("C:\\Selenium\\sprint 2\\Zomato_TestNg\\src\\Zomato_TestNg\\MavenProject\\src\\test\\java\\Config\\config.properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		Test_NG2.browserName=browser;
		
	}
	public static void setProperties() throws FileNotFoundException {
		try {
	OutputStream output=new FileOutputStream("C:\\Selenium\\sprint 2\\Zomato_TestNg\\src\\Zomato_TestNg\\MavenProject\\src\\test\\java\\Config\\config.properties");
	prop.setProperty("browser","firefox");
	prop.store(output,null);
		
		
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			
		}
	}

}