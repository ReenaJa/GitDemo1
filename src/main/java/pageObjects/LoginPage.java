package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

 By email=By.cssSelector("[id='user_email']");	
 By password=By.cssSelector("[id='user_password']");
 By login=By.cssSelector("[value='Log In']");
 By forgotPassword=By.cssSelector("[href*='password/new']");
 
 
 //By forgotPassword2=By.xpath("//*[@id='pass']");
 
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 
 public ForgotPassword forgotPassword()
 {
	 driver.findElement(forgotPassword).click();
	 return new ForgotPassword(driver);

        
 }
 public WebElement getEmail()
 {
	 return driver.findElement(email);
 }
 
 public WebElement getpassword()
 {
	 return driver.findElement(password);
 }
 
 public WebElement getLogin()
 {
	 return driver.findElement(login);
			 
 }
	

}
