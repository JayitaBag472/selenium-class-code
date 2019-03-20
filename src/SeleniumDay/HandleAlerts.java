package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	public static void main(String args[]){
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		dr.get("http://www.rediff.com/");
		
		dr.findElement(By.xpath("//u[text()='rediffmail']")).click();
		
		dr.findElement(By.xpath("//input[@value='Go']")).click();
		
		Alert al = dr.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		
		dr.switchTo().defaultContent();
		
		dr.findElement(By.xpath("//input[@value='Go']")).click();
		
	
		
		
		
		
		
	}

}
