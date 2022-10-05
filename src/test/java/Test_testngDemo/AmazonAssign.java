package Test_testngDemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssign {

WebDriver driver;
@Test
public void testcaseOfAmazon() throws Exception
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();

WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

search.sendKeys("mobile");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


JavascriptExecutor js=(JavascriptExecutor) driver;

WebElement mob=driver.findElement(By.xpath("(//img[@class='s-image'])[33]"));

js.executeScript("arguments[0].scrollIntoView()", mob);

//String text=driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[26]")).getText();
//System.out.println(text);

mob.click();

driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
//driver.navigate().refresh();
//driver.findElement(By.xpath("//a[@id='nav-cart']")).click();

Set<String> AllId=driver.getWindowHandles();
System.out.println(AllId);
List<String> id=new ArrayList();
String idParent=id.get(0);
String idChild=id.get(1);
driver.switchTo().window(idChild);
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();


TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File destn=new File("C:\\Users\\Dell\\eclipse-workspace\\Batch_13M\\scr\\test5.png");


FileUtils.copyFile(src,destn);	
driver.navigate().refresh();
driver.findElement(By.xpath("//a[@id='nav-cart']")).click();


}






}
