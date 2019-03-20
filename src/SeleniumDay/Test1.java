package SeleniumDay;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
  @BeforeMethod
  public void Login() {
	  
	  System.out.println("Login");
  }
  @Test(priority=2)
public void TestCase1() {
	  
	  System.out.println("test case 1");
  }
  @Test(priority=1)
  public void TestCase2() {
  	  
  	  System.out.println("test case 2");
    }
  @Test(priority=3)
  public void TestCase3() {
  	  
  	  System.out.println("test case 3");
    }
  @AfterMethod
  public void Logout() {
	  
	  System.out.println("Logout");
  }
}
