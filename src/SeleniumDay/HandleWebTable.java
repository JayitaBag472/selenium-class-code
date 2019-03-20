package SeleniumDay;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	
	public static void main(String args[])
	
	{
	ChromeDriver dr = new ChromeDriver();
	
	dr.manage().window().maximize();
	
	dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	dr.get("https://www.w3schools.com/html/html_tables.asp");
	
	System.out.println(dr.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[1]")).getText());
	
	
	String rowsXpath="//*[@id='customers']/tbody/tr";
	String colsXpath="//*[@id='customers']/tbody/tr[2]/td";
	
	String element="//*[@id='customers']/tbody/tr[2]/td[1]";
	
	String part1="//*[@id='customers']/tbody/tr[";
	String part2="]/td[";
	String part3="]";
	
	System.out.println(part1+5+part2+2+part3);
	
	int rows= dr.findElements(By.xpath(rowsXpath)).size();
	int cols=dr.findElements(By.xpath(colsXpath)).size();
	
	System.out.println("Rows="+rows+" "+"Cols="+cols);
	
	for(int row =2; row<=rows; row++){
		
		for (int col=1;col<=cols;col++){
			
			String str = dr.findElement(By.xpath(part1+row+part2+col+part3)).getText();
			
			//System.out.println(row+col);
			
			}
		
		
		
		
	}
	
	}

}
