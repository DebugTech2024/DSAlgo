package webdemo;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public  WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	private static Logger logger=LogManager.getLogger(DriverFactory.class);
	//This method is used to initialize the threadlocal driver on the basis of given browser
	//
	public WebDriver  init_driver(String browser) 
	{
		logger.info("Initialize Browser");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else if(browser.equals("safari")) {
			tldriver.set(new SafariDriver());
		}
		else {
			logger.info("please pass the correct browservalue:" +browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return getDriver();
	}
	//this is used to get the driver with threadlocal
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
		
	}
	
	//public static void main(String[] args) {
		//System.setProperty("webdriver.chromeDriver","c:\\Webdrivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("");
		//driver.quit();
	//}


}
