package com.ShopperStack_GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_Nikita_POM.Home_page;
import com.ShoppersStack_Nikita_POM.Login_page;
import com.ShoppersStack_Nikita_POM.Welcome_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	         //Base_Test4
	
	
	 public File_Utility file=new File_Utility();
	 public WebDriver driver;
	 public static WebDriver sdriver;
	 public Welcome_page welcomePage;
	 public Login_page loginPage;
	 public Home_page homePage;
	 public ExtentSparkReporter spark;
	 public ExtentReports reports;
	 public ExtentTest test;
	 public Java_Utility javaUtility = new Java_Utility();
	 public WebDriver_Utility webdriverUtility = new WebDriver_Utility();
	 public WebDriverWait wait;
    
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
		
		spark = new ExtentSparkReporter(FrameWorkConstants.extentReportPath+javaUtility.localDateTime()+".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
		 
	}
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		System.out.println("BeforeClass");
		
		
		//he allready sir ne cammand madhe ch thvle aahe and command madhe thevn aahe 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter vaild Browser Name");
//		String browser = sc.next();
//		System.out.println("Number of Browsers");
		
//		String browserName = file.readPropertyData("browserName");   // mahun aaya 2 line maven run karansathi command keliy aahe 
//		String url = file.readPropertyData("url");	
		/*****************************cmd code*****************************/
		String browserName = System.getProperty("browser");   // aaya 2 line maven run karta ne write kele aahe 
     	String url = System.getProperty("url");
		/********************************************************************/	
		
		if (browserName.contains("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (browserName.contains("edge")) 
		{
			driver = new EdgeDriver();
		}
		else if (browserName.contains("FireFox")) 
		{
			driver = new FirefoxDriver();
			
		}
		else 
		{
			System.out.println("Invaild Browser Name");
		}
		sdriver=driver;
		homePage=new Home_page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

		
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException
	{
		System.out.println("BeforeMethod");
		
		
		welcomePage=new Welcome_page(driver);
	                             	//WebdriverControl
		
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(welcomePage.getLoginButton()));
		Thread.sleep(2000);
		
		welcomePage.getLoginButton().click();
		
		loginPage = new Login_page(driver);
		loginPage.getEmail().sendKeys(file.readPropertyData("email"));
		loginPage.getPassword().sendKeys(file.readPropertyData("password"));
		loginPage.getLogin().click();
		
	}	
		
		
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		System.out.println("AfterMethod");
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getAccountsettings()));
		
		homePage.getAccountsettings().click();
		homePage.getLogoutButton().click();
	}
	
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		System.out.println("AfterClass");
		
		Thread.sleep(3000);
		driver.quit();
		
	
		
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
		
		
		reports.flush();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");
		
	}
	
	
	

}


