import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login_pom 
{
    WebDriver driver;

@FindBy(name="user_name")
private WebElement username;

@FindBy(name="user_password")
private WebElement password;

@FindBy(id="Button")
private WebElement loginbutton;

public LoginPom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

 public void login(String username1)  
 {
	 username.sendKeys(username1);
 }

}
