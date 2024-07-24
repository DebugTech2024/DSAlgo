package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.LoggerLoad;

public class Queue_pom {
	
	public WebDriver driver;
	
	
	By get_btn =By.xpath("/html/body/div[1]/div/div/a/button");
	By sign_btn = By.xpath("//a[normalize-space()='Sign in']");
	By Username=By.xpath("//input[@id='id_username']");
	By Password=By.xpath("//input[@id='id_password']");
	By log_btn =By.xpath("//input[@value='Login']" );
	
	By get=By.xpath("/html/body/div[3]/div[5]/div/div/a");
	By imp=By.xpath("//a[normalize-space()='Implementation of Queue in Python']");
	By trb=By.xpath("//a[@class='btn btn-info']");	
	By editor= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By rbtn=By.xpath("//button[@type='button']");
	By comsg=By.xpath("//*[@id=\"output\"]");
	By arpage=By.xpath("//a[normalize-space()='Implementation using array']");
	By queque=By.xpath("//a[normalize-space()='Queue Operations']");
	By pgefque=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
		
	
	
	public Queue_pom(WebDriver driver) {
		this. driver = driver;
		PageFactory.initElements( driver,this);
		LoggerLoad.info("Driver initializing");
		
	}

public void getbtn() {
	
	driver.findElement(get_btn).click();
}
public void sign() {
	driver.findElement(sign_btn).click();
}

public void usernamebtn() {
	driver.findElement( Username).sendKeys("DebugTech");
}
public void passwordbtn() {
	driver.findElement(Password).sendKeys("SDETjune24#");
}
public void log() {
	driver.findElement(log_btn).click();
}
public void getbt() throws InterruptedException {
	driver.findElement(get).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
}
public void imple() throws InterruptedException {
	driver.findElement(imp).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
}
public void trbt() {
	driver.findElement(trb).click();
}
public void editorbox() {
	driver.get("https://dsportalapp.herokuapp.com/tryEditor");
}
public void edi1(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void rbtn() {
	driver.findElement(rbtn).click();
}
public String conmsg() {
	return driver.findElement(comsg).getText();
}
public void edi2(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);;
}
public void aler() {
	Alert alert = driver.switchTo().alert(); 

		String alertmsg=driver.switchTo().alert().getText();
		LoggerLoad.info(alertmsg);

	alert.accept();
}
public void collpage() {
	driver.get("https://dsportalapp.herokuapp.com/queue/implementation-collections/");
}
public void edi3(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void edi4(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void arrapa() throws InterruptedException {
	driver.findElement(arpage).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
}
public void arrtrb() throws InterruptedException {
	driver.findElement( trb).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
}
public void edi5(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void edi6(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}

public void arraypage() {
	// TODO Auto-generated method stub
	driver.get("https://dsportalapp.herokuapp.com/queue/Implementation-array/");
}
public void que() {
	driver.findElement(queque).click();
}
public void edi7(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}

public void edi8(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}

public void pracque() {
	driver.get("https://dsportalapp.herokuapp.com/queue/QueueOp/");
	
}

public void quepage() {
	driver.findElement(pgefque).click();
	
}

}
