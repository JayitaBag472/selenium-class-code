package SeleniumDay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.gson.JsonObject;


public class WeatherGet {
	
	public static void main(){
	
	WebDriver dr = new ChromeDriver();
	 
 dr.manage().window().maximize();
 
 dr.get("http://api.zippopotam.us/us/90210");
 dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 


WebElement element = dr.findElement(By.xpath("//pre"));
JSONObject jsonObject = new JSONObject(element.getText());


String valueToCheck = jsonObject.get("country").toString();
Assert.assertEquals(valueToCheck, "United States");




}
}
