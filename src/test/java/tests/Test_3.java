package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	// identifying webelements on webpage by xpath locators with attributes
	//relative xpath
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	txt_email.sendKeys("Test");
	WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));
	txt_password.sendKeys("48733838");
	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
	btn_login.click();
	driver.findElement(By.xpath("//a[text()='Forgotten password?']"));

	
	
	//driver.close();
	
	}

}
