package Hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
		
		//String urlName=prop.getProperty("url");
		//configReader=new ConfigReader();
		//urlName=configReader.init_url(urlName);
	}
	//@Before(order=2)
	//public void login() {
		//driver.get(prop.getProperty("username"));
		//driver.get(prop.getProperty("password"));
	//}
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}

}
