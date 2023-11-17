package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class get {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
   // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//input[@type='text']")).clear();
	//Thread.sleep(2000);
	String res=driver.findElement(By.xpath("(//span[.='Fashion'])[2]")).getText();
	System.out.println(res);

	
	}

}
