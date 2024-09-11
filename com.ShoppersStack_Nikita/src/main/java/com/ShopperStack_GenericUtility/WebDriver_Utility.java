package com.ShopperStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	         //WebDriver_Utility1 
	
	Java_Utility java_Utility = new Java_Utility();
	
	public void takeWebPageScreenShot() throws IOException 
	{                          //ctrl+1
		
		TakesScreenshot ts = (TakesScreenshot) Base_Test.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath+java_Utility.localDateTime()+".png");
		FileHandler.copy(temp, dest);
		 
		
		
	} 
	
	public void takeWebElementScreenshot(WebElement element) throws IOException
	{
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath+java_Utility.localDateTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	public void selectByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	
	public void selectByVisibleText(WebElement element,String value )
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public void deselectByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}
	
	public void deselectByVisible(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(value);
		
	}
	
	// index/int
	public void selectByIndex(WebElement element,int value)
	{
		Select sel = new Select(element);
		sel.selectByIndex(value);
	}
	
	
	public void deselectByIndex(WebElement element,int value)
	{
		Select sel = new Select(element);
		sel.deselectByIndex(value);
	}
	
	
	//deselectAll
	public void deselectAll(WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectAll();
	}
	

}
