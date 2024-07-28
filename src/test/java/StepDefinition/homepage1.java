package StepDefinition;

import org.apache.logging.log4j.LogManager;



import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Crossbrowser.DriverFactory;
import Pages.CommonPage;
import Pages.Queue_pom;
import Pages.homepages1_pom;
import Utility.ConfigFileReader;
import Utility.LoggerLoad;
import io.cucumber.java.en.*;

@SuppressWarnings("unused")
public  class homepage1 {
	public  static WebDriver driver;
	ConfigFileReader configFileReader;
	
	
private static final Logger logger =LogManager.getLogger(homepage1.class);
private homepages1_pom hp1=new homepages1_pom(DriverFactory.getDriver());
CommonPage homepage=new CommonPage(DriverFactory.getDriver());
@SuppressWarnings("static-access")
@Given("user open browser page")
	public void user_open_browser_page() {
    configFileReader = new ConfigFileReader();
    	
    }

	@When("user enter the DS Algo Portal")
	public void user_enter_the_ds_algo_portal() {
		@SuppressWarnings("static-access")
		String browser=configFileReader.getBrowser();
		System.out.println("Browser Type is: "+configFileReader.getBrowser());
		
	}
	@When("user should landed on the DS Algo Get Started page with message {string}")
	public void user_should_landed_on_the_ds_algo_get_started_page_with_message(String string) {
		String applicationurl = configFileReader.getApplicationUrl();
		logger.info("you are the right place");
		System.out.println("you are the right place");
	   }
	@Then("user clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		hp1.getstarted();
		
	   }
 @Then("user should land in Data Structure introduction page")
	public void user_should_land_in_data_structure_introduction_page()  {
	   System.out.println("user should land in Data Structure introduction page");
	 }
    @When("user clicks Data Structure drop down arrow")
	public void user_clicks_data_structure_drop_down_arrow() throws InterruptedException {
    
		hp1.datastructurespage();
		Thread.sleep(2000);
		
	    
	}

	@Then("user should see different data structure entries in that drop down")
	public void user_should_see_different_data_structure_entries_in_that_drop_down() {
		LoggerLoad.info("user should see different data structure entries in that drop down");
		System.out.println("user should see different data structure entries in that drop down");
	    
	}

	@When("user select any data structure item from the drop down without sign in")
	public void user_select_any_data_structure_item_from_the_drop_down_without_sign_in() throws InterruptedException {
		
		hp1.dropdown();
		Thread.sleep(2000);
	    
	}

	@Then("user should able to see an warning message {string}")
	public void user_should_able_to_see_an_warning_message(String string) {
	   
	    LoggerLoad.info("warning1:you are not logged in");
	    hp1.msg();
	    
	}

	@When("user clicks any of the Get started buttons below the data structures")
	public void user_clicks_any_of_the_get_started_buttons_below_the_data_structures() throws InterruptedException {
		
		hp1.Arraybtn();
		Thread.sleep(2000);
	   
	}
	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
	  
	    LoggerLoad.info("warning2:you are not logged in");
	    hp1.msg();
	    
	}

	@When("user clicks Register")
	public void user_clicks_register() throws InterruptedException {
	    hp1.register();
		Thread.sleep(2000);
	    
	}

	@Then("user should be redirected to Register form")
	public void user_should_be_redirected_to_register_form() {
	   // driver.quit();
	}
}

	

	