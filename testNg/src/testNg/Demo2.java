package testNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void ThirdTest() {
		System.out.println("bye");
	}
	@BeforeTest
	public void AmFirst() {
		System.out.println("I will be executed 1st in the test module/folder where am present");
	}

}
