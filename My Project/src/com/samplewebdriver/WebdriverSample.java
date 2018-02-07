package com.samplewebdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebdriverSample {

	public static void main(String[] args) {
		
		FirefoxProfile profile =new FirefoxProfile(new File("C:\\Users\\vigneshkumar.r\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\bhpa2nek.Selenium"));
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(option);
		
		driver.get("https://vdrhotfix.sterlingdatarooms.com/SterlingVDR/Login.aspx");
		driver.close();
	}
}
