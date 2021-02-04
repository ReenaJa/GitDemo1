package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Landingpage;
import pageObjects.LoginPage;
import resources.Base;

public class validatetitle extends Base{
	
	public WebDriver driver;

	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
		 
		 log.info("Driver is initialized");
		 driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
	}

	@Test
	public void basePageNavigation() throws IOException
	{
		
		//one is inheritance
		//creating object that class and invoke methods of it
		
		Landingpage l=new Landingpage(driver);
		//compare text from browser with actual text. 
		Assert.assertEquals("FEATURED COURSES1234",l.getTitle().getText());
		log.info("Successfully validated text msg");
		//Assert.assertTrue(true);
		;
		 
				  
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
