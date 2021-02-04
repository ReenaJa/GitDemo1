package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a>li[2]");
	By Register=By.cssSelector("a[href*='sign_up']");
	
	//Courses
	////ul[@class='nav navbar-nav navbar-right']/li[2]/a
	By coursebar=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[2]/a");
	
	public Landingpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	

	public LoginPage getLogin()
	{
		driver.findElement(signin).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	
	public RegisterPage getcommit1()
	{
		driver.findElement(Register).click();
		RegisterPage rp=new RegisterPage(driver);
		return rp;
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}

	
	


	
}
