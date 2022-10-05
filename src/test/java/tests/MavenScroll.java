package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenScroll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/");
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,900)", "");
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-900)", "");
	
	
	Thread.sleep(3000);
	
	WebElement element=driver.findElement(By.xpath("//img[@class='im-logo']"));
	
     js.executeScript("arguments[0].scrollIntoView()", element);
	
	}

}
