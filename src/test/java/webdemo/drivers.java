package webdemo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class drivers {
	public static void main(String[] args) {
			System.setProperty("webdriver.chromeDriver","c:\\Webdrivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("");
			driver.quit();
		}


}
