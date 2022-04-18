package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.cssSelector(".text-center>h2");
	private By navBar = By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul");
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	private By popup = By.xpath("//button[text(='NO THANKS']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	



	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(navBar);
	}
	
	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp = new LoginPage(driver);
		 return lp;
		 
	}
	public WebElement getHeader()
	{
		return driver.findElement(header);
	}
	public int getPpupSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	
}
 