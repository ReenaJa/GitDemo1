package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.Landingpage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import resources.Base;

public class RegisterButton extends Base{
	
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
		
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String email,String password,String password2) throws IOException
	{
		
		//one is inheritance
		//creating object that class and invoke methods of it
		 driver.get(prop.getProperty("url"));
		Landingpage l=new Landingpage(driver);
		RegisterPage rp=l.getcommit1();
		
		rp.getuser_name().sendKeys(Username);
		rp.getuser_email().sendKeys(email);
		rp.getpassword().sendKeys(password);
		rp.getpassword_confirm().sendKeys(password2);
		
		rp.getmareting_details().click();
		rp.getagree_terms().click();
		
		//log.info(text);
		rp.getcommit1().click();
	
		}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different data types test should run
		//column stands for how many values per each test
		  Object[][] data=new Object[1][4];
		  //oth row
		  data[0][0]="user1";
		  data[0][1]="user@gmail.com";
		  data[0][2]="12345";
		  data[0][3]="12345";
		
		  //1st row
		 
		  return data;  
				  
	}
}