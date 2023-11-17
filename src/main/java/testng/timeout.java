package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut=1000)
	public void s1()
	{
		Reporter.log("s1",true);
	}

}
