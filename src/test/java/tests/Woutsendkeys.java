package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Woutsendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
        driver.manage().window().maximize();	
	

		WebElement txt_email=driver.findElement(By.id("email"));
	    WebElement txt_password=driver.findElement(By.id("pass"));
		WebElement btn_login=driver.findElement(By.name("login"));
		
	JavascriptExecutor j=(JavascriptExecutor) driver;
	 //(js("txt_email").executescript("document.ElementById('email').Value='Sanskruti'"));
	
	
	 j.executeScript("document.getElementById('email').value='Sanskruti'"); 
	
	 //j.executeScript ("document.getElementById('email').value='Selenium'");
	
	 j.executeScript("document.getElementById('pass').value='utkarsh'"); 
	
	
	 j.executeScript("arguments[0].click();",btn_login); 
	
	}

}
