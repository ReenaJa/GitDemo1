package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CourseBarPage;
import pageObjects.ForgotPassword;
import pageObjects.Landingpage;
import pageObjects.LoginPage;

import pageObjects.RegisterPage;

import resources.Base;

public class Homepage extends Base{
	
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
		
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String password,String text) throws IOException
	{
		
		//one is inheritance
		//creating object that class and invoke methods of it
		 driver.get(prop.getProperty("url"));
		Landingpage l=new Landingpage(driver);
		LoginPage lp=l.getLogin();
		
		lp.getEmail().sendKeys(Username);
		lp.getpassword().sendKeys(password);
		log.info(text);
		lp.getLogin().click();
	ForgotPassword fp=lp.forgotPassword();
	fp.getEmail().sendKeys("xxxx");
	fp.sendMeInstruction().click();
	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Git example 1");
		System.out.println("Git example 2");
		System.out.println("Git example 3");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//row stands for how many different data types test should run
		//column stands for how many values per each test
		  Object[][] data=new Object[2][3];
		  //oth row
		  data[0][0]="nonrestricted@gmail.com";
		  data[0][1]="123456";
		  data[0][2]="Restricted user";
		
		  //1st row
		  
		  data[1][0]="restricteduser@gmail.com";
		  data[1][1]="63126";
		  data[1][2]="non restricted user";
		  
		  return data;  
				  
	}
}
