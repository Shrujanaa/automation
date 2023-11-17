package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	@Test
	public void first()
	{
		Reporter.log("first",true);
	}
	@Test(enabled=false)
	public void second()
	{
		Reporter.log("second",false);
	}

}
