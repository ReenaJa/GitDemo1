package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPage {
	
	WebDriver driver;
	
	By user_name=By.cssSelector("[id='user_name']");
	By user_email=By.cssSelector("[id='user_email']");
	By password=By.cssSelector("[id='user_password']");
	By password_confirm =By.cssSelector("[id='user_password_confirmation']");
	By mareting_details=By.cssSelector("[id='user_unsubscribe_from_marketing_emails']");
	By agree_terms=By.cssSelector("[id='user_agreed_to_terms']");
	By commit1=By.cssSelector("[name='commit']");
	
	
	 public RegisterPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	
	public WebElement getuser_name()
	{	
		return driver.findElement(user_name);
	}
	public WebElement getuser_email()
	{
		return driver.findElement(user_email);
	}
	public WebElement getpassword()
	{
		//Assert.assertEquals(password, password_confirm);
		return driver.findElement(password);
	}
	public WebElement getpassword_confirm()
	{
		return driver.findElement(password_confirm); 
	}
	
	public WebElement getmareting_details()
	{
		return driver.findElement(mareting_details);
	}
	public WebElement getagree_terms()
	{
		return driver.findElement(agree_terms);
	}
	public WebElement getcommit1()
	{
		return driver.findElement(commit1);
	}
	

}
