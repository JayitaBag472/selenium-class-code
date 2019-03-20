package SeleniumDay;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profiles {

	public static void main(String args[]){
		
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile profile = p.getProfile("MyPro");
		
		FirefoxOptions op= new FirefoxOptions();// for deleting automatic message in screen
		op.setProfile(profile);
		
		FirefoxDriver dr = new FirefoxDriver(op);
		
		
		
	}
}
