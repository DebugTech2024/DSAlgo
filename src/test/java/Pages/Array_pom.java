package Pages;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.LoggerLoad;

@SuppressWarnings("unused")
public class Array_pom {
public	WebDriver driver;
	
	By get_btn =By.xpath("/html/body/div[1]/div/div/a/button");
	By sign_btn = By.xpath("//a[normalize-space()='Sign in']");
	By Username=By.xpath("//input[@id='id_username']");
	By Password=By.xpath("//input[@id='id_password']");
	By log_btn =By.xpath("//input[@value='Login']" );
	
	By arryst_btn=By.xpath("/html/body/div[3]/div[2]/div/div/a");
	By arraysinpython=By.xpath("//a[normalize-space()='Arrays in Python']");
	By try_btn=By.xpath("/html/body/div[2]/div/div[2]/a");
	By editor= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By run_btn=By.xpath("//button[@type='button']");
	By conmsge=By.xpath("//*[@id=\"output\"]");
	By arraylist=By.xpath("//a[normalize-space()='Arrays Using List']");
	
	By basic=By.xpath("//a[normalize-space()='Basic Operations in Lists']");
	By searchpa=By.xpath("//a[normalize-space()='Search the array']");
	By hidebx=By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By prb=By.xpath("//*[@id=\"answer_form\"]/button");
	By sub= By.xpath(" //input[@value='Submit']");
	By out=By.xpath("//*[@id=\"output\"]");
	By maxc=By.xpath("//a[normalize-space()='Max Consecutive Ones']");
	By find=By.xpath("//a[normalize-space()='Find Numbers with Even Number of Digits']");
	By square=By.xpath("//a[contains(text(),'Squares of')]");

	public Array_pom(WebDriver driver) {
		this. driver = driver;
		PageFactory.initElements( driver,this);
		LoggerLoad.info("Driver initializing");
		
	}
	public void get() {
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
		
    public void arraybtn() {
		driver.findElement(arryst_btn).click();
	}
	public void arrayinphy() {
		driver.findElement(arraysinpython).click();
		}
	public void trybtn() throws InterruptedException {
		driver.findElement(try_btn).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	Thread.sleep(2000);
	}
	public void editorbox(String Invalidcode) {
		driver.findElement(editor).sendKeys(Invalidcode);
	}
	public void rbtn() {
		driver.findElement(run_btn).click();
	}
	public void aler() {
	
		Alert alert = driver.switchTo().alert(); 

 		String alertmsg=driver.switchTo().alert().getText();
 		LoggerLoad.info(alertmsg);

		alert.accept();
	}
	public void trypage() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}
	public void editbox(String Invalidcode) {
		driver.findElement(editor).sendKeys(Invalidcode);
	}
	
	public String cmsg() {
		return driver.findElement(conmsge).getText();
		
	}
	public void arrpage() {
		driver.get("https://dsportalapp.herokuapp.com/array/arrays-using-list/");
	}
	public void arraylink() {
		driver.findElement(arraylist).click();
		
	}
	public void valid(String Invalidcode) {
		driver.findElement(editor).sendKeys(Invalidcode);
	}
	public void val(String validcode) {
		driver.findElement(editor).sendKeys(validcode);
	}
	public void basiclist() {
		driver.findElement(basic).click();
	}
	public void basicpython(String Invalidcode) {
		driver.findElement(editor).sendKeys(Invalidcode);
	}
	
	public void basvalid(String validcode) {
		driver.findElement(editor).sendKeys(validcode);
	}
	public void applipage() {
		driver.get("https://dsportalapp.herokuapp.com/array/applications-of-array/");
	}
	public void applyv(String Invalidcode) {
		driver.findElement(editor).sendKeys(Invalidcode);
	}
	public void applyinv(String validcode) {
		driver.findElement(editor).sendKeys(validcode);
	}
	public void pracpage() {
		driver.get("https://dsportalapp.herokuapp.com/array/practice");
	}
	public void search() {
		driver.findElement(searchpa).click();
	}
	
	public void edibox1(String Invalidcode) {
		driver.findElement(hidebx).sendKeys(Invalidcode);
	}
	public void edibox2(String validcode) {
		driver.findElement(hidebx).sendKeys(validcode);
	}
	public void prun() {
		driver.findElement(prb).click();
	}
	public void submit() {
		driver.findElement(sub).click();
	}
	public String con() {
	return	driver.findElement(out).getText();
		
	}
	public void tr() {
		driver.get("https://dsportalapp.herokuapp.com/question/1");
	}
	public void cle() {
	WebElement clea=driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea"));
	    Actions actions = new Actions(driver);
	    actions.click(clea);
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE);
	    actions.perform();
	}
public void max() {
		driver.findElement(maxc).click();
	}
public void maxqu() {
	driver.get("https://dsportalapp.herokuapp.com/question/2");
}
	public void edibox3(String Invalidcode) {
		driver.findElement(hidebx).sendKeys(Invalidcode);
	}
	public void edibox4(String validcode) {
		driver.findElement(hidebx).sendKeys(validcode);
	}
	public void findnum() {
		driver.findElement(find).click();
		}
	public void findque() {
		driver.get("https://dsportalapp.herokuapp.com/question/3");
	}
	public void edibox5(String Invalidcode) {
		driver.findElement(hidebx).sendKeys(Invalidcode);
	}
	public void edibox6(String validcode) {
		driver.findElement(hidebx).sendKeys(validcode);
	}
	public String outp() {
		return driver.findElement(out).getText();
	}
	public void squarepg() {
	
		driver.findElement(square).click();
	}
	public void squque() {
		driver.get("https://dsportalapp.herokuapp.com/question/4");
	}
	public void edibox7(String Invalidcode) {
		driver.findElement(hidebx).sendKeys(Invalidcode);
	}
	public void edibox8(String validcode) {
		driver.findElement(hidebx).sendKeys(validcode);
	}
	
}
