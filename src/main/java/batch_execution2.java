import org.testng.Reporter;
import org.testng.annotations.Test;

public class batch_execution2 {
@Test(priority = 3)
public void sample3()
{
	Reporter.log("three",true);
}
@Test(priority = 4)
public void sample4()
{
	Reporter.log("four",true);

}
}
