package BigBinary.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BigBinary.BusinessLogic.Signup;



public class Sign {

	public WebDriver driver;
		
	@Test
	//test
	public void application_signup() throws Exception
	{
		driver=new ChromeDriver();
		Signup s=PageFactory.initElements(driver,Signup.class);
		driver.manage().window().maximize();
		driver.get("https://staging.aceinvoice.com/sign_in");
		s.usercreation();
	}
}
