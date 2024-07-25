package step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CommonPage;
import pom.pom_stack;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import webdemo.DriverFactory;

public class steps_stack {
	
	private pom_stack stack=new pom_stack(DriverFactory.getDriver());
	CommonPage stackpage=new CommonPage(DriverFactory.getDriver());
	@Given("user is on dsalgo homepage")
	public void user_is_on_dsalgo_homepage() {
	   stackpage.dsHomepage();
	}

	@Given("User in signin page")
	public void user_in_signin_page() {
	    stackpage.dsSigninpage();
	}

	@Given("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   stackpage.dslogin();
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
	    stackpage.dsloginbutton();
	}

	@Given("User is on stack page")
	public void user_is_on_stack_page() {
	   
	}
	@Given("User navigate to homepage")
	public void user_navigate_to_homepage() {
	   stackpage.dsHomepage();
	}

	@When("The user clicks the Getting Started button in Stack Panel")
	public void the_user_clicks_the_getting_started_button_in_stack_panel() {
	    stack.stackgetBtn();
	}

	@Then("The user should be directed to Stack Page")
	public void the_user_should_be_directed_to_stack_page() {
	   LoggerLoad.info("User in Stack page");
	}

	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
	    stackpage.dsStackPage();
	}
	@When("The user clicks Operations in Stack button")
	public void the_user_clicks_operations_in_stack_button() {
	   stack.operationlinkpage();
	}
	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
	    stack.trybutton();
	}

	@When("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String msg) {
	   LoggerLoad.info(msg);
	}

	@When("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   LoggerLoad.info("User in Editor page gives valid data");
	}

	@When("user valid python code operation stack {string} and {int} in editor box")
	public void user_valid_python_code_operation_stack_sheet4_and_in_editor_box(String sheetname,Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String validcodeoperation = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcodeoperation + "" );

		if (sheetname != null )

			stack.EditorBox(validcodeoperation);	
	}

	@When("user click on run button in operation stack page")
	public void user_click_on_run_button_in_operation_stack_page() {
	   stack.runbtn();
	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		 LoggerLoad.info("User is able see output in console");
		   String Final_StackMsg=stack.stack_msg();
		   LoggerLoad.info(Final_StackMsg);

	}
	@Given("User is editor page in stack")
	public void user_is_editor_page_in_stack() {
	   stackpage.dstryeditor();
	}

	@When("The user writes the invalid python code operations in stack {string} and {int} into editor box")
	public void the_user_writes_the_invalid_python_code_operations_in_stack_and_into_editor_box(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_Operations = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + invalid_Operations + "" );
		if (sheetname != null )
		stack.EditorBox(invalid_Operations);
		Thread.sleep(1000);
		stack.runbtn();
	}
	@Then("The user see error msg in alert window in operations stack")
	public void the_user_error_msg(){	
		stack.alertpopup_stack(); 
	}
	@Given("The user clicks Types of Implementation link")
	public void the_user_clicks_types_of_implementation_link() {
	    stackpage.dsImplementionStackPage();
	}
	@When("The user clicks TryhereBtn again")
	public void user_clicks_tryhereBtn() {
		stack.trybutton();
	}
	@And ("The User is on the editor page enter text")
	public void user_editor_page() {
		stackpage.dstryeditor();
	}

	@When("The user writes the valid Implementation python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_implementation_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String valid_Implementation = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_Implementation + "" );

		if (sheetname != null )

			stack.EditorBox(valid_Implementation);	
		stack.runbtn();
	}

	@Then("The user is able to see the output Implementation inside the console.")
	public void the_user_is_able_to_see_the_output_implementation_inside_the_console() {
		 LoggerLoad.info("User is able see output in console");
		   String Final_StackMsg=stack.stack_msg();
		   LoggerLoad.info(Final_StackMsg);

	}
	@Given("The user is on the implemantation editor page")
	public void user_editor_pages() {
		stackpage.dstryeditor();
	}
	
@When("The user writes the invalid Implementation python code {string} and {int} into editor box")
public void the_user_writes_the_invalid_implementation_python_code_and_into_editor_box(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
	String invalid_Implementation = testdata.get(rownumber).get("pythoncode");
	LoggerLoad.info("User Enter invalid Implementation Pythoncode is \" " + invalid_Implementation + "" );
	if (sheetname != null )
	stack.EditorBox(invalid_Implementation);
}
@And ("The user clicks run btn")
public void the_user_clicks_runbtn() {
	stack.runbtn();
}

@Then("The user see error msg in alert window in Implementation")
public void the_user_see_error_msg_in_alert_window_in_implementation() {
	stack.alertpopup_stack();
}
@Given("The user clicks Types of Application link")
public void the_user_clicks_types_of_application_link() {
    stackpage.dsApplicationStackPage();
}
@When("The user clicks TryHerebtn")
public void user_trybutton() {
	stack.trybutton();
}
@And("User is on the editor pages")
public void editor_pages() {
	stackpage.dstryeditor();
}

@When("The user writes the valid Application python code {string} and {int} into editorbox")
public void the_user_writes_the_valid_application_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String valid_Application = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_Application + "" );

	if (sheetname != null )

		stack.EditorBox(valid_Application);	
}

@When("The User clicks run button again")
public void the_user_clicks_run_button_again() {
 stack.runbtn();
}

@Then("The user is able to see the output Application inside the console.")
public void the_user_is_able_to_see_the_output_application_inside_the_console() {
	 LoggerLoad.info("User is able see output in console");
	   String Final_StackMsg=stack.stack_msg();
	   LoggerLoad.info(Final_StackMsg);

    
}
@Given("The user is on the Editor Application page")
public void user_in_editorpage() {
stackpage.dstryeditor();
}

@When("The user writes the invalid application python code {string} and {int} into editor box")
public void the_user_writes_the_invalid_application_python_code_and_into_editor_box(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
	String invalid_Application = testdata.get(rownumber).get("pythoncode");
	LoggerLoad.info("User Enter invalid Application Pythoncode is \" " + invalid_Application + "" );
	if (sheetname != null )
	stack.EditorBox(invalid_Application);
}

@When("user click run btn")
public void user_click_run_btn() {
   stack.runbtn();
}

@Then("The user see error msg in alert window in Application")
public void the_user_see_error_msg_in_alert_window_in_application() {
    stack.alertpopup_stack();
}
	


}
