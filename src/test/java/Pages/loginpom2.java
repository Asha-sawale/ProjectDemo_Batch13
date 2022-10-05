package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom2 {

	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement Fname;
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement Lname;
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement phone;
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement Email;
	@FindBy(how=How.XPATH,using="//input[@name='address1']")WebElement address;
	@FindBy(how=How.XPATH,using="//input[@name='city']")WebElement city;
	@FindBy(how=How.XPATH,using="//input[@name='state']")WebElement state;
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")WebElement pcode;
	//HandleDropDown(WebElement element,String text )
	@FindBy(how=How.XPATH,using="//select[@name='country']")WebElement country;
	@FindBy(how=How.XPATH,using="//input[@id='email']")WebElement Uemail;
	@FindBy(how=How.XPATH,using="//input[@name='password']")WebElement pass;
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")WebElement Cpass;
	@FindBy(how=How.XPATH,using="//input[@name='submit']")WebElement submit;
	
	public WebElement getfname()
	{
		 return Fname;
	}

	public WebElement getlname()
	{
		 return Lname;
	}
	public WebElement getphone()
	{
		 return phone;
	}

	public WebElement getEmail()
	{
		 return Email;
	}

	public WebElement getaddre()
	{
		 return address;
	}

	public WebElement getcity()
	{
		 return city;
	}

	public WebElement getstate()
	{
		 return state;
	}

	public WebElement getpcode()
	{
		 return pcode;
	}
	public WebElement getcountry()
	{
		 return country;
	}
	public WebElement getuemail()
	{
		 return Uemail;
	}
	public WebElement getpass()
	{
		 return pass;
	}
	public WebElement getCpass()
	{
		 return Cpass;
	}

	public WebElement gettxt_submit()
	{
		 return submit;
	}


}
