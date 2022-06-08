package testcases.suitea;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest {
	
	@BeforeTest
	public void init() {
		System.out.println("------------------Before Test------------------");
		//Start the Browser
	}
	
	@AfterTest
	public void quit() {
		System.out.println("------------------After Test------------------");
		//close browser
	}
	
	@BeforeMethod
	public void beforeMeth() {
		System.out.println("------------------Before Method------------------");
		//init report
	}
	
	@AfterMethod
	public void afterMeth() {
		System.out.println("------------------After Method------------------");
		//finalise report
	}
	
	@Test
	public void doLogin(ITestContext context) {
		String expectedResult = "ABCX";
		String actualResult = "ABC";
		System.out.println("Login Test");
		//Assert.assertEquals(expectedResult, actualResult);
		//Assert.assertEquals(5>12, "Error Message");
		//Assert.assertTrue(isElementPresent("xxx"), "Element not found");
		//Assert.fail();
		//System.out.println("-------------------Before Assertion---------------------");
		//Assert.fail("Custom Err Message - 404 error");
		//System.out.println("-------------------After Assertion---------------------");

	}
	
	@Test
	public void logOut() {
		System.out.println("Logging Out");
	}
}
