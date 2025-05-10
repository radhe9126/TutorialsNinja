package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tutorialsninja.base.BasePage;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy (xpath="//span[normalize-space()='My Account']") WebElement myAccountMenu;
	
	public void clickOnMyAccount() {
		myAccountMenu.click();
	}
	
	@FindBy (xpath="//a[normalize-space()='Register']") WebElement registerDropdown;
	
	public void clickOnRegister() {
		registerDropdown.click();
	}
	
	
}
