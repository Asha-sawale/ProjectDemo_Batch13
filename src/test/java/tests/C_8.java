package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class C_8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
         driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	
		String RM=RandomString.make(3);
		//full page screenshot is done here
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screen1\\test2.png");
		
		FileUtils.copyFile(src,destn);	
	
	
	}

}
