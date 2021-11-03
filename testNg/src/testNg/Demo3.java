package testNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeSuite
	public void ExecutedFirst() {
		System.out.println("I am executed first in the whole test suite");
	}
	@Test(timeOut=4000)
	public void webLoginCarLoan() {
		System.out.println("webLogin CarLoan");
	}
	@Test(enabled=false)
	public void webLogoutCarLoan() {
		System.out.println("webLogout CarLoan");
	}
	@Test
	public void webRegisterCarLoan() {
		System.out.println("webRegister CarLoan");
	}
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobileLogin CarLoan");
	}
	@Test(groups="smoke",dependsOnMethods= {"webRegisterCarLoan"})
	public void LoginAPICarLoan() {
		System.out.println("Login API CarLoan");
	}
}
