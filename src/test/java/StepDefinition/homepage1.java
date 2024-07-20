package StepDefinition;

import org.apache.logging.log4j.LogManager;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Crossbrowser.DriverFactory;
import Pages.CommonPage;
import Pages.homepages1_pom;
import Utility.ConfigFileReader;
import Utility.LoggerLoad;
import io.cucumber.java.en.*;

public  class homepage1 {
	public  WebDriver driver;
	ConfigFileReader configFileReader;
	 public homepages1_pom hp1;
	
private static final Logger logger =LogManager.getLogger(homepage1.class);
CommonPage datapage=new CommonPage(DriverFactory.getDriver());
	 
    @Given("user open browser page")
	public void user_open_browser_page() {
    	driver = new ChromeDriver();
    	configFileReader = new ConfigFileReader();
    	 driver.get(configFileReader.getApplicationUrl());
    	 driver.manage().window().maximize();

    }

	@When("user enter the DS Algo Portal")
	public void user_enter_the_ds_algo_portal() {
		System.out.println("Browser Type is: "+configFileReader.getBrowser());
		// System.out.println("Application Url is: "+configFileReader.getApplicationUrl());
	}
	
	

	@When("user should landed on the DS Algo Get Started page with message {string}")
	public void user_should_landed_on_the_ds_algo_get_started_page_with_message(String string) {
		String applicationurl = configFileReader.getApplicationUrl();
		// Assert.assertEquals(applicationurl, applicationurl);
		logger.info("you are the right place");
		System.out.println("you are the right place");
	   }
	@Then("user clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		hp1=new homepages1_pom(driver);
		hp1.getstarted();
		
	    
	}
 @Then("user should land in Data Structure introduction page")
	public void user_should_land_in_data_structure_introduction_page()  {
	   System.out.println("user should land in Data Structure introduction page");
		
	 }
    @When("user clicks Data Structure drop down arrow")
	public void user_clicks_data_structure_drop_down_arrow() throws InterruptedException {
    	hp1=new homepages1_pom(driver);
		hp1.datastructurespage();
		Thread.sleep(2000);
		//System.out.println("user clicks Data Structure drop down arrow");
	    
	}

	@Then("user should see different data structure entries in that drop down")
	public void user_should_see_different_data_structure_entries_in_that_drop_down() {
		LoggerLoad.info("user should see different data structure entries in that drop down");
		System.out.println("user should see different data structure entries in that drop down");
	    
	}

	@When("user select any data structure item from the drop down without sign in")
	public void user_select_any_data_structure_item_from_the_drop_down_without_sign_in() throws InterruptedException {
		hp1=new homepages1_pom(driver);
		hp1.dropdown();
		Thread.sleep(2000);
	    
	}

	@Then("user should able to see an warning message {string}")
	public void user_should_able_to_see_an_warning_message(String string) {
	    hp1=new homepages1_pom(driver);
	    LoggerLoad.info("warning1:you are not logged in");
	    hp1.msg();
	    //System.out.println("you are not logged in");
	}

	@When("user clicks any of the Get started buttons below the data structures")
	public void user_clicks_any_of_the_get_started_buttons_below_the_data_structures() throws InterruptedException {
		hp1=new homepages1_pom(driver);
		hp1.Arraybtn();
		Thread.sleep(2000);
	   
	}
	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
	    hp1= new homepages1_pom(driver);
	    LoggerLoad.info("warning2:you are not logged in");
	    hp1.msg();
	    //System.out.println("you are not logged in");
	}

	@When("user clicks Register")
	public void user_clicks_register() throws InterruptedException {
		hp1=new homepages1_pom(driver);
		hp1.register();
		Thread.sleep(2000);
	    
	}

	@Then("user should be redirected to Register form")
	public void user_should_be_redirected_to_register_form() {
	    driver.quit();
	}
}

	

	