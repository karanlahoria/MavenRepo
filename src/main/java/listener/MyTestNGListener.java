package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test");
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getThrowable().getMessage());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Failed test" + result.getName());
	}
	
	
}