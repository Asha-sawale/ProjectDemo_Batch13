package Test_testngDemo;

import org.testng.annotations.Test;

public class Testt5 {

@Test(groups= {"Sanity"})
public void M1()
{
	System.out.println("M1");
}



@Test(groups={"Regression"})
public void M2()
{
	System.out.println("M2");
}




@Test(groups={"Sanity"})
public void M3()
{
	System.out.println("M3");
}




@Test(groups={"Regression"})
public void M4()
{
	System.out.println("M4");
}



@Test(groups={"Sanity"})
public void M5()
{
	System.out.println("M5");
}




}
