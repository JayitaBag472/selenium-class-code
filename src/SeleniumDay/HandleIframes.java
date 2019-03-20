package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleIframes {
	
	public static void main(String args[]){
		
		FirefoxDriver dr= new FirefoxDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.get("https://paytm.com/");
		
		//System.out.println(dr.findElements(By.tagName("iframe")).size());
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		
		dr.switchTo().frame(0);
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("890786");
		
		//a[@title='close']
		
		dr.switchTo().defaultContent();
		dr.findElement(By.xpath("//a[text()='X']")).click();
		System.out.println(dr.findElements(By.tagName("iframe")).size());
		dr.findElement(By.xpath("//input[@name='username']")).click();
	}

}
