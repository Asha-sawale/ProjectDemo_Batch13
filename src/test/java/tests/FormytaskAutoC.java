package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormytaskAutoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://formy-project.herokuapp.com/autocomplete");
	 driver.manage().window().maximize();
	 
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("vrindawan nagar,nashik");
	
	driver.findElement(By.xpath("//input[@id='street_number']")).sendKeys("amrapali lawnce");
	
	driver.findElement(By.xpath("//input[@id='route']")).sendKeys("Near bhavani mandir");
	driver.findElement(By.xpath("//input[@id='locality']")).sendKeys("Nashik");
	
	driver.findElement(By.xpath("//input[@id='administrative_area_level_1']")).sendKeys("Maharashtra");
	
	driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("422010");
	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("INDIA");
	
	
	
	
	
	}

}
