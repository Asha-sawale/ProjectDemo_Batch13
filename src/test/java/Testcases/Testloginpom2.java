package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.loginpom;
import Pages.loginpom2;
import Utility_generic.library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testloginpom2 {

	private static final WebElement WebElement = null;

	@Test
	public void test1()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		loginpom2 login2=PageFactory.initElements(driver,loginpom2.class );


		login2.getfname().sendKeys("Asha");
		login2.getlname().sendKeys("Sawale");
		login2.getphone().sendKeys("544488484");
		login2.getEmail().sendKeys("abc@gmail.com");
		login2.getaddre().sendKeys("vrindawan nagar");
		login2.getcity().sendKeys("Nashik");
		login2.getstate().sendKeys("Maharashtra");
		login2.getpcode().sendKeys("412010");
		library.HandleDropDown(login2.getcountry(),"INDIA");
		//login2.getcountry().sendKeys("INDIA");
		login2.getuemail().sendKeys("Utarsh@123");
		login2.getpass().sendKeys("abc123");
		login2.getCpass().sendKeys("abc123");
		//login2.getsubmit().click();

//here all the webelements refered to as login2 variable of pagefactory
		
		
		

		

		

	
	}
	
	
	
	}
