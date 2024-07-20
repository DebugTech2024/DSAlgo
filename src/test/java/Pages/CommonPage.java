package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	public WebDriver driver;
	public By dsusername=By.xpath("//*[@id=\"id_username\"]");
    public By dspassword=By.xpath("//input[@id='id_password']");
	public By dsmessage=By.xpath("//div[@role='alert']");
	public By dslogin=By.xpath("//input[@value='Login']");
	//public By dsHomepage=By.xpath("//*[@id=\"eppiocemhmnlbhjplcgkofciiegomcon\"]");
	//public By dsDataStructure_getButton=By.xpath("//a[@href='data-structures-introduction']");
	//public By dsLinkedlist_getButton=By.xpath("//a[@href='linked-list']");
	public By dsTryhereButton=By.xpath("//a[@class='btn btn-info']");
	

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
//public void grhomepage() {
	//driver.get("https://dsportalapp.herokuapp.com/graph/graph/");
//}



}
