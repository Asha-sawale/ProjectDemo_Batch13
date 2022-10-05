package Test_testngDemo;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_amazon {
WebDriver driver;

  // step1--browser openeing 

   @Test
   public void testFunAmazon() throws Exception
   
   
   {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//find serchbar and sendkeys mobile
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
     Thread.sleep(5000);
     
     
       List<WebElement> Allopt=driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));
		System.out.println(Allopt.size());
		Thread.sleep(2000);
		for(int i=0;i<Allopt.size();i++) {
			System.out.println(Allopt.get(i).getText());
			if(Allopt.get(i).getText().equalsIgnoreCase("iphone 13")); {
				Allopt.get(i).click();
				
			break;
	}
			
		
}
		//Scrolling code
		
WebElement mobinfo=driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro (128 GB) - Alpine Green']"));	
JavascriptExecutor js=(JavascriptExecutor) driver;

		
		js.executeScript("arguments[0].scrollIntoView()", mobinfo);
            // String info=mobinfo.getText();
        
		   mobinfo.click();
     

   
		   String parentid=driver.getWindowHandle();
			System.out.println(parentid);
			Set<String>allid=driver.getWindowHandles();
			System.out.println(allid);
			List<String> id=new ArrayList(allid);
			String pi=id.get(0);
			System.out.println("Parent_id"+pi);
			String ci=id.get(1);
			System.out.println("Child_id"+ci);
			driver.switchTo().window(ci);

TakesScreenshot ts=(TakesScreenshot)driver;
String sc=RandomString.make(4);
File src=ts.getScreenshotAs(OutputType.FILE);
File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screen4\\"+sc+".png");

 FileUtils.copyFile(src,destn);		   
 //WebElement price=driver.findElement(By.xpath(("//span[contains(text(),'74,439')])[8])")));


//get product name and price 
   //System.out.println(price.getText());
  //System.out.println(mobinfo.getText());
 //screenshot  
 
   //WebElement cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
   //cart.click(); 

   
   //Thread.sleep(5000);
   
   
// product Add  to Cart>>>>>>>>.
		WebElement add_to_cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		add_to_cart.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		WebElement btn2=driver.findElement(By.xpath("//div[@id='nav-cart-count-container']"));
		btn2.click();
		 Thread.sleep(5000);
		/*//ScreenShot only one product Added or not
		TakesScreenshot ts1= (TakesScreenshot)driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File Dest1=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screen2\\test3.png");
		FileUtils.copyFile(src1, Dest1);
		Thread.sleep(5000);
		//delete added product
		driver.findElement(By.xpath("//input[@data-action='delete']")).click();
		//ScreenShot for delete added product
		Thread.sleep(6000);
		TakesScreenshot ts2= (TakesScreenshot)driver;
		File src2=ts2.getScreenshotAs(OutputType.FILE);
		File Dest2=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screen3\\test4.png");
		FileUtils.copyFile(src2, Dest2);
		//Thread.sleep(3000);
		//Comparing string by using Assert>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//WebElement cart1=driver.findElement(By.xpath("//h1[contains(@class,'a-spacing-mini a-spacing-top-base')]"));
		//String Expected_result=" Your Amazon Cart is empty.";
		//String Actual_result=cart1.getText();
	//	Assert.assertEquals(Actual_result, Expected_result);
	
	*/ 
		String sc1=RandomString.make(4);
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screen5"+sc1+".png");

		 FileUtils.copyFile(src1,destn1);		   
 
		 WebElement delete=driver.findElement(By.xpath("//input[@data-action='delete']"));
   
         delete.click();
         Thread.sleep(5000);
         
         String sc2=RandomString.make(4);
 		File src2=ts.getScreenshotAs(OutputType.FILE);
 		File destn2=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\screen6\\"+sc2+".png");
 		 FileUtils.copyFile(src2,destn2);		   
 		 
 		 Thread.sleep(3000);
 		 
 		WebElement empty_cart=driver.findElement(By.xpath("//h1[contains(@class,'a-spacing-top-base')]"));
   
   String expected = "Your Amazon Cart is empty.";
  String actual = empty_cart.getText();
   Assert.assertEquals(actual, expected);
   
   }
  }



		






