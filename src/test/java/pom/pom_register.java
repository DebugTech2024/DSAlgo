package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.LoggerLoad;

public class pom_register {
	
	public WebDriver driver;
	private By user=By.xpath("//input[@id='id_username']");
	private By pwds=By.xpath("//input[@id='id_password1']");
	private By confirmpwd=By.xpath("//input[@id='id_password2']");
	private By regbtn=By.xpath("//input[@value='Register']");
	private By unsuccessmsg=By.xpath("//div[@role='alert']");
	
	public pom_register(WebDriver driver) {
		LoggerLoad.info("Driver initializing");
		this.driver=driver;
	}
	
	
	public void enteruser(String username) {
		driver.findElement(user).sendKeys(username);
		}
	public void enterpwd(String password) {
		driver.findElement(pwds).sendKeys(password);
	}
	public void confirmp(String confirmpassword) {
		driver.findElement(confirmpwd).sendKeys(confirmpassword);
	}
	public void button() {
		driver.findElement(regbtn).click();
	}
	public String unsuccess_msg() {
        return driver.findElement(unsuccessmsg).getText();
		
	}

}
