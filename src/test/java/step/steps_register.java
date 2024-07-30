package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CommonPage;
import pom.pom_register;
import utilities.LoggerLoad;
import webdemo.DriverFactory;

public class steps_register {
	pom_register register=new pom_register(DriverFactory.getDriver());
	CommonPage reg=new CommonPage(DriverFactory.getDriver());
	@Given("User is in registration page link")
	public void user_is_in_registration_page_link() {
	    reg.dsRegisterPage();
	}

	@When("User enter valid {string} into the textbox")
	public void user_enter_valid_into_the_textbox(String username) {
	    register.enteruser(username);
	}

	@When("User enter invalid {string} into the textbox")
	public void user_enter_invalid_into_the_textbox(String password) {
	   register.enterpwd(password);
	}

	@When("User enter invalid password confirmation {string} into the textbox")
	public void user_enter_invalid_password_confirmation_into_the_textbox(String confirmpassword) {
	   register.confirmp(confirmpassword);
	}
	@When("User enter valid {string} into the username textbox")
	public void user_enter_valid_into_the_username_textbox(String username1) {
		register.enteruser(username1);
	}
	@When("User enter valid {string} into the password textbox")
	public void user_enter_valid_into_the_password_textbox(String password1) {
		register.enterpwd(password1);
	}
	@When("User enter invalid password confirmation {string} into the confirmpassword textbox")
	public void user_enter_invalid_password_confirmation(String confirmpassword1) {
		register.confirmp(confirmpassword1);
	}

	@Then("User clicks on register button")
	public void user_clicks_on_register_button1() {
	   register.button();
	}

	@Then("The registration should be unsuccessful with error message {string}")
	public void the_registration_should_be_unsuccessful_with_error_message(String string) {
	    register.unsuccess_msg();
	}

	@Then("User clicks on RegisterButton")
	public void user_clicks_on_register_button() {
	   register.button();
	}

	@Then("The registration should be unsuccessfull with error messages with  {string}")
	public void the_registration_should_be_unsuccessfull_with_error_messages_with(String reg_msg) {
	  register.unsuccess_msg();
	  LoggerLoad.info(reg_msg);
	}



}
