package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.LoggerLoad;

public class CommonPage {
	public WebDriver driver;
	public By dsusername=By.xpath("//*[@id=\"id_username\"]");
    public By dspassword=By.xpath("//input[@id='id_password']");
	public By dsmessage=By.xpath("//div[@role='alert']");
	public By dslogin=By.xpath("//input[@value='Login']");
	
	public By dsTryhereButton=By.xpath("//a[@class='btn btn-info']");
	public By comsg=By.xpath("//*[@id=\"output\"]");
	 public By runbtn=By.xpath("//button[@type='button']");

	public CommonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	public void dsSigninpage() {
		driver.get("https://dsportalapp.herokuapp.com/login");
	}
	public void dsHomepage() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	public void dstryeditor() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
   }
	

	public void dsTryHerebtn() {
		driver.findElement(dsTryhereButton).click();
	}
	public void dslogin() {
		driver.findElement(dsusername).sendKeys("DebugTech");
		driver.findElement(dspassword).sendKeys("SDETjune24#");
	}
	public void dsloginbutton() {
		driver.findElement(dslogin).click();
	}
	public String console() {
		return driver.findElement(comsg).getText();
	}
	public void runbtn() {
		driver.findElement(runbtn).click();
	}
	public void aler() {
		Alert alert = driver.switchTo().alert(); 

			String alertmsg=driver.switchTo().alert().getText();
			LoggerLoad.info(alertmsg);

		alert.accept();
	}
//Tree	
public void treepage() {
	driver.get("https://dsportalapp.herokuapp.com/tree/");
}



}
