package testScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass; 

public class AddAddressTest extends BaseClass {
	
	@Test
	
	public void addAddressTest() throws InterruptedException {
		
		Map<String, String> map = excel.getData("Sheet1", "Add Address");
		welcome.clickLoginButton();
	    login.loginToApp(map.get("Email"), map.get("Password"));
	    Thread.sleep(2000);
	    home.clickProfileButton();
	    Thread.sleep(2000);
	    home.selectMyProfile();
	    Thread.sleep(2000);
	    myProfile.ClickMyAddress();
	    myAddress.clickAddAddress();
	    address.addAddressDetails(webutil,map,jutil);
	    Thread.sleep(2000);
	    Assert.assertEquals(myAddress.getSuccessMessage(),"successfully added");
	    
	}
	
	

}
