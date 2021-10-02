package week5.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations extends BaseClass{
	
  @Test
  public void test1() {
	  System.out.println("test1");
	
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod - test1");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass - test1");
  }
  
	
}
