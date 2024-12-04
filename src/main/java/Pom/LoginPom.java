package Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	WebDriver driver;
	
@FindBy(name = "user_name")
 public WebElement username ;

@FindBy(name = "user_password")
public WebElement password ;

@FindBy(id = "submitButton")
public WebElement submit_button ;

public void loginPom(WebDriver driver)
{
		PageFactory.initElements(driver, this);
}
public void login(String username1,String password1)
{
	username.sendKeys(username1);
	password.sendKeys(password1);
	submit_button.click();
}

}

