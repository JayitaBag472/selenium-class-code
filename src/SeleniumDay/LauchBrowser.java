package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LauchBrowser {
	
	@Test
	public void openBrowser(){
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ejaybag\\Downloads\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Users\\ejaybag\\Downloads\\Drivers\\IEDriverServer.exe");
		//ChromeDriver dr= new ChromeDriver();
		//InternetExplorerDriver dr = new InternetExplorerDriver();
		dr= new ChromeDriver();
		//dr= new InternetExplorerDriver();
	    dr.manage().window().maximize();// for opening the browser in broad mode
	    
	    dr.get("https://www.t-mobile.com/");// for navigation
	    dr.navigate().to("https://www.t-mobile.com/");// for navigation
	    
	    dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    //dr.findElement(By.className("icon slide")).click();
	    
	    dr.findElement(By.xpath("/html/body/header/nav/div[2]/div[3]/form/div[2]")).click();
	    dr.findElement(By.xpath("/html/body/header/nav/div[2]/div[3]/form/div[2]")).sendKeys("iphone");
	    dr.close();
		
	}

}


