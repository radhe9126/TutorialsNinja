package com.tutorialsninja.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.tutorialsninja.utility.BrowserFactory;
import com.tutorialsninja.utility.ConfigDataProvider;

public class BaseTest {
	private WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.browserFactory();
		String url=ConfigDataProvider.configDataProvider("url");
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.closeBrowser();
	}
}
