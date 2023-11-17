package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssselector {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	
	}
	}
