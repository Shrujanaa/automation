package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallelexecution1 {

		@Test
		public void hello2()
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\srujana\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
		}

}
