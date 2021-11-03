package testNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	@BeforeMethod
	public void BeforeMethodExecution() {
		System.out.println("I am executed before Every Method in Demo4 class");
	}
	@Test(groups="smoke",dataProvider= "myData")
	public void webLoginHomeLoan(int num) {
		System.out.println(num +"st test data for webLoginHomeLoan");
		System.out.println("webLogin HomeLoan");
	}
	@Parameters({"username"})
	@Test
	public void mobileLoginHomeLoan(String uname) {
		System.out.println(uname);
		System.out.println("mobileLogin HomeLoan");
	}
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("Login API HomeLoan");
	}
	@DataProvider
	public Object[] myData() {
		int count = 1;
		Object[] arr = new Object[3];
		for(int i=0;i<3;i++) {
				arr[i] = count;
				count = count+1;
		}
		return arr;
	}
}
