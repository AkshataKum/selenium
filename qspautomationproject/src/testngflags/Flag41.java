package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag41 {

	@Test(priority = 1)
	public void o()
	{
		Reporter.log("o",true);
	}
	
	@Test(priority = 0)
	public void t()
	{
		Reporter.log("t",true);
	}
	
	@Test(priority = 1)
	public void l()
	{
		Reporter.log("l",true);
	}
	
	@Test
	public void f()
	{
		Reporter.log("f",true);
	}
	
	@Test(priority = 2)
	public void h()
	{
		Reporter.log("h",true);
	}
	
	@Test(priority = 9)
	public void j()
	{
		Reporter.log("j",true);
	}
	
	@Test(priority = 0)
	public void y()
	{
		Reporter.log("y",true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("c",true);
	}
	
	@Test(priority = 0)
	public void q()
	{
		Reporter.log("q",true);
	}
	
	@Test(priority = 7)
	public void a()
	{
		Reporter.log("a",true);
	}
	
	@Test
	public void m()
	{
		Reporter.log("m",true);
	}
	
	@Test(priority = 0)
	public void i()
	{
		Reporter.log("i",true);
	}

}
