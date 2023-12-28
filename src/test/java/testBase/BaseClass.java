package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Logger logger;
	
	public ResourceBundle rb;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		
		rb=ResourceBundle.getBundle("config");
		
		logger = LogManager.getLogger(this.getClass());
		
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("excledueSwitches", new String[] {"enable-automation"});
		
		//WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Home\\eclipse-workspace\\opencart\\drivers\\chromedriver.exe");		
		
		if(br.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(br.equals("edge")) {
			driver = new EdgeDriver();
			
		}else {
			driver=new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		driver.get(rb.getString("appUrl"));
		driver.manage().window().maximize();		
		
		
	}
	
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
	@AfterClass
	public void testDown() {
		
		//driver.quit();
		
	}

}
