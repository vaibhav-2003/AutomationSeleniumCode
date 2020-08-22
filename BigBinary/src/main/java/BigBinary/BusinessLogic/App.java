package BigBinary.BusinessLogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	//test
    public static void main( String[] args )
    {
    	WebDriver driver =new ChromeDriver();
        System.out.println( "Hello World!" );
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://staging.aceinvoice.com/sign_in");
        driver.findElement(By.xpath("//a[@class='signup-button border-radius-lg']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("abc@ab.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//input[@name='user[first_name]']")).sendKeys("hi");
        driver.findElement(By.xpath("//input[@name='user[last_name]']")).sendKeys("hi");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("IKS");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hi@hello.com");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.findElement(By.xpath("//a[@class='skip-step']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        		
        		
        
        
    }
}
