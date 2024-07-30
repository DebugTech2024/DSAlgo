package pom;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.LoggerLoad;

public class pom_linkedlist {
	public WebDriver driver;
	 Properties prop;
		ConfigReader configreader=new ConfigReader(); 
		//div[@role='alert']
	
	private By Linkedlist_getButton=By.xpath("//a[@href='linked-list']");
	
	private By message=By.xpath("//div[@role='alert']");
	
	private By Introduction_link=By.xpath("/html/body/div[2]/ul[1]/a");
	
	private By tryButton=By.xpath("//a[@class='btn btn-info']");
	
	private By textEditor=By.xpath("//div[@class='input']/div/div/textarea");
	
	private By runButton=By.xpath("//button[@type='button']");
	
	private By linkedlistMsg=By.xpath("//*[@id='output']");
	
	
	public pom_linkedlist(WebDriver driver) {
		this.driver=driver;
	}
	
	public void linkedlistBtn() {
		driver.navigate().refresh();
		driver.findElement(Linkedlist_getButton).click();
	
	}
	public String loginmsg() {
		return driver.findElement(message).getText();
	}
	
	public void introductionLink() {
		driver.findElement(Introduction_link).click();
	}
	
	public void tryHere() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-info']")));
		driver.findElement(tryButton).click();
	}
	public void editorBox(String pythoncode) {
		driver.findElement(textEditor).sendKeys(pythoncode);
	}
	
	public void runBtn() {
		driver.findElement(runButton).click();
	}
  public void scrollPage() {
	  driver.findElement(tryButton).click();
	  JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
  }
  public String successmsg() {
	 return driver.findElement(linkedlistMsg).getText();
  }
  public void alertpopup_linkedlist() {
		Alert alert = driver.switchTo().alert(); 
		String alertmsg=driver.switchTo().alert().getText();
		LoggerLoad.info(alertmsg);
		alert.accept();
  }
	
}
