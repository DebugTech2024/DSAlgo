package pom;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LoggerLoad;

public class pom_datastructure {
	@SuppressWarnings("unused")
	public WebDriver driver;
	public static WebDriverWait wait;
	private By datagetbtn=By.xpath("//a[@href='data-structures-introduction']");//data structure get button
	private By timelink=By.xpath("//a[normalize-space()='Time Complexity']");
	private By practicequeslink=By.xpath(" //a[@class='list-group-item list-group-item-light text-info']");
	private By trybtn=By.xpath("//a[@class='btn btn-info']");
	private By writeeditor=By.xpath("//div[@class='input']/div/div/textarea");
	private By runbtn=By.xpath("//button[@type='button']");
	private By msg=By.xpath("//p[normalize-space()='Time Complexity']");
	private By consolemsg=By.xpath("//*[@id=\"output\"]");
	
	
	public pom_datastructure(WebDriver driver) {
		LoggerLoad.info("Driver initializing");
		this.driver=driver;
	}
	
	public void databtn() {
		driver.findElement(datagetbtn).click();
	}
	public String getlandpage() {
		return driver.getTitle();
	}
	public String gettimepage() {
		return driver.findElement(msg).getText();
	}
	public void timecomplexitypage() {
		driver.findElement(timelink).click();
	}
	public void practicepage() {
		driver.findElement(practicequeslink).click();
	}
	public void trybutton() {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-info']")));
		driver.findElement(trybtn).click();
	}
	
	
	//@SuppressWarnings("null")
	public void  filleditorbox(String pythoncode) {
		
		driver.findElement(writeeditor).sendKeys(pythoncode);
		
	}
	public void runbutton() throws InterruptedException {
		driver.findElement(runbtn).click();
		Thread.sleep(1000);
	}
	public String errormsg() {
		return driver.findElement(msg).getText();
	}
	public void fillvalideditor(String valid) {
		driver.findElement(writeeditor).sendKeys(valid);
	}
	public void alertpopup() {
 		Alert alert = driver.switchTo().alert(); 
 		
 		String alertmsg=driver.switchTo().alert().getText();
 		LoggerLoad.info(alertmsg);
 	
		alert.accept();
		
		
 	}
	public String datastructure_msg() {
		return driver.findElement(consolemsg).getText();
		
	}
	
}
