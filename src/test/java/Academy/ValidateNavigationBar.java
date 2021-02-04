package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

//Adding logs
//generating HTML reports
//screenshots on failure
//Jenkins integration


public class ValidateNavigationBar extends Base{
	
	public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
		 driver.get(prop.getProperty("url"));
	}
	
	
		@Test
	
	public void validateAppNavBar() throws IOException
	{

		

		//one is inheritance
		// creating object to that class and invoke methods of it
		Landingpage l=new Landingpage(driver);
	
		//compare the text from the browser with actual text.- Error..
	    Assert.assertTrue(l.getNavigationBar().isDisplayed());
	    log.info("Navigation bar is displayed");
		;
	
		
	
		
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
	
	
	
}
