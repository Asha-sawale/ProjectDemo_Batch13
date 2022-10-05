package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	driver.manage().window().maximize();
	WebElement Dr_coun=driver.findElement(By.xpath("//select[@name='country']")); //code for handelling dropdown 
	
	//with selectByIndex(int)
	Select sel=new Select(Dr_coun);
	
	sel.selectByIndex(6);
	Thread.sleep(2000);
	
	

	//select ByValue(string)
     sel.selectByValue("AUSTRALIA");
     Thread.sleep(2000);
     //select ByVisibleText(String)
     
     sel.selectByVisibleText("BELGIUM");
     
	}

 }


