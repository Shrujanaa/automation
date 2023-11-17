package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class element_screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
	WebElement	element=driver.findElement(By.xpath("//div[@class='_fluid-fat-image-link-v2_style_fluidFatImageLinkBody__1LsOX']"));
	File src=element.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\srujana\\OneDrive\\Desktop\\screenshot\\ama.jpg");
	Files.copy(src, dest);
	
	}

}
