package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
//open browser...	first step if test case
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Maven");
	//instead of storing webelement into variable we just send the keys in the webfield
	//second step of test case
	
	Thread.sleep(3000);
	List<WebElement> AllOptions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	System.out.println(AllOptions.size());
	
	for(int i=0;i<AllOptions.size();i++)
		
	{
		System.out.println(AllOptions.get(i).getText());
		if(AllOptions.get(i).getText().equalsIgnoreCase("maven dependency"))
		{
			AllOptions.get(i).click();
		break;
	
	}
	
	
	}

}
	
}
