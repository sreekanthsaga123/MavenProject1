import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgIgonreDemo {

	@Ignore
	
	@Test
	public void test1() {
		System.out.println("Iam inside test1");
	}
	@Test
	public void test2() {
		System.out.println("Iam inside test2");
	}
}
