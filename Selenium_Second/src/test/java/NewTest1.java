import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void browser_to_be_opened_chrome() {
	  System.out.println("chrome browser");
	 
  }
  @Test(priority=1)
  
  public void appln_open_the_login_page() {
	  System.out.println("login page to be opened");
  }
  
  @Test(priority=1)
  public void close() {
	  System.out.println("close browser");
  }
}

