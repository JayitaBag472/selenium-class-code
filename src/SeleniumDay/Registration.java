package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
	
	@Test
	public void lauch(){
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ejaybag\\Downloads\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-infobars");
		 dr = new ChromeDriver(op);
		 
	 dr.manage().window().maximize();
	 
	 dr.get("http://newtours.demoaut.com/");
	 dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	 
	//dr.findElement(By.linkText("REGISTER")).click();
	 dr.findElement(By.partialLinkText("REG")).click();
	 
	/*dr.findElement(By.xpath("//input[@name ='firstName']")).sendKeys("Jayita");
	dr.findElement(By.xpath("//input[@name ='lastName']")).sendKeys("Bag");
	dr.findElement(By.xpath("//input[@name ='phone']")).sendKeys("9007797018");
	dr.findElement(By.xpath("//input[@name ='userName']")).sendKeys("jayita.bag@yahoo.com");
	dr.findElement(By.xpath("//input[@name ='address1']")).sendKeys("Q.No-1/117/2");
	dr.findElement(By.xpath("//input[@name ='address2']")).sendKeys("Defence");
	dr.findElement(By.xpath("//input[@name ='city']")).sendKeys("Nagpur");
	dr.findElement(By.xpath("//input[@name ='state']")).sendKeys("Maharashtra");
	dr.findElement(By.xpath("//input[@name ='postalCode']")).sendKeys("440021");
	dr.findElement(By.xpath("//input[@name ='email']")).sendKeys("JayitaBag");
	dr.findElement(By.xpath("//input[@name ='password']")).sendKeys("JayitaBag@28");
	dr.findElement(By.xpath("//input[@name ='confirmPassword']")).sendKeys("JayitaBag@28");
	
	Select sel= new Select (dr.findElement(By.name("country")));
	
	//sel.selectByIndex(3);
	//sel.selectByValue("345");
    sel.selectByVisibleText("INDIA");	
    
    dr.findElement(By.xpath("//input[@type='image' or @name='register']")).click();*/
	
	
	
	
	
	
	
		
		
		
		
	}
	
	

}