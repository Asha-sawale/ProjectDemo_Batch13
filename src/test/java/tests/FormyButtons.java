package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility_generic.library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormyButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://formy-project.herokuapp.com/buttons");
	     
	     
	     
	     driver.findElement(By.xpath("//button[text()='Primary']")).click();
	     driver.findElement(By.xpath("//button[text()='Success']")).click();
	     driver.findElement(By.xpath("//button[text()='Info']")).click();
	     driver.findElement(By.xpath("//button[text()='Warning']")).click();
	     driver.findElement(By.xpath("//button[text()='Link']")).click();
	     driver.findElement(By.xpath("//button[text()='Left']")).click();
		   	
	     driver.findElement(By.xpath("//button[text()='Middle']")).click();
		   	
	     driver.findElement(By.xpath("//button[text()='Right']")).click();
	     driver.findElement(By.xpath("//button[text()='1']")).click();
	     driver.findElement(By.xpath("//button[text()='2']")).click();
		 WebElement drp=driver.findElement(By.xpath("//button[@id='btnGroupDrop1']"));	
		
	     library.HandleDropDown(drp,"Dropdown link 2" );  	
		 	  	
		// WebElement drp1=driver.findElement(By.xpath("//a[text()='Components']"));	  	

	    // library.HandleDropDown(drp1,"buttons" );  	
	 }

}
