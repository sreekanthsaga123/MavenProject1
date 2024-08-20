import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNgParameters {
	
	
	@Test
	@Parameters({"Sagabala"})
	public void test(String name) {
		System.out.println("My name is:"+name);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
