package com.ShoppersStack_Nikita_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	         //Home_page3
	
	public Home_page(WebDriver driver) {     //crate a constructure
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//span[contains(@class,'BaseBadge-badge')]")   //parent class ghetla aahe aapn ...inspect kele tycha varcha class
	private WebElement accountsettings;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileclick;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutButton;
	
	
  //getter the create  steps=right click -> soures -> genatered getter and setter -> select getter -> generate

	public WebElement getAccountsettings() {
		return accountsettings;
	}

	public WebElement getMyProfileclick() {
		return myProfileclick;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
	

}
