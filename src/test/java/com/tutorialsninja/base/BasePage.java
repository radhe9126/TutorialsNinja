package com.tutorialsninja.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	private WebDriver driver;
	private void Syso() {
		 System.out.println("Hiii");
	}
	

	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
