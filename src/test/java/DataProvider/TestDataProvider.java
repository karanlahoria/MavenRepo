package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class TestDataProvider {
	@DataProvider
	public static Object[][] getData(Method m){
		Object[][] data = null;
		System.out.println("Method / Test" + m.getName());
		if(m.getName().equals("createUser")) {
			data = new Object[3][4];//[row][col]
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
			}
		else if(m.getName().equals("deleteUser")){
				data = new Object[3][4];//[row][col]
				//row1
				data[0][0] = "Chrome";
				data[0][1] = "Admin";
				data[0][2] = 232424;
				data[0][3] = "asdfdsa@somedpomain.com";
				//row 2
				data[1][0] = "Mozilla";
				data[1][1] = "SuperAdmin";
				data[1][2] = 123444;
				data[1][3] = "asdfdsa@somedpomain.com";
				//row 3
				data[2][0] = "IE";
				data[2][1] = "User";
				data[2][2] = 786889;
				data[2][3] = "asdfdsa@somedpomain.com";
			}
			
		return data;
		//System.out.println(data);
		
	}
}
