package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	@FindBy(xpath="//input[@name='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement Forgotyourpassword;
	
	
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void sendusername(String Uname)
	{
		Username.sendKeys(Uname);
	}
	public void sendpassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickloginbutton()
	{
		LoginButton.click();
	}
	public void forgotyourpassword()
	{
		Forgotyourpassword.click();
	}
	
	

}
