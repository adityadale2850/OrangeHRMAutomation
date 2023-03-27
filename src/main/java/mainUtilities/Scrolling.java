package mainUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {
	static WebDriver driver;
	public static void scrollingbypixelMethod()
	{
		JavascriptExecutor scroll= ((JavascriptExecutor)driver);
		scroll.executeScript("window.scrollBy(0,300)");
	}
	public static void scrollingbyIntoviewMethod()
	{
		WebElement argument=driver.findElement(By.xpath(null));
		JavascriptExecutor scroll1= ((JavascriptExecutor)driver);
		
		scroll1.executeScript("arguments[0].scrollIntoview(true)",argument);
	}

}
