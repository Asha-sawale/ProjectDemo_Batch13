package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.loginpom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://facebook.com/");
     driver.manage().window().maximize();
	//implicit wait
     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //OR
     
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     loginpom login=PageFactory.initElements(driver,loginpom.class);
	
	//login.getemail().sendKeys("Test");
	//login.getpass().sendKeys("1234455");
	
	//login.getlogin().click();
	
	//explicit wait
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(login.getemail())).sendKeys("test");
	wait.until(ExpectedConditions.elementToBeClickable(login.getlogin())).click();
	
	//ApplyExplicitWait_elementToBeClickable(driver,5,login.getlogin());
	
	//PPLYING GENERIC METHODS
	
	
	ApplyExplicitWait_elementToBeClickable(driver,2,login.getlogin());
	
	}


//geniteric method
	public static void ApplyExplicitWait_elementToBeClickable(WebDriver driver,int time,WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	
	
	
	
	
	}
}
