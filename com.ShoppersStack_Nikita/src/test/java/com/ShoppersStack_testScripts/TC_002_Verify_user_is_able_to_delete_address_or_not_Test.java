package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShoppersStack_Nikita_POM.Home_page;
import com.ShoppersStack_Nikita_POM.MyAddresspage;
import com.ShoppersStack_Nikita_POM.MyProfile_page;



public class TC_002_Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test {
	@Test
  
	public void deleteAddress() throws InterruptedException, IOException {
		homePage.getAccountsettings().click();
		homePage.getMyProfileclick().click();
		
		MyProfile_page myProfilePage = new MyProfile_page(driver);
		myProfilePage.getMyAddresses().click();
		
		Thread.sleep(3000);
		
		MyAddresspage myAddresspage =new MyAddresspage(driver);
		
		myAddresspage.getDeleteButton().click();
		Thread.sleep(3000);
		
		myAddresspage.getYestButton().click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		webdriverUtility.takeWebPageScreenShot();
		
		
	}
}
