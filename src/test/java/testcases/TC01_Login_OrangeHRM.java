package testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_Login_OrangeHRM extends BaseClass{
	
	@Test
	void test_login_OrangeHRM() throws InterruptedException {
		
		logger.info("String TC");
		try {
		HomePage hp = new HomePage(driver);
		Thread.sleep(1000);
		hp.clickLinkCreateAnAC();	
		Thread.sleep(1000);
		hp.firstName();
		hp.lastName();
		hp.email();
		hp.password();
		hp.confirmPassword();
		hp.clickCreateAnACbtn();
		Thread.sleep(1000);
				
		String successMessage=driver.findElement(By.xpath("//div[@class='messages']/div")).getText();		
		Assert.assertEquals("Thank you for registering with Main Website Store.", successMessage);
		logger.info("Application logged successfully"+successMessage);
		}catch(Exception e) {
			logger.info("Creation is failed"+e);
			Assert.fail();
		}
	}
	
		
	
	
	

}
