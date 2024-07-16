package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Pomsignin {
	private WebDriver driver;
	private By user=By.xpath("//*[@id=\"id_username\"]");
    private By pwd=By.xpath("//input[@id='id_password']");
	private By message=By.xpath("//div[@role='alert']");
	private By loginbtn=By.xpath("//input[@value='Login']");
	//private By invalid=By.xpath("//div[@role='alert']");
	public Pomsignin(WebDriver driver) {
		System.out.println("Driver is Initializing");
		this.driver=driver;
	}
	public void signin() {
		driver.get("https://dsportalapp.herokuapp.com/login");
		
	}
	public Boolean doLogin(String username, String password) {

                             driver.findElement(user).clear();
                             
                             driver.findElement(user).sendKeys(username);
                             
                             driver.findElement(pwd).clear();
                             
                             driver.findElement(pwd).sendKeys(password);

		    Boolean isRequired = null;
		         if (username.isBlank()) {

			   JavascriptExecutor js_user = (JavascriptExecutor) driver;

			   isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", user);

			return isRequired;

		} else if (password.isBlank()) {

			JavascriptExecutor js_password = (JavascriptExecutor) driver;

			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", pwd);

			return isRequired;
		}

		return isRequired;
	}
	public String  loginbutton() {
		
		driver.findElement(loginbtn).click();
		return driver.findElement(message).getText();
		
	}
}
