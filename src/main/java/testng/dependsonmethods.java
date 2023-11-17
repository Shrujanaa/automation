package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethods {
	@Test
	public void hello()
	{
		Reporter.log("hello",true);
	}
	@Test(dependsOnMethods={"hello"})
	public void hi()
	
	{
		Reporter.log("hi",true);
	}
	

}
