package testcases.suiteb;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {
	
	Boolean flag = false; //read xls, json
	
	@Test (priority = 1)
	public void search(ITestContext context) {//failing or skipping
		if(flag)
			throw new SkipException("Skipping test");
		System.out.println("Searching Phone");
		//phone name
		context.setAttribute("phoneName", "One plus7t");
	}

	@Test (priority = 2, dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context) {
		String name = (String)context.getAttribute("phoneName");
		System.out.println("Selecting Phone "+ name);
		//Assert.fail();
	}
	
	@Test (priority = 3, dependsOnMethods = {"search", "selectPhone"})
	public void checkout(ITestContext context) {
		System.out.println("Checking Out");
	}
	
	
}
