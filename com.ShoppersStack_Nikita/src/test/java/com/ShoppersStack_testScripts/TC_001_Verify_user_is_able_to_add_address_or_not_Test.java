package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShoppersStack_Nikita_POM.AddressForm_page;
import com.ShoppersStack_Nikita_POM.Home_page;
import com.ShoppersStack_Nikita_POM.MyAddresspage;
import com.ShoppersStack_Nikita_POM.MyProfile_page;
import com.aventstack.extentreports.Status;


public class TC_001_Verify_user_is_able_to_add_address_or_not_Test extends Base_Test 
{

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		
		test = reports.createTest("AddAddress");
		test.log(Status.PASS,"Login Done Successfully");
		
		homePage.getAccountsettings().click();
		homePage.getMyProfileclick().click();
		
		test.log(Status.INFO,"Navigated to My Profile Page");
		
		MyProfile_page myProfilePage = new MyProfile_page(driver);
		myProfilePage.getMyAddresses().click();
		
		test.log(Status.INFO,"Navigated to My Address Page");
		
	    MyAddresspage myAddresspage = new MyAddresspage(driver);
	    myAddresspage.getAddressButton().click();
	    
	    test.log(Status.INFO,"Navigated to My AddressForm Page");
	    
	    
	    AddressForm_page addressFromPage = new AddressForm_page(driver);
	    addressFromPage.getOfficeButton().click();
	    
	    
	    addressFromPage.getNamebutton().sendKeys(file.readExcelData("Sheet1", 1, 0));
	    addressFromPage. getHouseTextfield().sendKeys(file.readExcelData("Sheet1", 1, 1));
	    addressFromPage. getStreetTextfield().sendKeys(file.readExcelData("Sheet1", 1, 2));
	    addressFromPage.getLandmarkTextfield().sendKeys(file.readExcelData("Sheet1", 1, 3));
	    
	    
	    webdriverUtility.selectByValue(addressFromPage.getCountryDropDown(),file.readExcelData("Sheet1", 1, 4));
	    webdriverUtility.selectByValue(addressFromPage.getStateDropDown(),file.readExcelData("Sheet1", 1, 5));
	    webdriverUtility.selectByValue(addressFromPage.getCityDropDown(),file.readExcelData("Sheet1", 1, 6));
	    
	    
	    addressFromPage.getPincodeTextField().sendKeys(file.readExcelData("Sheet1", 1, 7));
	    addressFromPage.getPhonenTextField().sendKeys(file.readExcelData("Sheet1", 1, 8));
	    addressFromPage.getBtndisabledoraddaddress().click();
	    
	    Thread.sleep(3000);
	    webdriverUtility.takeWebPageScreenShot();
		
		
	}
	
}
