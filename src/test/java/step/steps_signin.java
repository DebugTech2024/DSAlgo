package step;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Pomsignin;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import webdemo.DriverFactory;

public class steps_signin {
	private Pomsignin sign=new Pomsignin(DriverFactory.getDriver());
	public String message;
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		LoggerLoad.info("User is on signin Page");

		sign.signin();
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();


		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String username = testdata.get(rownumber).get("username");
		String password = testdata.get(rownumber).get("password");
		String message = testdata.get(rownumber).get("expectedmessage");
		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

		if (sheetname != null || password != null)

			sign.doLogin(username, password);
	    
	}

	
	@Then("click login button")
	public void click_login_button() {
		LoggerLoad.info("User clicks on login button");
		//LoggerLoad.info("Expected Message - Excel Sheet : ");

       String msg=sign.loginbutton();

		LoggerLoad.info("Actual Message :  " + msg);

		//assertEquals(msg, message);
	}

	@Then("user land in data structure page")
	public void user_land_in_data_structure_page() {
	   LoggerLoad.info("User land in DataStructure Page");
	}



}
