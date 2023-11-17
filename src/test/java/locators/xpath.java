package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("admin");
driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
driver.findElement(By.xpath("//a[contains(.,'Login ')]")).click();
	}

}
