package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class passworduser {
public static void main(String[]args)

{
	WebDriver driver=new EdgeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			//driver.findElement(By.id("loginButton")).click();
			String expt="actiTIME - Login";
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals(expt))
			{
				System.out.println("Tc is pass and user navigated to home page");
			}
			else
			{
				System.out.println("Tc is failed");
			}

}
}
