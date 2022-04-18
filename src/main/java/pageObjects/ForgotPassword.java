package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	
	public WebDriver driver;
	
	private By email = By.cssSelector("[id='user_email']");
	private By password = By.cssSelector("[type='password']");
	private By sendMeInstructions = By.cssSelector("[type='submit']");
	
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	



	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement sendMeInstructons()
	{
		return driver.findElement(sendMeInstructions);
		
	}
	
	
	

	
	
	
}
 