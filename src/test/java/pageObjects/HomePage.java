package pageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//Create Page Object Classes for HomePage & RegistrationPage under pageObjects package.
	//(These classes extends from BasePage)
	public ResourceBundle rb;
	public HomePage(WebDriver driver) {		
		super(driver);
	}
	
	
	
	//Elements
	@FindBy(xpath="//input[@name='username']")
	WebElement usename;
	
//	@FindBy(xpath="//input[@name='password']")
//	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	// Action Methods
	
	public void enterUsername() {
		rb=ResourceBundle.getBundle("config");
		usename.sendKeys(rb.getString("userName"));
	}
	
	public void enterPassword() {
		rb=ResourceBundle.getBundle("config");
		password.sendKeys(rb.getString("password"));
	}
	
	public void submit() {
		submit.click();
	}
	
//	########################################
	//Elements
	@FindBy(linkText="Create an Account")
	WebElement linkCreateAnAC;
		
	//Elements
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	
	//Elements
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;

	//Elements
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	//Elements
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	//Elements
    @FindBy(xpath="//input[@name='password_confirmation']")
    WebElement confirmPassword;
    
  //Elements
    @FindBy(xpath="//button[@title='Create an Account']")
    WebElement clickCreateAnAC;
    
  
    public void clickLinkCreateAnAC() {
    	linkCreateAnAC.click();
	}
    public void firstName() {
		rb=ResourceBundle.getBundle("config");
		firstName.sendKeys(rb.getString("firstName"));
	}
    
    public void lastName() {
		rb=ResourceBundle.getBundle("config");
		lastName.sendKeys(rb.getString("lastName"));
	}
    
    public void email() {
		rb=ResourceBundle.getBundle("config");
		email.sendKeys(rb.getString("email"));
	}
    public void password() {
		rb=ResourceBundle.getBundle("config");
		password.sendKeys(rb.getString("password"));
	}
    
    public void confirmPassword() {
		rb=ResourceBundle.getBundle("config");
		confirmPassword.sendKeys(rb.getString("confirmPassword"));
	}
    
    public void clickCreateAnACbtn() {
    	clickCreateAnAC.click();
	}
	

}
