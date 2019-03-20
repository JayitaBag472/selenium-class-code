package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	public void lauch(){
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ejaybag\\Downloads\\chromedriver.exe");
		 dr = new ChromeDriver();
		 
	 dr.manage().window().maximize();
	 
	 dr.get("http://newtours.demoaut.com/");
	 dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	// dr.findElement(By.tagName("input")).sendKeys("mecury");
	 //dr.findElement(By.name("input")).sendKeys("mecury");
	 //dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("mecury");
	 
	// dr.findElement(By.xpath("//input[@type='text' or @name ='userName']")).sendKeys("mecury");
	//dr.findElement(By.xpath("//input[@type='password' or @name ='password']")).sendKeys("mecury");
	dr.findElement(By.xpath("//input[@type='image' or @name ='login']")).sendKeys(Keys.ENTER);
	
	String actual = dr.findElement(By.xpath("//tr/td/p/font/b")).getText();
	
	String expect = "Welcome back to Mercury Tours!";
	
	Assert.assertEquals(expect, actual);
	
	System.out.println(actual);
	System.out.println(expect);
	System.out.println("Pass");
	
		//System.setProperty("webdriver.ie.driver","C:\\Users\\ejaybag\\Downloads\\IEDriverServer.exe");
		//dr = new InternetExplorerDriver();
		
		
		
		
		
	}
	
	

}
