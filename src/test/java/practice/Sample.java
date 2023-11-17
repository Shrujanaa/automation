package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com/");
	//write xpath expression for search field
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 20000");
	//click on search button
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	//print the text of 1st mobile
	String text = driver.findElement(By.xpath("//span[text()='5G Unlocked Cell Phones with Headphones & Capacitive Pen, Face ID Android 13 Phone, 6.6\" HD+ Display 90HzD 24+64 MP 5500mAh Massive Battery Smartphone 4G+128GB Dual Sim TF Card Purple']")).getText();
	System.out.println(text);
}
}
