package SeleniumAcademy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest 
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("driver is initialized");
		
		
		driver.get(prop.getProperty("url"));
		log.info("navigated to homepage");
		
	}
	@Test

	public void basePageNavigation() throws IOException {
		
		// inheritance
		// creating objects of that class and invoking methods of it
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("successfully validated text message");
		
	
		
	}
	
	
	@Test

	public void validateHeader() throws IOException {
		
		// inheritance
		// creating objects of that class and invoking methods of it
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("successfully validated text message");
		
	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
