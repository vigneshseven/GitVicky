package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;

public class NewTest {
  private WebDriver driver;
  @Test
  public void verifyTitle() {
	  driver.get("http://demo.guru99.com/selenium/guru99home/");
	  String titleName=driver.getTitle();
	  Assert.assertEquals("Demo Guru99 Page", titleName);
  }
  @BeforeTest
  public void beforeTest() {
	    /*System.setProperty("webdriver.gecko.driver", "C://geckodriver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		
		FirefoxProfile profile =new FirefoxProfile(new File("C:\\Users\\VICKY\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\ee7xv3xd.seleniumQA"));
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		// Initialize Firefox driver
		driver = new FirefoxDriver(option);*/
	  
	  	System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe");
	  	driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}