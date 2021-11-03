package testNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult res) {
		System.out.println("Test Success Listener executed successfully!!");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure Listener executed successfully!!"+result);    
	}
}
