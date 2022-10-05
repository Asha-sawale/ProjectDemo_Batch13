package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
	
		WebElement txt_Fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		txt_Fname.sendKeys("Asha");
		
		WebElement txt_Lname=driver.findElement(By.xpath("//input[@name='lastName']"));
		txt_Lname.sendKeys("Sawale");
		
		
		WebElement txt_Ph=driver.findElement(By.xpath("//input[@name='phone']"));
		txt_Ph.sendKeys("8854845455");
		

		
		WebElement txt_Email=driver.findElement(By.xpath("//input[@id='userName']"));
		txt_Email.sendKeys("ABC@gmail.com");
		

		
		WebElement txt_Addr=driver.findElement(By.xpath("//input[@name='address1']"));
		txt_Addr.sendKeys("Vrindawan Nagar");
		

		
		WebElement txt_city=driver.findElement(By.xpath("//input[@name='city']"));
		txt_city.sendKeys("Nashik");
		
		
		WebElement txt_St=driver.findElement(By.xpath("//input[@name='state']"));
		txt_St.sendKeys("Vrindawan Nagar");
		
		
		
		WebElement txt_Pcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		txt_Pcode.sendKeys("422010");
		
		
		WebElement txt_Uname=driver.findElement(By.xpath("//input[@name='email']"));
		txt_Uname.sendKeys("Sanskruti@gmail.com");
		

		
		WebElement txt_Pword=driver.findElement(By.xpath("//input[@name='password']"));
		txt_Pword.sendKeys("utkarsh@15");
		
		
		
		WebElement txt_CPword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		txt_CPword.sendKeys("utkarsh@15");
		
		WebElement txt_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		txt_submit.click();
		
		

		

		
		
		


	}

}
