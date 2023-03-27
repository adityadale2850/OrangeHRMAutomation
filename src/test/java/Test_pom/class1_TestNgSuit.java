package Test_pom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom_class.Home_page;
import Pom_class.Login_page;
import TestUtility.ReadFiles;
import io.github.bonigarcia.wdm.WebDriverManager;
import mainUtilities.ElementWait;




public class class1_TestNgSuit {
	WebDriver driver;
	@Parameters({"browser"})

	@BeforeTest
	public void beforetest(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe\\");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("its before class of class1");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("its before method of class1");
	}
	
	@Test ()
	public void verifyDashboardElement() throws EncryptedDocumentException, IOException
	{
		SoftAssert s=new SoftAssert();
		Login_page login=new Login_page(driver);
		
	    login.sendusername(ReadFiles.fetchDataFromExcel(1, 1));
		login.sendpassword(ReadFiles.fetchDataFromExcel(4, 1));
		login.clickloginbutton();
		String ExpectedResult= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ActualResult=driver.getCurrentUrl();
		Assert.assertEquals(ActualResult, ExpectedResult);
		Home_page home=new Home_page(driver);
		
		boolean result=home.AdminDisplayed();
		s.assertTrue(result, "Admin option is present");
		//s.assertFalse(result, "Admin option is not present");
		
		boolean result1=home.PIMDisplayed();
		s.assertTrue(result1, "PIM option is present");
		
		boolean result2=home.LeaveDisplayed();
		s.assertTrue(result2, "Leave option is present");
		
		s.assertAll();
	//System.out.println("Hello");
		
	}
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("its after method of class1");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("its after  class of class1");
	}
	
	@AfterTest
	public void Aftertest()
	{
		
		
	}
	
	

}
