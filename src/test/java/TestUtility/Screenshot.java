package TestUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	static WebDriver driver;
	public static void getscreenshotMethod() throws IOException
	{
		 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("xpathoffolder\\Image.png");
		 FileHandler.copy(source, dest);
	}

}
