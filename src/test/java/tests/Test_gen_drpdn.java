package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility_generic.library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_gen_drpdn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		WebElement txt_Fname=driver.findElement(By.xpath("//input[@name='firstName']"));
		library.customise_sendKeys(txt_Fname, "Asha");
		
		WebElement txt_Lname=driver.findElement(By.xpath("//input[@name='lastName']"));
		library.customise_sendKeys(txt_Lname, "Sawale");
		
		WebElement txt_Ph=driver.findElement(By.xpath("//input[@name='phone']"));
		library.customise_sendKeys(txt_Ph, "8815454145");
		
		WebElement txt_Email=driver.findElement(By.xpath("//input[@id='userName']"));
		library.customise_sendKeys(txt_Email,"ABC@gmail.com");
		
		WebElement txt_Addr=driver.findElement(By.xpath("//input[@name='address1']"));
		library.customise_sendKeys(txt_Addr, "Vrindawan Nagar");
		
		WebElement txt_city=driver.findElement(By.xpath("//input[@name='city']"));
		library.customise_sendKeys(txt_city, "Nashik");
		
		WebElement txt_St=driver.findElement(By.xpath("//input[@name='state']"));
		library.customise_sendKeys(txt_St, "Mharashtra");
		
		WebElement txt_Pcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		library.customise_sendKeys(txt_Pcode, "422010");
		
		WebElement Dr_coun=driver.findElement(By.xpath("//select[@name='country']")); //code for handelling dropdown 
		//library.HandleDropDown(Dr_coun, "AUSTRALIA");
		//library.HandleDropDown(Dr_coun,"BURMA");
		//library.customise_sendKeys(Dr_coun,"INDIA");
          library.HandleDropDown(Dr_coun, "INDIA");
		WebElement txt_Uname=driver.findElement(By.xpath("//input[@name='email']"));
	    library.customise_sendKeys(txt_Uname, "Sanskruti@gmail.com");

		WebElement txt_Pword=driver.findElement(By.xpath("//input[@name='password']"));
		library.customise_sendKeys(txt_Pword, "utkarsh@15");
		
		WebElement txt_CPword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		library.customise_sendKeys(txt_CPword, "utkarsh@15");
		
		WebElement txt_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		library.customise_click(txt_submit);
		}

}
