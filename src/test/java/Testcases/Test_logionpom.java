package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.loginpom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_logionpom {

@Test
public void test1()
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
   //implicit wait .....
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

/////////OR we also give as
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
//emailid password
	
	
	loginpom login=PageFactory.initElements(driver,loginpom.class );

	
	
	//login is reference of loginpom..so
	login.getemail().sendKeys("Asha");
	login.getpass().sendKeys("88058666");
	


}





}
