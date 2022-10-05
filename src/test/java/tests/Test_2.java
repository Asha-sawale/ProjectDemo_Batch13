package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	//identify webelements locatorsID
	
	WebElement txt_email=driver.findElement(By.id("email"));
	WebElement txt_password=driver.findElement(By.id("pass"));
	WebElement btn_login=driver.findElement(By.name("login"));
	
	//actions...
txt_email.sendKeys("Tesr@gmail.com");	
	
txt_password.sendKeys("123456789");
btn_login.click();
	
	
	}

}
