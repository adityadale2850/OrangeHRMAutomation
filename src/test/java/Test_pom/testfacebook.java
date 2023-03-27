package Test_pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestUtility.StaticBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testfacebook {
	
	WebDriver driver;
	@Parameters({"browser"})
	
	@BeforeTest
	public void beforetest(String browser)
	{
		driver=StaticBrowser.Openfacebooklink(browser, "https://www.facebook.com/login/", 10);
		
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
	public void LaunchBrowser()
	{
		System.out.println("Launched Browser");
		
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
	public void aftertest() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(3000);
		
	}

}
