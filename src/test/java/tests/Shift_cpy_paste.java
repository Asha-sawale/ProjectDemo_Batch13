package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shift_cpy_paste {
	
	
	public static void main(String[] args)
	{
		
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	// Actions 
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	
	Actions act=new Actions(driver);
	// WebElement + Shift press +bugspotter ---> BUGSPOTTER
	act.keyDown(txt_email, Keys.SHIFT).sendKeys("utkarsh").keyUp(Keys.SHIFT).build().perform();
	
	
	//ctrl+a ---> select
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	//ctrl+c
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	//webelement +click
	WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
	txt_password.click();
	//ctrl+v
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
	btn_login.sendKeys(Keys.ENTER);
	
	
	}

















}
