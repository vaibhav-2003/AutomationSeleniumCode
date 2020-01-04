package BigBinary.BusinessLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BigBinary.PageObjects.Enroll;


public class Signup extends Enroll {
	
	public WebDriver driver;
	
	public CommonMethods cm;
	
	Enroll en = new Enroll();
	
	public Signup(WebDriver Driver)
	{
		this.driver=driver;
	}
	
	public void usercreation()
	{
		try
		{
			//driver.get(url);
			System.out.println(this.getClass().getSimpleName() +":url :- Passed");
			Thread.sleep(5000);
			//WebElement Reg =en.Register;
			//Reg.click();
			WebElement L=en.Login;
			L.click();
		}
		catch(Exception e)
		{
			//System.out.println(this.getClass().getSimpleName() +":url :- Passed");
			e.printStackTrace();
		}
	}

}
