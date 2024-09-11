package com.ShoppersStack_Nikita_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfile_page {
	        //MyProfile_page4
	
	public MyProfile_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddressesButton;
	
	
    //getter the create  steps=right click -> soures -> genatered getter and setter -> select getter -> generate

    public WebElement getMyAddresses() 
		{
			return myAddressesButton;
		}
    
    
    
    
    
    
    
	
//	@FindBy(xpath = "//button[text()='Add Address']")
//	private WebElement addAddress;
//	
//	@FindBy(xpath = "//legend[text()='Address Type']")
//	private WebElement AddressType;
//	
//	@FindBy(xpath = "//input[@id='Name']")
//	private WebElement Name;
//	
//	@FindBy(xpath = "//input[@id='House/Office Info']")
//	private WebElement HouseInfo;
//	
//	@FindBy(xpath = "//input[@id='Street Info']")
//	private WebElement StreetInfo;
//	
//	@FindBy(xpath = "//input[@id='Landmark']")
//	private WebElement Landamrk;
//	
//	@FindBy(xpath = "//select[@id='Country']")
//	private WebElement Country;
//	
//	@FindBy(xpath = "//select[@id='State']")
//	private WebElement State;
//	
//	@FindBy(xpath = "//select[@id='City']")
//	private WebElement City;
//	
//	@FindBy(xpath = "//input[@id='Pincode']")
//	private WebElement pincode;
//	
//	@FindBy(xpath = "//input[@id='Phone Number']")
//	private WebElement phonenumber;
//	
//	@FindBy(xpath = "//button[@id='btnDisabled']")
//	private WebElement btnDisabled;


//	public WebElement getAddAddress() {
//		return addAddress;
//	}
//
//	public WebElement getAddressType() {
//		return AddressType;
//	}
//
//	public WebElement getName() {
//		return Name;
//	}
//
//	public WebElement getHouseInfo() {
//		return HouseInfo;
//	}
//
//	public WebElement getStreetInfo() {
//		return StreetInfo;
//	}
//
//	public WebElement getLandamrk() {
//		return Landamrk;
//	}
//
//	public WebElement getCountry() {
//		return Country;
//	}
//
//	public WebElement getState() {
//		return State;
//	}
//
//	public WebElement getCity() {
//		return City;
//	}
//
//	public WebElement getPincode() {
//		return pincode;
//	}
//
//	public WebElement getPhonenumber() {
//		return phonenumber;
//	}
//
//	public WebElement getBtnDisabled() {
//		return btnDisabled;
//	}
//	
//	
}
