package Test_testngDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandle {

     @Test
     public void verifyChildWindowHandle()
     {
    	 //Browser open
    	 
    	 WebDriverManager.chromedriver().setup();
    	 
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://demo.guru99.com/popup.php");
    	 driver.manage().window().maximize();
    	 //for parrent window
    	 String ParentID=driver.getWindowHandle();
    	 System.out.println("ParentID");
    	 // do action on element 
    	 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
    	 		
    	 Set<String> AllID=driver.getWindowHandles();
    	 
    	 System.out.println("AllID");
    	 //set is converted to list
    	 List<String> id=new ArrayList(AllID);
       String idParent=id.get(0);
       System.out.println("ParentID is "+idParent);
        String idChild=id.get(1);
        System.out.println("ChildID is "+idChild);
    
        
        driver.switchTo().window(idChild);

        
        //action on element 
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Asha");
        
        //driver.close();
        //driver.quit();
        
     
    }
     }
