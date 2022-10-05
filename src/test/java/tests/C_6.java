package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	//open browser...	first step if test case
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();

      driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
      
     Thread.sleep(3000);
     List<WebElement>lst=driver.findElements(By.xpath("//ui[@class='col-12-12 _1MRYA1 _38UFBk'/li"));
	System.out.println(lst.size());
	for(int i=0;i<lst.size();i++)
	{
		if(lst.get(i).getText().equalsIgnoreCase("mobile watch"));
		
		{
		lst.get(i).click();
		break;
		
	}
	}
}
}