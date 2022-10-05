package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Dell\\Downloads\\iframe.html");
		driver.manage().window().maximize();
	//menu option click
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
	int countiframe=list.size();
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	//frame can be handled by index of iframe on page,name or id amd by webelement also
	driver.switchTo().frame(1);//by index
	//driver.switchTo().frame("Selenium");//by name 
	
	//WebElement framesel=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
	//driver.switchTo().frame(framesel);//by using webelement
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
	//driver.switchTo().defaultContent(); //method to go to main page
	//driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
