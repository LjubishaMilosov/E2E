package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePage {
	
	
	public WebDriver driver;
	
	private By searchBox = By.name("query");
	
	
	
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	



	
	
	
	public WebElement getSearchBox()
	{
		 return driver.findElement(searchBox);
		 
	}
	
}
 