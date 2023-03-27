package mainUtilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWait {
	static WebDriver driver;
	
	public static void waitImplicit(int timeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	public static void waitExplicit(int timeout,String Elementxpath)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Elementxpath)));
	}
	public static void Fluentwait(int timeout,int polling)
	{
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
	             .pollingEvery(Duration.ofSeconds(polling)).ignoring(NoSuchElementException.class);
	}

}
