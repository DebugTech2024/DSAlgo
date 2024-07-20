package Hooks;

import java.util.Properties;



import org.openqa.selenium.WebDriver;

import Crossbrowser.DriverFactory;
import Utility.ConfigFileReader;
import Utility.LoggerLoad;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Apphooks {
	@SuppressWarnings("unused")
	private static DriverFactory driverfactory;
	public WebDriver driver;
	private static ConfigFileReader configFileReader;
	static String prop;
	

	@Before
	public static void getProperty() {
		configFileReader =new ConfigFileReader();
		try {
			prop=configFileReader.getBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
	@After
	public static void after() {
		LoggerLoad.info("closingDriver");
		
			// driverfactory.closeallDriver();
		
	}

}
