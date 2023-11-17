package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority=2)
	public void hello()
	{
		Reporter.log("executing hello",true);
	}
	@Test(priority=1)
	public void hi()
	{
		Reporter.log("executing hi",true);
		
	}

}
