package SeleniumAcademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest 
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String username, String password, String text) throws IOException {
		// inheritance
		// creating objects of that class and invoking methods of it
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		LoginPage lp = new LoginPage(driver);
		 lp=l.getLogin(); // instead of driver.findElement(by.css......
	   
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		log.info(text);
		
		lp.getLogin().click();
        //System.out.println(text);
		ForgotPassword fp = lp.forgotPassword();
		fp.getEmail().sendKeys("kkkk");
		fp.sendMeInstructons().click();
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//Row stands for how many data types the test should run
		Object[][] data = new Object[2][3];
		//0th row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restricteduser";
		//1st row
		data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]="Non restricted user";
		
		return data;
		
	}

}
