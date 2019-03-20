package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragOperation {
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dr.navigate().to("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act = new Actions(dr);// hovering of mouse
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		WebDriverWait wait = new WebDriverWait(dr,60);
		
		//wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//span[text()='Shirts']"))));
		
		//dr.findElement(By.xpath("//span[text()='Shirts']")).click();
		
	//	act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")),50,0).build().perform();
		
		//Thread.sleep(1000);
		//act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C')[2]")),-100,0).build().perform();
		
		
		//act.moveToElement(dr.findElement(By.xpath("//span[text()='Home & Furniture']"))).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//span[text()='Clocks']"))));
		
		dr.findElement(By.xpath("//span[text()='Clocks']")).click();
		
         act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")),50,0).build().perform();
		
		Thread.sleep(1000);
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")),-100,0).build().perform();
		
		
		
		
		
		
		
		
		

}
	
}
