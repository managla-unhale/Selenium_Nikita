package com.ShoppersStack_Nikita_POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	         //Login_page2
	
	public Login_page(WebDriver driver) {     //crate a constructure
		               //prefindelement
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	
	
    //getter the create  steps=right click -> soures -> genatered getter and setter -> select getter -> generate
	public WebElement getEmail() {
		return emailTextField;
	}

	public WebElement getPassword() {
		return passwordTextField;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
