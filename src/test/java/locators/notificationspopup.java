package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class notificationspopup {
public static void main(String[] args) {
	//EdgeOptions e=new EdgeOptions();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.hdfc.com");
	driver.manage().window().maximize();
}
}
