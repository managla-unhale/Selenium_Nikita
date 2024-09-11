package com.ShoppersStack_Nikita_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_page {
	         //AddressForm_page6
	
	public AddressForm_page(WebDriver driver) {   // crate the construre
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "Office")
	private WebElement officeButton;
	
	@FindBy(id = "Name")
	private WebElement namebutton;
	
	
	@FindBy(xpath = "//input[contains(@id,'House/Office Info')]")
	private WebElement houseTextfield;
	
	@FindBy(xpath = "//input[contains(@id,'Street Info')]")
	private WebElement streetTextfield;
	
	@FindBy(xpath = "//input[contains(@id,'Landmark')]")
	private WebElement landmarkTextfield;
	
	@FindBy(id = "Country")
	private WebElement countryDropDown;
	
	@FindBy(id = "State")
	private WebElement stateDropDown;
	
	@FindBy(id = "City")
	private WebElement cityDropDown;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(id = "Phone Number")
	private WebElement phonenTextField;
	
	//aapan inspect kele te pn value ghetli aahe and shopperstack madhe address takla and addaddress la inspect kele tr new value aali te pn ghetli and Tyala or attribute xapth madhe  ghetle
	@FindBy(xpath = "//button[@id='btnDisabled' or @id='addAddress']")
	private WebElement btndisabledoraddaddress;
	
	
    //getter the create  steps=right click -> soures -> genatered getter and setter -> select getter -> generate

	public WebElement getOfficeButton() {
		return officeButton;
	}

	public WebElement getNamebutton() {
		return namebutton;
	}

	public WebElement getHouseTextfield() {
		return houseTextfield;
	}

	public WebElement getStreetTextfield() {
		return streetTextfield;
	}

	public WebElement getLandmarkTextfield() {
		return landmarkTextfield;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhonenTextField() {
		return phonenTextField;
	}

	public WebElement getBtndisabledoraddaddress() {
		return btndisabledoraddaddress;
	}
	
	
	

}
