package step;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CommonPage;
import pom.Pomsignin;
import pom.pom_datastructure;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import webdemo.DriverFactory;

public class steps_datastructure {
	public static WebDriver driver;
	//public static WebDriverWait wait;
	
	//private static final String driver = null;
	//private Pomsignin loginpage=new Pomsignin(DriverFactory.getDriver());
	private pom_datastructure datastructure=new pom_datastructure(DriverFactory.getDriver());
	CommonPage datapage=new CommonPage(DriverFactory.getDriver());
	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
	   datapage.dsHomepage();
	}

	@Given("the user goes to signin page")
	public void the_user_goes_to_signin_page() {
	  
		datapage.dsSigninpage();
	}

	@Given("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
	  
		datapage.dslogin();
		
	}

	@Given("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	  
		datapage.dsloginbutton();
	}

	@Given("the user goes to Data structure page")
	public void the_user_goes_to_data_structure_page() {
	    
	}
	@Given("The user navigates to home page")
	public void the_user_navigates_to_home_page() {
		datapage.dsHomepage();
	   
	}

	@When("The user clicks  Get Started button")
	public void the_user_clicks_get_started_button() {
	    datastructure.databtn();
	}

	@Then("The user should land in Data Structure Introduction Page")
	public void the_user_should_land_in_data_structure_introduction_page() throws InterruptedException {
	   datastructure.getlandpage();
	   Thread.sleep(1000);
	}
	@Given("The user is on the Time Complexity Page")
	public void the_user_is_on_the_time_complexity_page_and_click_get_button() throws InterruptedException {
		
		datapage.DataTimeComplexityPage();
		datastructure.timecomplexitypage();//a[@class='list-group-item']
		//datastructure.databtn();
	    Thread.sleep(2000);
	}

	

	@When("The user clicks Try Here  button of Time Complexity page")
	public void the_user_clicks_try_here_button_of_time_complexity_page() throws InterruptedException,IllegalArgumentException {
		
		datastructure.trybutton();
	   Thread.sleep(2000);
	}

	@Then("The user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String link) {
	  LoggerLoad.info("user land on python editor"+link);
	}

	@When("The user clicks the Run Button without entring the code in the Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() throws InterruptedException {
	    datastructure.runbutton();
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
	    LoggerLoad.info("No Error message");
	}

	@Given("The user is on the Python Editor page")
	public void the_user_is_on_the_python_editor_page() {
		 datastructure.getlandpage();
		 datapage.dstryeditor();
	
	}

	@When("The user write the invalid python code from excel sheet {string} and {int}")
	public void the_user_write_the_invalid_python_code_from_excel_sheet_and(String sheetname,int rownumber) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalidcode = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter invalid Pythoncode is \" " + invalidcode + "" );

			datastructure.filleditorbox(invalidcode);
			Thread.sleep(1000);
	}


	@When("the user click the run button")
	public void the_user_click_the_run_button() throws InterruptedException {
	   datastructure.runbutton();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	   datastructure.alertpopup();
	}

	@Given("the user is python editor page")
	public void the_user_is_python_editor_page() {
		 datastructure.getlandpage();
			
		 datapage.dstryeditor();
	}

	
	@When("the user write valid code datastructure {string} and {int}")
	public void the_user_write_valid_code_datastructure_print_hello_datastructure1(String sheetname,int rownumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		//DSAlgo/src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx
		String validcode = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode + "" );

		if (sheetname != null )

			datastructure.filleditorbox(validcode);
		
	}

	@When("user click run button")
	public void user_click_run_button() throws InterruptedException {
	   datastructure.runbutton();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    LoggerLoad.info("User should be able to see console Message");
		String finalmsg=datastructure.datastructure_msg();
		LoggerLoad.info(finalmsg);
		
	}


}
