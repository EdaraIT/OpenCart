package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	//Create BasePage under "pageObjects" which includes only constructor. This will be invoked by 
	//every Page Object Class constructor (Re-usability).
	
	WebDriver driver;
	
	BasePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
