package Utility_generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class library {

	public static void HandleDropDown(WebElement element,String text )
		// TODO Auto-generated method stub
	{
		//tagname select---Select class
		try
		{
			Select drp=new Select(element);
			drp.selectByValue(text);
		}catch(Exception e)
	
	
		{
			System.out.println(e.getMessage());
		}
	}
public static void customise_sendKeys(WebElement element,String value)
{
	try {
		element.sendKeys(value);
	}
	catch(Exception e) {
		
		System.out.println(e.getMessage());
		}
	}
public static void customise_click(WebElement element)
{
	
	try {
		element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
