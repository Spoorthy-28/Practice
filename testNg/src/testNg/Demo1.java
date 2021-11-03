package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo1 {
	@AfterSuite
	public void ExecutedLast() {
		System.out.println("I am executed last in the whole test suite");
	}
	@Parameters({"username"})
	@Test(groups="smoke")
	public void FirstTest(String uname) {
		System.out.println(uname);
		System.out.println("spoorthy");
	}
	@Test
	public void SecondTest() {
		System.out.println("Deepthi");
	}

}
