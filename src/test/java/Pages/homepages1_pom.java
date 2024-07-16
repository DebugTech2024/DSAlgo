package Pages;



import org.openqa.selenium.By;

import Utility.LoggerLoad;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;




@SuppressWarnings("restriction")
public class homepages1_pom {
	private  WebDriver driver ;
	
    
    By  getstarted_btn =By.xpath("/html/body/div[1]/div/div/a/button");
	By  datastructures_btn =By.xpath("//a[normalize-space()='Data Structures']");
	By  dropdown_btn = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]");
	By  warning_msg = By.xpath("//div[@role='alert']");
	By  Array_btn =By.xpath("/html/body/div[3]/div[2]/div/div/a");
	By  Register_btn = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
	
	public homepages1_pom( WebDriver driver) {
		this. driver = driver;
		PageFactory.initElements( driver,this);
	}
	
	
	
	public void getstarted () {
		driver.findElement(getstarted_btn).click();
		
	}
	
	public void datastructurespage() {
		driver.findElement(datastructures_btn).click();
		
	}
	public void dropdown() {
		driver.findElement(dropdown_btn).click();
		
	}
	 public void warning1() {
		 driver.findElement(warning_msg).getText();
		
	 }
	 public void Arraybtn () {
		 driver.findElement(Array_btn).click();
		
    }
	 public void warning2() {
		 driver.findElement(warning_msg).getText();
		
	 }
	 public void register () {
		 driver.findElement(Register_btn).click();
		 
	 }
	
}
	
		
	


