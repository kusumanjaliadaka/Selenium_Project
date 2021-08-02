import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	Calculator Cal=new Calculator();

  @Test(dependsOnMethods="sub1Test")
  public void add1Test() {
    Assert.assertEquals(10,Cal.add1(5,5));
    System.out.println("addition");
  }

  @Test
  public void sub1Test() {
    Assert.assertEquals(25,Cal.sub1(30, 5));
    System.out.println("sub");
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("print before");	  
  }
  
  @AfterMethod
  public void aftermethod() {
	System.out.println("print after"); 
  }
  
  @BeforeClass
  public void beforeclass() {
	  System.out.println("before class");
	  
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("after class");
  }
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("before suite");
	  
  }
  @AfterSuite
  public void aftersuite() {
	  System.out.println("after suite");
	  
  }
  @BeforeTest
  public void beforetest() {
	  System.out.println("before test");
  }
  
  @AfterTest
  public void aftertest() {
	  System.out.println("after test");
  }
}

