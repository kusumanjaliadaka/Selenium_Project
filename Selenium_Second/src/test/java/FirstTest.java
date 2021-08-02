import org.testng.Assert;

import org.testng.annotations.Test;

public class FirstTest {
	
	Calculator Cal=new Calculator();

  @Test
  public void add1Test() {
    Assert.assertEquals(10,Cal.add1(5,5));
    System.out.println("Test1");
  }

  @Test
  public void sub1Test() {
    Assert.assertEquals(25,Cal.sub1(30, 5));
    System.out.println("Test2");
  }
  
}