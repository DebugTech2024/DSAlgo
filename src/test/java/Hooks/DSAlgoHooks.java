package Hooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import webdemo.DriverFactory;

public class DSAlgoHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() throws IOException,NullPointerException
	{
		configReader=new ConfigReader();
		prop=configReader.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser() throws IOException,NullPointerException{
		String browserName=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("username"));
		//driver.get(prop.getProperty("password"));
	}
	@Before(order=2)
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String scenarioName=scenario.getName().replaceAll("", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenShot = ts.getScreenshotAs(OutputType.FILE);
			String destinationPath=System.getProperty("user.dir")+"\\screenshots\\"+scenarioName+".png";
			FileUtils.copyFile(screenShot, new File(destinationPath));
		}
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}

}
