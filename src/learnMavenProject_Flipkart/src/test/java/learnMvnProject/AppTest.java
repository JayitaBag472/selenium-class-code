package learnMvnProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       System.out.println("Jayita");
       
       WebDriver dr = new ChromeDriver();
       dr.get("https://www.google.com/");
       dr.manage().window().maximize();
       
       dr.findElement(By.name("q")).sendKeys("Jayita");
       
       
       
    }
}
