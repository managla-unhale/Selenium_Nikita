package com.ShoppersStack_Nikita_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddresspage {
             //MyAddresspage5
	
	public MyAddresspage(WebDriver driver) {   //cearte the consture
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addressButton;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")  //parant class also use
	private WebElement deleteButton;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yestButton;
	
	
    //getter the create  steps=right click -> soures -> genatered getter and setter -> select getter -> generate

	public WebElement getAddressButton() {
		return addressButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getYestButton() {
		return yestButton;
	}
	
	
}
