package SeleniumDay;


import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FindElements {
	
	public static void main (String args[]) throws InterruptedException{
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"null");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		//dr.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		dr.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(dr,60);// explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _29YdH8']")));// explicit wait
		
		
		
		//Thread.sleep(10000);
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfAllElements(dr.findElements(By.xpath("//ul/li[@class='Wbt_B2']/a/span"))));
		//int total=dr.findElements(By.xpath("//ul/li[@class='Wbt_B2']/a/span")).size();
		
		//System.out.println(total);
		
		List<WebElement> list =dr.findElements(By.xpath("//ul/li[@class='Wbt_B2']/a/span"));
				
				for (int i=0;i<list.size();i++)
						{
					System.out.println(list.get(i).getText());
				}
				
				Actions act = new Actions(dr);// hovering of mouse
				act.moveToElement(list.get(0)).build().perform();
				
				//span[text()='Samsung']/../..//preceding-sibling::li/a/span[text()='Mobiles']--- from top to bottom
				//span[text()='Samsung']/parent::*/..//preceding-sibling::li/a/span[text()='Mobiles']
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Mobiles']")));		
	//dr.findElement(By.xpath("//span[text()='Mobiles']/../..//following-sibling::li/a/span[text()='Samsung'])")).click();
	
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Mobiles']/parent::*/..//following-sibling::li/a/span[text()='Samsung']")));
				dr.findElement(By.xpath("//span[text()='Mobiles']/parent::*/..//following-sibling::li/a/span[text()='Samsung']")).click();			
				
				
	String parent=dr.getWindowHandle();
	
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_2NTrR2']/div/div/div")));
	dr.findElement(By.xpath("//div[@class='_2NTrR2']/div/div/div")).click();
	
	
	Set<String> winds=dr.getWindowHandles();
	
	for (String str:winds){
		if(!str.equals(parent))
		{
		dr.switchTo().window(str);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")));
		dr.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		dr.switchTo().window(parent);
		break;
		
		
	}
	
	
	}
	
	}
}
