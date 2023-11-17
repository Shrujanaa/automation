package pom_classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Declaration 
@FindBy(xpath="//input[@id='email']")private WebElement emailtxt;
@FindBy(xpath="//input[@id='pass']")private WebElement pwdtxt;
@FindBy(xpath="//button[@name='login']")private WebElement loginBtn;
//Initialization
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//Utilization
public WebElement getUntxt() {
	return untxt;
}
public WebElement getPwdtxt() {
	return pwdtxt;
}
public WebElement getLoginBtn() {
	return loginBtn;
}


}
