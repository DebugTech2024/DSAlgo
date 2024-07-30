package step;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.CommonPage;
import pom.pom_tree;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import webdemo.DriverFactory;

public class steps_tree {
	private pom_tree tree=new pom_tree(DriverFactory.getDriver());
	CommonPage treepage=new CommonPage(DriverFactory.getDriver());
	@Given("User is on home page")
	public void user_is_on_home_page() {
	   treepage.dsHomepage();
	}

	@Given("User goes to signin page")
	public void user_goes_to_signin_page() {
	   treepage.dsSigninpage();
	}
    @Given("User enters valid dsalgo username and password")
    public void user_enter_value() {
    	treepage.dslogin();
    }
	@Given("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    treepage.dsloginbutton();
	}

	@Given("User goes to Tree page")
	public void user_goes_to_tree_page() {
	   //treepage.dsTreePage();
	}

	@Given("The user comes back to the DS_algo home page to select or start DS Tree")
	public void the_user_comes_back_to_the_ds_algo_home_page_to_select_or_start_ds_tree() {
	    treepage.dsHomepage();
	}

	@When("The user select {string} from the Data Structure dropdown menuor clicks the {string} button in Tree Panel")
	public void the_user_select_from_the_data_structure_dropdown_menuor_clicks_the_button_in_tree_panel(String string, String string2) {
	   tree.treeGetBtn();
	}

	@Then("The user should be redirected to Tree page.")
	public void the_user_should_be_redirected_to_tree_page() {
	    LoggerLoad.info("User in Tree Page");
	}

	@Given("The user is on the Tree page")
	public void the_user_is_on_the_tree_page() {
	   treepage.dsTreePage();
	}

	@Given("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
	   tree.overviewTreePage();
	}

	@When("The user should be redirected to Overview  of Trees page.")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
	   LoggerLoad.info("User redirected to Overview of Page");
	}

	@When("User click try it  button")
	public void user_click_try_it_button() {
	    tree.Trybtn();
	}

	@When("user valid python code for overview of trees {string} and {int} and run button")
	public void user_valid_python_code_for_overview_of_trees_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		treepage.dstryeditor();
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String valid_overview = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_overview + "" );

		if (sheetname != null )

			tree.TreeEditorBox(valid_overview);
		tree.runButton();
	}

	@When("user see valid overview of tree message in console")
	public void user_see_valid_overview_of_tree_message_in_console() {
		 LoggerLoad.info("User is able see output in console");
		   String Final_TreeMsg=tree.tree_msg();
		   LoggerLoad.info(Final_TreeMsg);
	}
	@Given("user in editor page")
	public void editor_page() {
		treepage.dstryeditor();
	}

	@When("user invalid python code for overview of tree {string} and {int} and run it")
	public void user_invalid_python_code_for_overview_of_tree_and_and_run_it(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String invalid_overview = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter Invalid Pythoncode is \" " + invalid_overview + "" );

		if (sheetname != null )

			tree.TreeEditorBox(invalid_overview);
		tree.runButton();
	}

	@Then("user see the error alert message")
	public void user_see_the_error_alert_message() {
	   tree.alertpopup_tree();
	}
	@Given("The user clicks Terminologies of Trees link")
	public void the_user_clicks_terminologies_of_trees_link() throws InterruptedException {
	  treepage.dsTreePage();
		tree.terminiologiesPage();
	  Thread.sleep(1000);
	}

	@When("The user should be redirected to terminologies  of Trees page.")
	public void the_user_should_be_redirected_to_terminologies_of_trees_page() {
	   LoggerLoad.info("User should be in terminologies page");
	}

	@When("User click try it button in tree")
	public void user_click_try_it_button_in_tree() {
	   tree.Trybtn();
	}

	@When("user enter editor valid python code for terminologies of trees {string} and {int} and run button")
	public void user_enter_editor_valid_python_code_for_terminologies_of_trees_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		treepage.dstryeditor();
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String valid_terminologies = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_terminologies + "" );

		if (sheetname != null )

			tree.TreeEditorBox(valid_terminologies);
		tree.runButton();
	}

	@Then("user see valid terminologies of tree message in console")
	public void user_see_valid_terminologies_of_tree_message_in_console() {
		LoggerLoad.info("User is able see output in console");
		   String Final_TreeMsg=tree.tree_msg();
		   LoggerLoad.info(Final_TreeMsg);
	}

	@Given("user in editor page and user invalid python code for terminologies of tree {string} and {int} and run it")
	public void user_in_editor_page_and_user_invalid_python_code_for_terminologies_of_tree_and_and_run_it(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		treepage.dstryeditor();
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String invalid_terminologies = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter Invalid Pythoncode is \" " + invalid_terminologies + "" );

		if (sheetname != null )

			tree.TreeEditorBox(invalid_terminologies);
		tree.runButton();
	}

	@Then("user see the error alert message in terminologies page")
	public void user_see_the_error_alert_message_in_terminologies_page() {
		tree.alertpopup_tree();
	}
	@Given("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
	    treepage.dsTreePage();
	    tree.TypeofTreePage();
	}

	@When("The user should be redirected to Types  of Trees page.")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		LoggerLoad.info("User in Types of tree page");

	}

	@When("User click try it button in types of tree")
	public void user_click_try_it_button_in_types_of_tree() {
	   tree.Trybtn();
	}

	@When("user enter editor valid python code for Types of trees {string} and {int} and run button")
	public void user_enter_editor_valid_python_code_for_types_of_trees_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		treepage.dstryeditor();
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String valid_typesoftree = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_typesoftree + "" );

		if (sheetname != null )

			tree.TreeEditorBox(valid_typesoftree);
		tree.runButton();
	}

	@Then("user see valid Types of tree message in console")
	public void user_see_valid_types_of_tree_message_in_console() {
		LoggerLoad.info("User is able see output in console");
		   String Final_TreeMsg=tree.tree_msg();
		   LoggerLoad.info(Final_TreeMsg);
	}

	@Given("user in editor page and user invalid python code for Types of tree {string} and {int} and run it")
	public void user_in_editor_page_and_user_invalid_python_code_for_types_of_tree_and_and_run_it(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		treepage.dstryeditor();
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
        String invalid_typesoftree = testdata.get(rownumber).get("pythoncode");
		
		LoggerLoad.info("User Enter valid Pythoncode is \" " + invalid_typesoftree + "" );

		if (sheetname != null )

			tree.TreeEditorBox(invalid_typesoftree);
		tree.runButton();
	}

	@Then("user see the error alert message in Types of tree page")
	public void user_see_the_error_alert_message_in_types_of_tree_page() {
	   tree.alertpopup_tree();
	}

@Given("The user clicks Traversal Tree link")
public void the_user_clicks_traversal_tree_link() {
	treepage.dsTreePage();
   tree.TreeTraversalPage();
}

@When("The user should be redirected to Traversal  of Trees page.")
public void the_user_should_be_redirected_to_traversal_of_trees_page() {
   LoggerLoad.info("User should be redirected to Tree Traversal page");
}

@When("User click try it button in traversal of tree")
public void user_click_try_it_button_in_traversal_of_tree() {
   tree.scrollPage_Tree();
}

@When("user enter editor valid python code for Traversal of trees {string} and {int} and run button")
public void user_enter_editor_valid_python_code_for_traversal_of_trees_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	treepage.dstryeditor();
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String valid_Traversaltree = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_Traversaltree + "" );

	if (sheetname != null )

		tree.TreeEditorBox(valid_Traversaltree);
	tree.runButton();
}

@Then("user see valid Traversal of tree message in console")
public void user_see_valid_traversal_of_tree_message_in_console() {
	LoggerLoad.info("User is able see output in console");
	   String Final_TreeMsg=tree.tree_msg();
	   LoggerLoad.info(Final_TreeMsg);
}

@Given("user in editor page and user invalid python code for Traversal of tree {string} and {int} and run it")
public void user_in_editor_page_and_user_invalid_python_code_for_traversal_of_tree_and_and_run_it(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	treepage.dstryeditor();
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String invalid_traversaltree = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + invalid_traversaltree + "" );

	if (sheetname != null )

		tree.TreeEditorBox(invalid_traversaltree);
	tree.runButton();
}

@Then("user see the error alert message in Traversal of tree page")
public void user_see_the_error_alert_message_in_traversal_of_tree_page() {
   tree.alertpopup_tree();
}

@Given("The user clicks Traversal Illustration Tree link")
public void the_user_clicks_traversal_illustration_tree_link() {
    treepage.dsTreePage();
    tree.TravelIllustionPage();
}

@When("The user should be redirected to Traversal illustration  of Trees page.")
public void the_user_should_be_redirected_to_traversal_illustration_of_trees_page() {
   LoggerLoad.info("User in Traversal illustration tree page");
}

@When("User click try it button in traversal illustration of tree")
public void user_click_try_it_button_in_traversal_illustration_of_tree() {
   tree.Trybtn();
}

@When("user enter editor valid python code for Traversal illustration of trees {string} and {int} and run button")
public void user_enter_editor_valid_python_code_for_traversal_illustration_of_trees_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	treepage.dstryeditor();
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String valid_traversalillustration = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_traversalillustration + "" );

	if (sheetname != null )

		tree.TreeEditorBox(valid_traversalillustration);
	tree.runButton();
}

@Then("user see valid Traversal illustration of tree message in console")
public void user_see_valid_traversal_illustration_of_tree_message_in_console() {
	LoggerLoad.info("User is able see output in console");
	   String Final_TreeMsg=tree.tree_msg();
	   LoggerLoad.info(Final_TreeMsg);
}

@Given("user in editor page and user invalid python code for Traversal illustration of tree {string} and {int} and run it")
public void user_in_editor_page_and_user_invalid_python_code_for_traversal_illustration_of_tree_and_and_run_it(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	treepage.dstryeditor();
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String invalid_traversalillustration = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + invalid_traversalillustration + "" );

	if (sheetname != null )

		tree.TreeEditorBox(invalid_traversalillustration);
	tree.runButton();
}

@Then("user see the error alert message in Traversal illustration of tree page")
public void user_see_the_error_alert_message_in_traversal_illustration_of_tree_page() {
	 tree.alertpopup_tree();
}
@Given("The user clicks Binary Tree link")
public void the_user_clicks_binary_tree_link() {
   treepage.dsTreePage();
   tree.BinaryPage();
}

@When("The user should be redirected to Binary tree page.")
public void the_user_should_be_redirected_to_binary_tree_page() {
   LoggerLoad.info("User in Binary tree page");
}

@When("User click try it button in Binary tree")
public void user_click_try_it_button_in_binary_tree() {
   tree.Trybtn();
}

@When("user enter editor valid python code for Binary trees {string} and {int} and run button")
public void user_enter_editor_valid_python_code_for_binary_trees_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	treepage.dstryeditor();
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String valid_binaryTree = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + valid_binaryTree + "" );

	if (sheetname != null )

		tree.TreeEditorBox(valid_binaryTree);
	tree.runButton();
}

@Then("user see valid Binary tree message in console")
public void user_see_valid_binary_tree_message_in_console() {
	LoggerLoad.info("User is able see output in console");
	   String Final_TreeMsg=tree.tree_msg();
	   LoggerLoad.info(Final_TreeMsg);
}

@Given("user in editor page and user invalid python code for Binary tree {string} and {int} and run it")
public void user_in_editor_page_and_user_invalid_python_code_for_binary_tree_and_and_run_it(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	treepage.dstryeditor();
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/config/Excel data/DsAlgo_Loginpage.xlsx", sheetname);
    String invalid_binaryTree = testdata.get(rownumber).get("pythoncode");
	
	LoggerLoad.info("User Enter valid Pythoncode is \" " + invalid_binaryTree + "" );

	if (sheetname != null )

		tree.TreeEditorBox(invalid_binaryTree);
	tree.runButton();
}

@Then("user see the error alert message in Binary page")
public void user_see_the_error_alert_message_in_binary_page() {
	tree.alertpopup_tree();
}




}
