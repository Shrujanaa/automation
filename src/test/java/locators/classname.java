package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class classname {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("mobiles");
}

}
