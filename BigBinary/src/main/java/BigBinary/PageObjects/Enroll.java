package BigBinary.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enroll {
	
	@FindBy(xpath="//strong[contains(text(),'Sign Up')]")
	public static WebElement Register;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement Login;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	public static WebElement EmailId;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement GetStarted;
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement Password;
	
	@FindBy(xpath="//input[@name='password_confirmation']")
	public static WebElement ConfirmPassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public static WebElement Continue;
	
	@FindBy(xpath="//input[@name='user[first_name]']")
	public static WebElement FirstName;
	
	@FindBy(xpath="//input[@name='user[last_name]']")
	public static WebElement LastName;
	
	@FindBy(xpath="//input[@name='commit']")
	public static WebElement Conti;
	
	@FindBy(xpath="//input[@name='name']")
	public static WebElement OName;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement OEmail;
	
	@FindBy(xpath="//input[@name='commit']")
	public static WebElement Con;
	
	@FindBy(xpath="//a[@class='skip-step']")
	public static WebElement Skip;
	
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	public static WebElement Continuetoapp;
	
	@FindBy(xpath="")
	public static WebElement Name;
	
	@FindBy(xpath="")
	public static WebElement Email;
	

}
