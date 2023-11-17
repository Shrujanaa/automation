package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount = 5)
	public void a()
	{
		Reporter.log("hi",true);
		//Assert.fail();
	}
@Test
public void b()
{
	Reporter.log("hello");
	//Assert.fail();
}
}
