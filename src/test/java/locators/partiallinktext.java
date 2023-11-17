package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class partiallinktext {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("htpps://www.google.com");
				driver.findElement(By.partialLinkText("Im")).click();
	}

}

