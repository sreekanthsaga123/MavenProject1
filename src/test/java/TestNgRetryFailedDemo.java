import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailedDemo {
@Test
	public void test1() {
		System.out.println("Iam insdide test1");
	}
	
@Test
public void test2() {
	System.out.println("Iam insdide test2");
int i=1/0;
}
@Test
public void test3() {
	System.out.println("Iam insdide test3");
Assert.assertTrue(0>1);
}
	
}
