package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_Scroll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-500)", "");
	
	
	Thread.sleep(3000);
	WebElement link=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	//WebElement link=driver.findElement(By.xpath("linkText()='English (UK)']"));
	
  js.executeScript("arguments[0].scrollIntoView()", link);
	
	}

}
