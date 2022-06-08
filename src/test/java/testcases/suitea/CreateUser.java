package testcases.suitea;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.TestDataProvider;

public class CreateUser {
	// @Test (  dataProvider = "getData") step 2 - map data provider
	
	@Test (dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void createUser(String browser, String userType, int phoneNumber, String email) {
		System.out.println(browser + "---" + userType + "---" + phoneNumber + "---" + email);
	}
	
	//step 1
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][4];
		//row1
		data[0][0] = "Chrome";
		data[0][1] = "Admin";
		data[0][2] = 232424;
		data[0][3] = "asdfdsa@somedpomain.com";
		//row 2
		data[1][0] = "Mozilla";
		data[1][1] = "SuperAdmin";
		data[1][2] = 1234445;
		data[1][3] = "asdfdsa@somedpomain.com";
		//row 3
		data[2][0] = "IE";
		data[2][1] = "User";
		data[2][2] = 786889;
		data[2][3] = "asdfdsa@somedpomain.com";
		return data;
		//System.out.println(data);
	}
	
	@Test (dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void deleteUser(String browser, String userType, int phoneNumber, String email) {
		System.out.println(browser + "---" + userType + "---" + phoneNumber + "---" + email);
	}
	
}
