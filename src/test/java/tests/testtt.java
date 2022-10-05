package tests;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
    search.sendKeys("maven repository");
  

	
	
	
	
	
	}

}
