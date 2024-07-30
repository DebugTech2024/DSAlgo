package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Utility.LoggerLoad;

public class Tree2_pom {
	
	public static WebDriver driver;
	
	By trget=By.xpath("//a[@href='tree']");
	By editor= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By runbtn=By.xpath("//button[@type='button']");
	By trher=By.xpath("//a[@class='btn btn-info']");
	By imptr=By.xpath("//a[normalize-space()='Implementation in Python']");
	By trtrav=By.xpath("//a[normalize-space()='Binary Tree Traversals']");
	By implbin=By.xpath("//a[normalize-space()='Implementation of Binary Trees']");
	By appli=By.xpath("//a[normalize-space()='Applications of Binary trees']");
	By binse=By.xpath("//a[normalize-space()='Binary Search Trees']");
	By bst=By.xpath("//a[normalize-space()='Implementation Of BST']");
	By trqu=By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	
	public Tree2_pom(WebDriver driver) {
		this. driver = driver;
		PageFactory.initElements( driver,this);
		LoggerLoad.info("Driver initializing");
		
	}

public void treeget() throws InterruptedException {
	driver.findElement(trget).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
}
public void imtrpy() {
	driver.findElement(imptr).click();
}
public void trytree() throws InterruptedException {
	driver.findElement(trher).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	
}
public void tred1(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void trrun() throws InterruptedException {
	driver.findElement(runbtn).click();
	
}
public void tred2(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void treetra() {
	driver.findElement(trtrav).click();
}
public void tred3(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void tred4(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void implbina() {
	driver.findElement(implbin).click();
}
public void tred5(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void tred6(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void appofbin() {
	driver.findElement(appli).click();
}
public void tred7(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void tred8(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void binsearch() {
	driver.findElement(binse).click();
}
public void tred9(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void tred10(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void bstogpa() {
	driver.findElement(bst).click();
}
public void tred11(String validcode) {
	driver.findElement(editor).sendKeys(validcode);
}
public void tred12(String Invalidcode) {
	driver.findElement(editor).sendKeys(Invalidcode);
}
public void treequ() {
	driver.get("https://dsportalapp.herokuapp.com/tree/implementation-of-bst/");
}
public void trquep() throws InterruptedException {
	driver.get("https://dsportalapp.herokuapp.com/tree/practice");
/*	driver.findElement(trqu).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);*/
}

}
