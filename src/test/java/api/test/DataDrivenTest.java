package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DataDrivenTest {

	@Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
	public void testPostUer(String userID, String username, String fname, String lname, String useremail,
			String password, String ph) {

		User userPaylod = new User();
		userPaylod.setId(Integer.parseInt(userID));
		userPaylod.setUsername(username);
		userPaylod.setFirstName(fname);
		userPaylod.setLastName(lname);
		userPaylod.setEmail(useremail);
		userPaylod.setPassword(password);
		userPaylod.setPhone(ph);

		Response response = UserEndpoints.createUser(userPaylod);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2, dataProvider = "UserName", dataProviderClass = DataProviders.class)
	public void testDeleteUserByName(String userName)
	{
		Response response = UserEndpoints.deleteUser(userName);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
