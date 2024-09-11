package com.ShoppersStack_Nikita_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_page {
	        // Welcome_page1
	
	
   public Welcome_page(WebDriver driver) {      //crate the consture
	
	   PageFactory.initElements(driver,this);     //it is overlaod method
   }
   
   // khup sarv id ,name aasle tr findall use karayche 
//   @FindAll({@FindBy(id="loginBtn"),@FindBy(name = "loginBtn")})  
//   private WebElement loginBtn;
//   
   
   @FindBy(id = "loginBtn")
   private WebElement loginButton;
   
   
   
  //getter the create  steps=right click -> soures -> genatered getter and setter -> select getter -> generate

   public WebElement getLoginButton() 
   {
	    return loginButton;
   }
   
   
	
	
	
	
   

}
