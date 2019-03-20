package SeleniumDay;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotCapture {
	
	public String capturescreenshot(WebDriver dr,String name){
		TakesScreenshot src = ((TakesScreenshot)dr);
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		String path = config_file.screenshot+name+".jpg";
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);
		
		
		return path;
		
	}

}
