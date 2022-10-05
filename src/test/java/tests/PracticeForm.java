package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeForm {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	
	driver.manage().window().maximize();
	
	String path="C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\practiceForm\\pract.xlsx";
    FileInputStream fis=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

	String data1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	

	String data2=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
  //now we will identify webElements
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data1);
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(data2);
	driver.findElement(By.xpath("//input[@id='sex-1']")).click();
	driver.findElement(By.xpath("//input[@id='exp-3']")).click();
	driver.findElement(By.xpath("//input[@id='profession-1']")).click();
	driver.findElement(By.xpath("//input[@id='tool-2']")).click();
    WebElement Dropdown=driver.findElement(By.xpath("//select[@name='continents']"));
     Select sel=new Select(Dropdown);
	 sel.selectByVisibleText("Asia");
  
	 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		// js.executeScript("document.getElementByxpath("//input[@name='lastname']").value='sawale');
		js.executeScript("window.scrollBy(0,500)", "");	 
		 
			
		 driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
	   
		//List<WebElement>AllOptions=driver.findElements(By.xpath("//select[@id='selenium_commands']"));
		
		//WebElement imgup=driver.findElement(By.xpath("//span[text()='Upload Image']"));
		
		WebElement image = driver.findElement(By.xpath("//input[@class='input-file']"));

		image.sendKeys("C:\\Users\\Dell\\OneDrive\\Pictures\\Camera Roll\\WIN_20200908_12_53_19_Pro (2).jpg");
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	    
	 }

}
