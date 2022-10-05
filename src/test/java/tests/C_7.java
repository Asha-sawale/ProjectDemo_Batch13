package tests;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class C_7 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");
	String RM=RandomString.make(3);
	//full page screenshot is done here
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screenshot\\"+RM+".png");
	
	FileUtils.copyFile(src,destn);//when we runs twice.....then new screenshot overrides old one 
	//only webelement screenshot is done here 
	//so we'll generate random string to recognise next iteration
	WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
	
	File src1=logo.getScreenshotAs(OutputType.FILE);
	File destn1=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screenshot\\logo.png");
	
	FileUtils.copyFile(src1,destn1);
	
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	File src2=login.getScreenshotAs(OutputType.FILE);
	File destn2=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screenshot\\login.png");
	FileUtils.copyFile(src2,destn2);
	}

}

