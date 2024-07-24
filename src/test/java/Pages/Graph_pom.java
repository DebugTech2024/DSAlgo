package Pages;

import java.io.IOException;


import java.time.Duration;
//import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelReader1;
import Utility.LoggerLoad;
import io.cucumber.core.logging.Logger;

@SuppressWarnings("unused")
public class Graph_pom {
	
  private WebDriver driver;
	
	
private	By get_btn =By.xpath("/html/body/div[1]/div/div/a/button");
private	By sign_btn = By.xpath("//a[normalize-space()='Sign in']");
private	By Username=By.xpath("//input[@id='id_username']");
private	By Password=By.xpath("//input[@id='id_password']");
private	By log_btn =By.xpath("//input[@value='Login']" );
	
private	By graphget_btn =By.xpath("/html/body/div[3]/div[7]/div/div/a");
private	By grapg_btn = By.xpath("//a[@class='list-group-item'][normalize-space()='Graph']");
private	By gra_drop_brn=By.xpath("//html");
private	By try_btn=By.xpath("//a[@class='btn btn-info']");
private	By codebox=By.xpath("//div[@class='input']/div/div/textarea");
private	By Run=By.xpath("//*[@id=\"answer_form\"]/button");
 private By console=By.xpath("//*[@id=\"output\"]");
 private By get=By.xpath("//a[@href='graph']");
	

private	By graphrep=By.xpath("//a[normalize-space()='Graph Representations']");
private	By trybtn=By.xpath("//a[@class='btn btn-info']");
private	By prque=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	

private	By consolemsg=By.xpath("//*[@id=\"output\"]");
	public Graph_pom( WebDriver driver) {
		this. driver = driver;
	   PageFactory.initElements( driver,this);
	 }
	public void getbtn() {
		driver.findElement(get_btn).click();
	}
	public void signinbtn() {
		driver.findElement(sign_btn).click();
	}
	public void usernamebtn() {
		driver.findElement( Username).sendKeys("DebugTech");
	}
	public void passwordbtn() {
		driver.findElement(Password).sendKeys("SDETjune24#");
	}
	 public void logbtn() throws InterruptedException {
	 driver.findElement(log_btn).click();
   }
  
    public void graphbtn() throws InterruptedException {
    	driver.findElement(get).click();
         JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	Thread.sleep(2000);
    	
   }
  // public void graph() {
    	 
    	//driver.findElement(grapg_btn).click();
    //}
	public void graphdrop() {
		
		 driver.findElement(gra_drop_brn).click();
	}
	public void trybtn() {
		driver.findElement(try_btn).click();
	}
	public void  editorbox(String validcode) {
		
     driver.findElement(codebox).sendKeys(validcode);
	
	}
	public void Run() {
	driver.findElement(Run).click();
}
	public String consomsg() {
		return driver.findElement(consolemsg).getText();
	}
	public void dstryeditor() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
   }
	
	public void editorbox1(String Invalidcode) {
		driver.findElement(codebox).sendKeys(Invalidcode);
		}
	
	public void alertpopup() {
 		Alert alert = driver.switchTo().alert(); 

 		String alertmsg=driver.switchTo().alert().getText();
 		LoggerLoad.info(alertmsg);

		alert.accept();
    }
	public void grrep() {
		driver.get("https://dsportalapp.herokuapp.com/graph/graph/");
		driver.findElement(graphrep).click();
		
	}
	public void trbtn() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/graph/graph-representations/");
	    driver.findElement(trybtn).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		}
	public void  editorbox2(String validcode1) throws InterruptedException {
		
	     driver.findElement(codebox).sendKeys(validcode1);
	     Thread.sleep(2000);
		
		}
	public void editorbox3(String Invalidcode1) {
		driver.findElement(codebox).sendKeys(Invalidcode1);
		
	}
	public String conmsg() {
		return driver.findElement(console).getText();
	}
	public void gpage() {
		driver.get("https://dsportalapp.herokuapp.com/graph/");
		
	}
	public void prques() {
		driver.get("https://dsportalapp.herokuapp.com/graph/practice");
		//driver.findElement(prque).click();
	}
	
	
}
