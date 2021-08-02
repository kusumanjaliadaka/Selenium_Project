import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest {
	Third Cal=new Third();


  @Test
  public void divTest() {
	  Assert.assertEquals(Cal.div(5,5),1);
	    System.out.println("Test1");
  }

  @Test
  public void mulTest() {
	  Assert.assertEquals(Cal.mul(5,5),25);
	    System.out.println("Test2");
  }

}
