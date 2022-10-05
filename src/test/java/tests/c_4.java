package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	driver.manage().window().maximize();
	WebElement dr_cou=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(dr_cou);
	//dropdown with bydefault value 
	System.out.println(sel.getFirstSelectedOption().getText());
	
	//albania should be printed
	
	
	List<WebElement> list=sel.getOptions();//gets list of all option
	
	System.out.println(list.size());//264 elements 
	
	//drop down options will print on cosole
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().equals("INDIA"));
		list.get(i).click();
	//Handling dropdown without using select class methods
	
	}
	}

}
