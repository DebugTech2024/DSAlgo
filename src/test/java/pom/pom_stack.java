package pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LoggerLoad;

public class pom_stack {
public WebDriver driver;
public static WebDriverWait wait;

private By Stack_getStartedButton=By.xpath("//a[@href='stack']");

private By Operation_link=By.xpath("//a[normalize-space()='Operations in Stack']");

private By Implementation_link=By.xpath("//a[normalize-space()='Implementation']");

private By Application_link=By.xpath("//a[normalize-space()='Applications']");

private By TryhereButton=By.xpath("//a[@class='btn btn-info']");

private By TextEditor=By.xpath("//div[@class='input']/div/div/textarea");

private By RunButton=By.xpath("//button[@type='button']");

private By ConsoleMsg=By.xpath("//*[@id='output']");


	public pom_stack(WebDriver driver) {
		LoggerLoad.info("Driver initializing");
		this.driver=driver;
	}
	public void stackgetBtn() {
		driver.findElement(Stack_getStartedButton).click();
	}
	public void operationlinkpage() {
	driver.findElement(Operation_link).click();
}
	public void implementationpage() {
		driver.findElement(Implementation_link).click();
	}
	public void applicationpage() {
		driver.findElement(Application_link).click();
	}
	
public void  EditorBox(String pythoncode) {	
		driver.findElement(TextEditor).sendKeys(pythoncode);
		
	}
public void trybutton() {
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-info']")));
	driver.findElement(TryhereButton).click();
}
public void runbtn() {
	driver.findElement(RunButton).click();
}
public void alertpopup_stack() {
		Alert alert = driver.switchTo().alert(); 
		
		String alertmsg=driver.switchTo().alert().getText();
		LoggerLoad.info(alertmsg);
	
	alert.accept();
	
	
	}
public String stack_msg() {
	return driver.findElement(ConsoleMsg).getText();
	
}

}
