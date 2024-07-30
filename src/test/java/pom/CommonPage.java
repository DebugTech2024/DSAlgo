package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {
	public WebDriver driver;
	public By dsusername=By.xpath("//*[@id=\"id_username\"]");
    public By dspassword=By.xpath("//input[@id='id_password']");
	public By dsmessage=By.xpath("//div[@role='alert']");
	public By dslogin=By.xpath("//input[@value='Login']");
	public By dsDataStructure_getButton=By.xpath("//a[@href='data-structures-introduction']");
	public By dsLinkedlist_getButton=By.xpath("//a[@href='linked-list']");
	public By dsTryhereButton=By.xpath("//a[@class='btn btn-info']");
	public By dsStack_getButton=By.xpath("//a[@href='stack']");
	
	public CommonPage(WebDriver driver) {
		this.driver=driver;
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
	public void dsDataStructurepage() {
		driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}
	public void dsLinkedlistpage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");
	}
	public void dsDataGetButton() {
		driver.findElement(dsDataStructure_getButton).click();
	}
	public void dsLinkedGetButton() {
		driver.findElement(dsLinkedlist_getButton).click();
	}
	public void DataTimeComplexityPage() {
		driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}
	public void dsCreatingLinkedlistPage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
	}
	public void dsTypesofLinkedlistPage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
	}
	public void dsImplementLinkedListPage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
	}
	public void dsTraversalLinkedListPage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/traversal/");
	}
	
	public void dsInsertionLinkedListPage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
	}
	public void dsDeletionLinkedListPage() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
	}
	public void dsTryHerebtn() {
		driver.findElement(dsTryhereButton).click();
	}
	public void dsStackGetButton() {
		driver.findElement(dsStack_getButton).click();
	}
	public void dsStackPage() {
		driver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	}
	public void dsOperationinStackPage() {
		driver.get("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
	}
	public void dsImplementionStackPage() {
		driver.get("https://dsportalapp.herokuapp.com/stack/implementation/");
	}
	public void dsApplicationStackPage() {
		driver.get("https://dsportalapp.herokuapp.com/stack/stack-applications/");
	}
	public void dsRegisterPage() {
		driver.get("https://dsportalapp.herokuapp.com/register");
	}
	public void dsTreePage() {
		driver.get("https://dsportalapp.herokuapp.com/tree/");
	}
	public void dslogin() {
		driver.findElement(dsusername).sendKeys("DebugTech");
		driver.findElement(dspassword).sendKeys("SDETjune24#");
	}
	public void dsloginbutton() {
		driver.findElement(dslogin).click();
	}
	
}