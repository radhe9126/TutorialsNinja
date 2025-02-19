package com.tutorialsninja.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	private static WebDriver driver;

	public static WebDriver browserFactory() {

		String browser = ConfigDataProvider.configDataProvider("browser").toLowerCase().trim();

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Browser not found");
			throw new IllegalArgumentException("Browser" + browser + "not foound, please check your config file");

		}

		return driver;
	}

	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
