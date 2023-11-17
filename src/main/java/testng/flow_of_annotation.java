package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flow_of_annotation {
	@BeforeSuite
	public void m1()
	{
		Reporter.log("DB Connection",true);
	}
	@BeforeMethod
	public void m2()
	{
		Reporter.log("login to app",true);
		
	}
	@BeforeClass
	public void m3()
	{
		Reporter.log("launch the browser",true);
	}


	@AfterMethod
	public void m5()
	{
		Reporter.log("logout from app",true);
	}
	@AfterClass
	public void m6()
	{
		Reporter.log("close the browser",true);
	}
	@AfterSuite
	public void m7()
	{
		Reporter.log("database disconnection",true);
	}
	@Test
	public void m4()
	{
		Reporter.log("Main Testcase",true);
	}
	

}
