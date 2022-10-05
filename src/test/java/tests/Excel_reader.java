package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	String path="C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\ExTestData.xlsx";
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String data1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(data1);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.close();
	
	}

}
