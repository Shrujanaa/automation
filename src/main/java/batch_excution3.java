import org.testng.Reporter;
import org.testng.annotations.Test;

public class batch_excution3 {
	@Test(priority = 5)
public void sample6()
	{
		Reporter.log("six",true);
	}
@Test(priority = 6)
public void sample7()
{
	Reporter.log("seven",true);
}
}
