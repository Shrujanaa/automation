package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//click on Create new Account Btn
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//store the DD in reference variable which u have to handle
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//create object of Select class
		Thread.sleep(5000);
		Select s=new Select(day);
		//use select class methods
		Thread.sleep(5000);
		s.selectByVisibleText("5");
		
		
		//month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//select class
		Select s1=new Select(month);
		//use select class methods
		Thread.sleep(5000);
		s1.selectByIndex(8);
		
		//year
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		//select class
		Select s2=new Select(year);
		//use select class methods
		Thread.sleep(5000);
	s2.selectByValue("2001");
	}

}
