package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_cl_rcl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// MouseHover
		
	
		//
		//	right click --contextclick();
			
			Actions act=new Actions(driver);
			
			// right click on webelement
			WebElement rtcl=driver.findElement(By.xpath("//span[text()='right click me']"));
			WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
			act.contextClick(rtcl).click(quit).build().perform();
			//Thread.sleep(3000);
			// double click on webelement
			//WebElement dcl=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			//act.doubleClick(dcl).build().perform();
		}

	
	
	
	
}


