import org.testng.Reporter;
import org.testng.annotations.Test;

public class batchexcution {
	@Test(priority = 1)
	public void sample1()
	{
		Reporter.log("executing one",true);
	}
	@Test(priority = 2)
	public void sample2()
	{
		Reporter.log("excuting two",true);
	}
}
