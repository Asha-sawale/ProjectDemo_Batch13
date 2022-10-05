package Test_testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testt3 {

	
	WebDriver driver;
 
	
	
	@BeforeMethod
public void BrowserOpen() {
	
WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
driver.get("https://www.facebook.com/login.php");
driver.manage().window().maximize();
}
@Test
public void test_VerifyfunFblogin_1(){
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("Test@123");
	
}

@Test
public void test_VerifyfunFblogin_2(){
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("Test@123");
	
}
@Test
public void test_VerifyfunFblogin_3(){
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("Test@123");
	
}


@AfterMethod
public void tearDown()
{
	driver.close();
}




}
