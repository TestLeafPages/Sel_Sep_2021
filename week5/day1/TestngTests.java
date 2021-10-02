package week5.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTests  extends BaseClass{
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod - test2");

	}
	
	@Test
	public void test2() {
		System.out.println("test2");

	}

}
