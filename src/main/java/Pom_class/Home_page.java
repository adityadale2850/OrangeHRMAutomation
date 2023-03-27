package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave;
	@FindBy(xpath="//span[text()='Time']")
	private WebElement Time;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement profileDropdown;
	@FindBy(xpath="//a[text()='Support']")
	private WebElement Dropdownsupport;
	
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean AdminDisplayed()
	{
		boolean text=Admin.isDisplayed();
		return text;
		
    }
	public boolean PIMDisplayed()
	{
	      boolean result= PIM.isDisplayed();
	      return result;
    }
	
	public boolean LeaveDisplayed()
	{
		boolean result=Leave.isDisplayed();
		return result;
	}
	
	public void TimeElementElement()
	{
		Time.click();
		boolean time=Time.isSelected();
		if(time==true)
		{
			System.out.println("true:Time Element is Enable");
		}
		else
		{
			System.out.println("False:Time Element disabled");
		}
	}
	
	
	public void openkdropdown()
	{
		profileDropdown.click();
	}
	public void supportElementEnable()
	{
		boolean support=Dropdownsupport.isEnabled();
		if(support ==true) 
		{
			System.out.println("true: support Element is Enable");
		}
		else
		{
			System.out.println("False: Support Element is Disable");
	    }
	}
	
}