package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {

@FindBy(how=How.XPATH,using="//input[@id='email']")WebElement email;
@FindBy(how=How.XPATH,using="//input[@id='pass']")WebElement pass;
@FindBy(how=How.XPATH,using="//button[@name='login']")WebElement login;
//here we will use getter method to get the values 'encapsulation concept '
public WebElement getemail()
{
	 return email;
}

public WebElement getpass()
{
	 return pass;
}

public WebElement getlogin()
{
	return login;
}





}
