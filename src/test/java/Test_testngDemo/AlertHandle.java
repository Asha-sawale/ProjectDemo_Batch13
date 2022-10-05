package Test_testngDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {


@Test
public void HandleAlert() throws InterruptedException {
//Browser Open	

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.manage().window().maximize();

//identify pirticular element of popup
WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));

submit.click();
//handle popup

Alert alt=driver.switchTo().alert();

//get the text
String text=alt.getText();
System.out.println(text);

//click on cancel button
//alt.dismiss();


//click on OK button

alt.accept();
Thread.sleep(2000);
String text2=alt.getText();
System.out.println(text2);

alt.accept();

//
//Library.custom_HandleAlert_text(driver);



}

}
