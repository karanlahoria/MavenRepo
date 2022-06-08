package testcases.suiteb;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUserRegTest {
	
	@Test
	public void validate() {
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("ABC", "ABC");
		softAssert.assertEquals("ABC", "XYZ");
		softAssert.assertEquals(4>5, "Error Message");
		softAssert.fail("404 Error came up");
		
		softAssert.assertAll();
		
	}

}
