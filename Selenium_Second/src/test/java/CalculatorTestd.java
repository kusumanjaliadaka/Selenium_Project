import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTestd {
	Calculator Cal=new Calculator();
  @Test(dataProvider="dpaddition")
  public void add1Test(int exp_value,int a,int b) {
	
	Assert.assertEquals(Cal.add1( a, b), exp_value);
	  System.out.println("addition");
  }
  @DataProvider(name="dpaddition")
  public Object[][] getdata() {
	  return new Object[][] {{10,5,5},{50,25,5},{50,25,25},{15,10,5}};
  }
  
}