package seleniumTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
	@Test(dataProvider = "DataSet")// this means that the data comes from getData method which is the data provider 
	public void login(String userName, String passWord) {
		
		System.out.println("The username is: "+userName+" and the password is: "+passWord);
	}
	
	
	
	
	@DataProvider
	public Object[][]getData (){// this method will provide the data stored in it to the @test method
		
		Object[][] credentials = new Object[3][2];
		
		credentials[0][0] = "Waqas1";
		credentials[0][1] = "Password1";
		
		credentials[1][0] = "Waqas2";
		credentials[1][1] = "Password2";
				
	    credentials[2][0] = "Waqas3";
		credentials[2][1] = "Password3";	
		
		return credentials;
		
	}

	
	@DataProvider // this is another way of storing our data in a 2 dimensional array
	public Object [][] DataSet() {
		
		Object[][] credentials = { 
				{"Khan1", "Password1"},
				{"khan2", "password2"},
				{"khan3", "password3"}
		};
		
		return credentials;
	}
}
