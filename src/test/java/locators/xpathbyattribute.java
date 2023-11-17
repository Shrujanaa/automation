package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyattribute {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");//1010
		WebElement sf = driver.findElement(By.xpath("//input[@name='q']"));
		driver.navigate().refresh();//2020
		sf.sendKeys("pendrives");
		
		
	}

}
