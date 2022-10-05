package Test_testngDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testt2 {


@BeforeMethod
public void BrowserOpen()
{
	System.out.println("Browser Open");
}

@Test
public void test1()
{
	System.out.println("Test 1");
}
@Test
public void test2()
{
	System.out.println("Test 2");
}
@Test
public void test3()
{
	System.out.println("Test 3");
}

@Test
public void test4()
{
	System.out.println("Test 4");
}
@Test
public void test5()
{
	System.out.println("Test 5");
}

@AfterMethod
public void tearDown() {
	System.out.println("Browser close");
}











}
