import org.testng.annotations.Test;

public class TestNgDependencyDemo {
	@Test(dependsOnMethods= {"test2","test3"})
	public void test1() {
		System.out.println("IAm inside test1");
	}
	@Test
	public void test2() {
		System.out.println("IAm inside test1");
	}
	@Test
	public void test3() {
		System.out.println("IAm inside test1");
	}

}
