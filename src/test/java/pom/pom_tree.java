package pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.LoggerLoad;

public class pom_tree {
	public WebDriver driver;
	public static WebDriverWait wait;
	
	private By tree_getBtn=By.xpath("//a[@href='tree']");
	
	private By overview_link=By.xpath("//a[normalize-space()='Overview of Trees']");
	
	private By terminologies_link=By.xpath("//a[normalize-space()='Terminologies']");
	//*[@id="content"]/li[2]/a
	//a[normalize-space()='Terminologies']
	
	private By typesoftree_link=By.xpath("//a[normalize-space()='Types of Trees']");
	
	private By tree_traversal_link=By.xpath("//a[normalize-space()='Tree Traversals']");
	
	private By travel_illustionLink=By.xpath("//a[normalize-space()='Traversals-Illustration']");
	
	private By binary_link=By.xpath("//a[normalize-space()='Binary Trees']");
	
	//private By typesofbinarytree_link=By.xpath("//a[normalize-space()='Types of Binary Trees']");
	
	private By TryButton=By.xpath("//a[@class='btn btn-info']");

	private By Tree_TextEditor=By.xpath("//div[@class='input']/div/div/textarea");

	private By RunBtn=By.xpath("//button[@type='button']");

	private By ConsoleMessage=By.xpath("//*[@id='output']");
	
	
	public pom_tree(WebDriver driver) {
		this.driver=driver;
	}
	
	public void treeGetBtn() {
		driver.findElement(tree_getBtn).click();
	}
	public void overviewTreePage() {
		driver.findElement(overview_link).click();
	}
	
	public void terminiologiesPage() {
		driver.findElement(terminologies_link).click();
	}
	public void TypeofTreePage() {
		driver.findElement(typesoftree_link).click();
	}
	public void TreeTraversalPage() {
		driver.findElement(tree_traversal_link).click();
	}
	public void TravelIllustionPage() {
		driver.findElement(travel_illustionLink).click();
	}
	public void BinaryPage() {
		driver.findElement(binary_link).click();
	}
	public void TreeEditorBox(String pythoncode) {
		driver.findElement(Tree_TextEditor).sendKeys(pythoncode);
	}
	public void Trybtn() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-info']")));
		 driver.findElement(TryButton).click();
	}
	public void runButton() {
		driver.findElement(RunBtn).click();
	}
	public void alertpopup_tree() {
Alert alert = driver.switchTo().alert(); 
		
		String alertmsg=driver.switchTo().alert().getText();
		LoggerLoad.info(alertmsg);
	
	alert.accept();
	}
	public String tree_msg() {
		return driver.findElement(ConsoleMessage).getText();
	}
	public void scrollPage_Tree() {
		  driver.findElement(TryButton).click();
		  JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
	  }

}

