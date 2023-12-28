package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	//Elements
		@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
		WebElement clickAdminLink;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		
		// Action Methods
		
//		public void enterUsername() {
//			usename.sendKeys("Admin");
//		}
//		
//		public void enterPassword() {
//			password.sendKeys("admin123");
//		}
//		
//		public void submit() {
//			submit.click();
//		}

}
