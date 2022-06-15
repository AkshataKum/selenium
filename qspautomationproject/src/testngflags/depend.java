package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depend {
	@Test()
	public void login()
	{
		Reporter.log("login to actitime",true);
		
	}
	
	@Test(priority =-1,dependsOnMethods= "createContact")
	public void logout()
	{
		Reporter.log("logout frome actitime",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void createContact()
	{
		Reporter.log("Create contact",true);
	}

}
