package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class keyclass {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);		
	}

}
