package step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CommonPage;
import pom.pom_linkedlist;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import webdemo.DriverFactory;

public class steps_linkedlist {
	pom_linkedlist list=new pom_linkedlist(DriverFactory.getDriver());
	CommonPage dsalgopage=new CommonPage(DriverFactory.getDriver());
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	   //list.homepage();
		dsalgopage.dsHomepage();
	}

	@Given("user goes to signin page")
	public void user_goes_to_signin_page() {
	  
	  dsalgopage.dsSigninpage();
	}

	@Given("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	
		dsalgopage.dslogin();
	}
	
	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
		
	   dsalgopage.dsloginbutton();
	}

   @Given("User is on linked list page")
     public void user_is_on_linked_list_page() {
     // list.linkedlistpage();
	   dsalgopage.dsLinkedlistpage();
     }
	@Given("The user comes back to the DS_algo home page to select DS Linked List.")
	public void the_user_comes_back_to_the_ds_algo_home_page_to_select_ds_linked_list() {
		//list.homepage();
	  dsalgopage.dsHomepage();
	}

	@When("The user select Linked List from the Data Structure dropdown menu or clicks the Get Started button in Linked List Panel")
	public void the_user_select_linked_list_from_the_data_structure_dropdown_menu_or_clicks_the_get_started_button_in_linked_list_panel() throws InterruptedException {
	    list.linkedlistBtn();
	    Thread.sleep(1000);
	}

	@Then("The user should be redirected to {string} page.")
	public void the_user_should_be_redirected_to_page(String string) {
		LoggerLoad.info("User should be redirected page is "+string);
	   
	}

	@Given("The user is on the Linked List page")
	public void the_user_is_on_the_linked_list_page() {
	   // list.linkedlistpage();
		dsalgopage.dsLinkedlistpage();

	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
	   list.introductionLink();
	}

	@Then("The user should be redirected to Introduction page.")
	public void the_user_should_be_redirected_to_introduction_page() {
	   LoggerLoad.info("User should be redirected to Introduction Page");
	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	   LoggerLoad.info("User is on" +string +"page");
	   list.introductionLink();
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	   LoggerLoad.info("User cicks "+string+"button");
	   list.tryHere();
	}

	@When("The user is on the editor page")
	public void the_user_is_on_the_editor_page() {
	   LoggerLoad.info("User is on Editor page");
	   dsalgopage.dstryeditor();
	}

	@When("The user writes the valid python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_python_code_and_into_editorbox(String sheetname, int rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx",sheetname);
		String validcode = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter valid Linkedlist Pythoncode is \" " + validcode + "" );
		if (sheetname != null )
		list.editorBox(validcode);
		Thread.sleep(1000);
		
	}

	@When("the user click on run button")
	public void the_user_click_on_run_button() {
	   list.runBtn();
	}

	@Then("The user is able to see the output inside the console.")
	public void the_user_is_able_to_see_the_output_inside_the_console() {
		 LoggerLoad.info("User should be able to see console Message");
			String finalmsg=list.successmsg();
			LoggerLoad.info(finalmsg);
	  
	}

	@Given("The user is on the editor page again")
	public void the_user_is_on_the_editor_page_again() throws InterruptedException {
		
		dsalgopage.dstryeditor();
	  Thread.sleep(1000);
	}

	@When("The user writes the invalid python code {string} and {int} into editorbox")
	public void the_user_writes_the_invalid_python_code_and_into_editorbox(String sheetname, int rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalidlinkedlist = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + invalidlinkedlist + "" );
		if (sheetname != null )
		list.editorBox(invalidlinkedlist);
		Thread.sleep(1000);
	}

	@When("User click run button")
	public void user_click_run_button() {
	   list.runBtn();
	}

	@Then("The user see error msg in alert window")
	public void the_user_see_error_msg_in_alert_window() {
	    list.alertpopup_linkedlist();
	}
	//User in Creating LinkedList Page
	@Given("The user is on the Creating Linked LIst page")
	public void the_user_is_on_the_creating_linked_l_ist_page() {
	    dsalgopage.dsCreatingLinkedlistPage();
	}

	@When("The user clicks TryHere button")
	public void the_user_clicks_try_here_button() {
	    list.tryHere();
	}

	@When("the User is on the editor page")
	public void the_User_is_on_the_editor_page() {
	   dsalgopage.dstryeditor();
	}

	@When("The user writes the valid created linkedlist python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_created_linkedlist_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String valid_createdlinkedlist = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + valid_createdlinkedlist + "" );
		if (sheetname != null )
		list.editorBox(valid_createdlinkedlist);
		Thread.sleep(1000);
	   
	}

	@When("the user click on Run button")
	public void the_user_click_on_Run_button() {
	   list.runBtn();
	}

	@Then("The user is able to see the output createdlinkedlist inside the console.")
	public void the_user_is_able_to_see_the_output_createdlinkedlist_inside_the_console() {
	   LoggerLoad.info("User is able see output created linkedlist in console");
	   String Final_createdMsg=list.successmsg();
	   LoggerLoad.info(Final_createdMsg);
	}  

	@Given("User is on the editor page again")
	public void user_is_on_the_editor_page_again() {
	    dsalgopage.dstryeditor();
	}

	@When("The user writes the invalid created linkedlist python code {string} and {int} into editorbox")
	public void the_user_writes_the_invalid_created_linkedlist_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_createdlinkedlist = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + invalid_createdlinkedlist + "" );
		if (sheetname != null )
		list.editorBox(invalid_createdlinkedlist);
		Thread.sleep(1000);
	   
	}

	@When("The User click run button")
	public void the_user_click_run_button() {
	   list.runBtn();
	}

	@Then("The user see error msg in alert window in created linked list")
	public void the_user_see_error_msg_in_alert_window_in_created_linked_list() {
		list.alertpopup_linkedlist();
	   
	}
	//Types of Linked List
	@Given("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
	    dsalgopage.dsTypesofLinkedlistPage();
	}

	@When("The user clicks TryHere button again")
	public void the_user_clicks_try_here_button_again() {
	    list.tryHere();
	}

	@When("The User is on the editor page")
	public void the_user_is_on_the_editor_page1() {
	   dsalgopage.dstryeditor();
	}

	@When("The user writes the valid type of linkedlist python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_type_of_linkedlist_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String valid_Typeslinkedlist = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + valid_Typeslinkedlist + "" );
		if (sheetname != null )
		list.editorBox(valid_Typeslinkedlist);
		Thread.sleep(1000);
	}
	@When("The User clicks run button")
	public void the_user_clicks_run_button1() {
	  list.runBtn();
	}

	@Then("The user is able to see the output typeoflinkedlist inside the console.")
	public void the_user_is_able_to_see_the_output_typeoflinkedlist_inside_the_console() {
		 LoggerLoad.info("User is able see output types of linkedlist in console");
		   String Final_typesMsg=list.successmsg();
		   LoggerLoad.info(Final_typesMsg);
	}

	@Given("The user is on the editor page onemoretime")
	public void the_user_is_on_the_editor_page_onemoretime() {
	    dsalgopage.dstryeditor();
	}

	@When("The user writes the invalid python code {string} and {int} into editor box")
	public void the_user_writes_the_invalid_python_code_and_into_editor_box(String sheetname, Integer rownumber) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_typeslinkedlist = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + invalid_typeslinkedlist + "" );
		if (sheetname != null )
		list.editorBox(invalid_typeslinkedlist);
		Thread.sleep(1000);
	   
	}

	@When("The user clicks run button")
	public void the_user_clicks_run_button() {
	   list.runBtn();
	}

	@Then("The user see error msg in alert window in types of linkedlist")
	public void the_user_see_error_msg_in_alert_window_in_types_of_linkedlist() {
	   list.alertpopup_linkedlist();
	}
	//Implement Linked List
	@Given("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
	   dsalgopage.dsImplementLinkedListPage();
	}

	@When("User clicks Try Button")
	public void user_clicks_try_button() {
	   list.tryHere();
	}

	@When("The user writes the valid type of Implement python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_type_of_implement_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String valid_Implement = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + valid_Implement + "" );
		if (sheetname != null )
		list.editorBox(valid_Implement);
		Thread.sleep(1000);
	}

	@When("User clicks RUn button")
	public void user_clicks_r_un_button() {
	    list.runBtn();
	}

	@Then("The user is able to see the output implement inside the console.")
	public void the_user_is_able_to_see_the_output_implement_inside_the_console() {
		 LoggerLoad.info("User is able see output Implement linkedlist in console");
		   String Final_implementMsg=list.successmsg();
		   LoggerLoad.info(Final_implementMsg);
	}

	@Given("The user is on the Editor page agains")
	public void the_user_is_on_the_editor_page_agains() {
	   dsalgopage.dstryeditor();
	}

	@When("The user writes the invalid Implement python code {string} and {int} into editorbox")
	public void the_user_writes_the_invalid_implement_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_implement = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + invalid_implement + "" );
		if (sheetname != null )
		list.editorBox(invalid_implement);
		Thread.sleep(1000);
	}

	@When("User click run button in implement linkedlist page")
	public void user_click_run_button_in_implement_linkedlist_page() {
		list.runBtn();
	   
	}

	@Then("The user see error msg in alert window in implement linked list")
	public void the_user_see_error_msg_in_alert_window_in_implement_linked_list() {
		list.alertpopup_linkedlist();
	}
	
	
//Traversal Linked List
	@Given("The user clicks Traversal Linked List in Python link")
	public void the_user_clicks_traversal_linked_list_in_python_link() {
	   dsalgopage.dsTraversalLinkedListPage();
	}

	@When("User click Tryhere Buttons again")
	public void user_click_tryhere_buttons_again() {
	    list.tryHere();
	}

	@When("The user writes the valid type of Traversal python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_type_of_traversal_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String valid_Traversal = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + valid_Traversal + "" );
		if (sheetname != null )
		list.editorBox(valid_Traversal);
		Thread.sleep(1000);
	
	}

	@When("User clicks RUn button in traversal")
	public void user_clicks_r_un_button_in_traversal() {
	   list.runBtn();
	}

	@Given("The user is on the Editor page again")
	public void the_user_is_on_the_editor_page_again1() {
	   dsalgopage.dstryeditor();
	}

	@When("The user writes the invalid Traversal python code {string} and {int} into editorbox")
	public void the_user_writes_the_invalid_traversal_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_traversal = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Traversal Pythoncode is \" " + invalid_traversal + "" );
		if (sheetname != null )
		list.editorBox(invalid_traversal);
		Thread.sleep(1000);
	}

	@When("User click run button in Traversal linkedlist page")
	public void user_click_run_button_in_traversal_linkedlist_page() {
	  list.runBtn();
	}

	@Then("The user see error msg in alert window in traversal linked list")
	public void the_user_see_error_msg_in_alert_window_in_traversal_linked_list() {
	    list.alertpopup_linkedlist();
	}
	
	//Insertion Linked List

	@Given("The user clicks Insertion Linked List in Python link")
	public void the_user_clicks_insertion_linked_list_in_python_link() {
	    dsalgopage.dsInsertionLinkedListPage();
	   // list.tryHere();
	    //list.scrollPage();
	}
	@When("User click Tryhere Button again")
	public void user_click_tryhere_button_again() {
		list.scrollPage();
	}


	@When("The user writes the valid Insertion python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_insertion_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String valid_Insertion = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + valid_Insertion + "" );
		if (sheetname != null )
		list.editorBox(valid_Insertion);
		Thread.sleep(1000);
	}

	@When("User clicks RUN button in insertion")
	public void user_clicks_run_button_in_insertion() {
	   list.runBtn();
	}

	@Then("The user is able to see the output insertion inside the console.")
	public void the_user_is_able_to_see_the_output_insertion_inside_the_console() {
		LoggerLoad.info("User is able see output Implement linkedlist in console");
		   String Final_insertionMsg=list.successmsg();
		   LoggerLoad.info(Final_insertionMsg);
	}

	@Given("The user is the editor page again")
	public void the_user_is_the_editor_page_again() {
	   dsalgopage.dstryeditor();
	}

	@When("The user writes the invalid Insertion python code {string} and {int} into editorbox")
	public void the_user_writes_the_invalid_insertion_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_insertion = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Traversal Pythoncode is \" " + invalid_insertion + "" );
		if (sheetname != null )
		list.editorBox(invalid_insertion);
		Thread.sleep(1000);
	}

	@When("User click run button in Insertion linkedlist page")
	public void user_click_run_button_in_insertion_linkedlist_page() {
	   list.runBtn();
	}

	@Then("The user see error msg in alert window in insertion linked list")
	public void the_user_see_error_msg_in_alert_window_in_insertion_linked_list() {
	    list.alertpopup_linkedlist();
	}
	
	@Given("The user clicks Deletion Linked List in Python link")
	public void the_user_clicks_deletion_linked_list_in_python_link() {
	    dsalgopage.dsDeletionLinkedListPage();
	}
	@When("User click Try Button again")
	public void user_click_try_button_again() {
	  list.tryHere();
	}
	@When("The user writes the valid Deletion python code {string} and {int} into editorbox")
	public void the_user_writes_the_valid_deletion_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String valid_deletion = testdata.get(rownumber).get("pythoncode");	
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + valid_deletion + "" );
		if (sheetname != null )
		list.editorBox(valid_deletion);
		Thread.sleep(1000);
	}
	@When("User clicks RUN button in deletion")
	public void user_clicks_run_button_in_deletion() {
	    list.runBtn();
	}
	@Then("The user is able to see the output deletion inside the console.")
	public void the_user_is_able_to_see_the_output_deletion_inside_the_console() {
		LoggerLoad.info("User is able see output Implement linkedlist in console");
		   String Final_deletionMsg=list.successmsg();
		   LoggerLoad.info(Final_deletionMsg);
	}
	
	@Given("The user is EDitor page")
	public void the_user_is_EDitor_page() {
	dsalgopage.dstryeditor();
	}
	@When("The user writes the invalid Deletion python code {string} and {int} into editorbox")
	public void the_user_writes_the_invalid_deletion_python_code_and_into_editorbox(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
		String invalid_deletion = testdata.get(rownumber).get("pythoncode");
		LoggerLoad.info("User Enter invalid Linkedlist Pythoncode is \" " + invalid_deletion + "" );
		if (sheetname != null )
	    list.editorBox(invalid_deletion);
		
	}
	@When("User click run button in Deletion linkedlist page")
	public void user_clicks_run_button_in_Deletion() {
	    list.runBtn();
	}
	@Then("the user see error msg in alert window in deletion")
	public void the_user_see_error_msg_in_alert_window_in_deletion() {
	   list.alertpopup_linkedlist();
	}
  


}
