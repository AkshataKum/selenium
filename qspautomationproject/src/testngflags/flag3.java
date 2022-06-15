package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3 {
	
	@Test(invocationCount = 100)
	public void login()
	{
		Reporter.log("inconsistent bug",true);
	}

}
