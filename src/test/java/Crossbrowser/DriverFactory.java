package Crossbrowser;

import java.time.Duration;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver>tldriver=new ThreadLocal<>();
	private static Logger logger=LogManager.getLogger(DriverFactory.class);
	
	public WebDriver init_driver(String browser) {
		logger.info("browser value is");
		if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else if(browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			tldriver.set(new SafariDriver());
		}
		else {
			logger.info("please pass the correct browservalue:"+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return getDriver();
		
	}

	public static synchronized WebDriver getDriver() {
		// TODO Auto-generated method stub
		return tldriver.get();
	}

	public void closeallDriver() {
		// TODO Auto-generated method stub
		driver.close();
	}


	

	
}
