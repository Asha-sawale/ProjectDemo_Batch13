package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tests1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();//to open chrome browser
WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
    System.out.println(url);
	
	driver.navigate().to("https://mvnrepository.com/");
	Thread.sleep(3000);
	driver.navigate().back();
     Thread.sleep(3000);
	driver.navigate().forward();
	}

}
