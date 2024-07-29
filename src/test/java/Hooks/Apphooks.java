package Hooks;

import java.io.File;


import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Crossbrowser.DriverFactory;
import Utility.ConfigFileReader;
import Utility.LoggerLoad;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

@SuppressWarnings("unused")
public  class Apphooks {
	@SuppressWarnings("unused")
	private static DriverFactory driverfactory;
	public static WebDriver driver;
	private static ConfigFileReader configFileReader;
	static Properties prop;
	

	
	@Before(order=0)
	public static void getProperty() {
		configFileReader =new ConfigFileReader();
		prop=ConfigFileReader.init_prop();
			
		
	}
	  @Before(order=1)
		public static void launchbrowser() {
		   String browserName=prop.getProperty("browser");
			driverfactory=new DriverFactory();
			driver=DriverFactory.init_driver(browserName);
		
			driver=DriverFactory.getDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url.base"));
			
		}
		
	
	@Before(order=2)
	public static void tearDown(Scenario scenario) throws IOException {
		/*if (scenario.isFailed()) {
			String scenarioName=scenario.getName().replaceAll("", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenShot = ts.getScreenshotAs(OutputType.FILE);
			String destinationPath=System.getProperty("user.dir")+"\\screenshots\\"+scenarioName+".png";
			FileUtils.copyFile(screenShot, new File(destinationPath));
		}*/
	}
	@After(order=0)
	public void quitbrowser() {		
	driver.quit();
	}

}
