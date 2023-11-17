package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class name {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
			driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

}
