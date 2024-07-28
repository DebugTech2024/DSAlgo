package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import Crossbrowser.DriverFactory;
import Pages.CommonPage;
import Pages.Queue_pom;
import Pages.Tree2_pom;
import Utility.ConfigFileReader;
import Utility.ExcelReader1;
import Utility.LoggerLoad;
import io.cucumber.java.en.*;

public class Tree2steps {
	
	public static WebDriver driver;
	ConfigFileReader configFileReader;
	
	
	private static final Logger logger =LogManager.getLogger(Queuesteps.class);
	
	@SuppressWarnings("unused")
	private Tree2_pom Tp=new Tree2_pom(DriverFactory.getDriver());
	CommonPage tree2page=new CommonPage(DriverFactory.getDriver());
	
	@Given("user is tree2 homepage")
	public void user_is_tree2_homepage() {
		tree2page.dsHomepage();
	}
	

	@When("user  in the sign in page of tree")
	public void user_in_the_sign_in_page_of_tree() {
	   tree2page.dsSigninpage();
	}

	@Then("user click is on username and password for tree")
	public void user_click_is_on_username_and_password_for_tree() {
		tree2page.dslogin();
	}

	@Then("user click login button for tree")
	public void user_click_login_button_for_tree() {
		
		tree2page.dsloginbutton();
	}

	@Then("user is on tree2 perform page")
	public void user_is_on_tree2_perform_page() throws InterruptedException {
		Tp.treeget();
	}

	@Given("user is on implementation in python pages")
	public void user_is_on_implementation_in_python_pages() {
		tree2page.treepage();
		Tp.imtrpy();
	}

	@Then("user is on try here button")
	public void user_is_on_try_here_button() throws InterruptedException {
		//tree2page.dsTryHerebtn();
		Tp.trytree();;
	}

	@When("user enter try editior page")
	public void user_enter_try_editior_page() {
		tree2page.dstryeditor();
	}

	@Then("user enter valid code on implementation in python page from excel sheet {string} and {int}")
	public void user_enter_valid_code_on_implementation_in_python_page_from_excel_sheet_and(String sheetname, Integer rownumber) throws InterruptedException, InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet16");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Tp.tred1(validcode);
		  // Tp.trrun();
		tree2page.runbtn();
	}

	@Then("user is on get output in the console")
	public void user_is_on_get_output_in_the_console() {
		tree2page.console();
	}

	@When("user enter invalid code on implentation of tree page from excel sheet {string} and {int}")
	public void user_enter_invalid_code_on_implentation_of_tree_page_from_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		tree2page.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet16");
		String Invalidcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Tp.tred2(Invalidcode);
		   tree2page.runbtn();
	}

	@When("user get an error message in the implentation of tree")
	public void user_get_an_error_message_in_the_implentation_of_tree() {
		tree2page.aler();
	}

	@When("user redirct the implentation of the page")
	public void user_redirct_the_implentation_of_the_page() {
		tree2page.treepage();
	}
	@Given("user Binary tree traversals page")
	public void user_binary_tree_traversals_page() {
	    Tp.treetra();
	}

	@Then("user is tryhere button of tree traversals page")
	public void user_is_tryhere_button_of_tree_traversals_page() throws InterruptedException {
	   Tp.trytree();
	}

	@When("user enter is on try editior page on tree traversals page")
	public void user_enter_is_on_try_editior_page_on_tree_traversals_page() {
		tree2page.dstryeditor();
	}

	@Then("user enter is on valid python code for tree traversals in excel sheet from {string} and {int}")
	public void user_enter_is_on_valid_python_code_for_tree_traversals_in_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet17");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Tp.tred3(validcode);
		  tree2page.runbtn();
	}

	@Then("user is on get output in the console for tree traversals page")
	public void user_is_on_get_output_in_the_console_for_tree_traversals_page() {
		tree2page.console();
	}

	@When("user enter invalid code on python code for tree traversals in excel sheet from {string} and {int}")
	public void user_enter_invalid_code_on_python_code_for_tree_traversals_in_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		tree2page.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet17");
		String Invalidcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Tp.tred4(Invalidcode);
		   tree2page.runbtn();
	}

	@When("user is an error message in the tree traversals page")
	public void user_is_an_error_message_in_the_tree_traversals_page() {
		tree2page.aler();
	}

	@When("user is an redirect the page for tree traversals page")
	public void user_is_an_redirect_the_page_for_tree_traversals_page() {
		tree2page.treepage();
	}
	
	@Given("user impl of binary trees page")
	public void user_impl_of_binary_trees_page() {
	    Tp.implbina();
	}

	@Then("user is tryhere button of imple of binary trees page")
	public void user_is_tryhere_button_of_imple_of_binary_trees_page() throws InterruptedException {
		Tp.trytree();
	}

	@When("user is on enter tryeditor page on imple of binary trees page")
	public void user_is_on_enter_tryeditor_page_on_imple_of_binary_trees_page() {
		tree2page.dstryeditor();
	}

	@Then("user enter valid code from python code fof imple of binary trees page in excel sheet from {string} and {int}")
	public void user_enter_valid_code_from_python_code_fof_imple_of_binary_trees_page_in_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet18");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Tp.tred5(validcode);
		  tree2page.runbtn();
	}

	@Then("user is on get output message in the console for imple of binary page")
	public void user_is_on_get_output_message_in_the_console_for_imple_of_binary_page() {
		tree2page.console();
	}

	@When("user enter invalid code for python for imple of binary page in excel sheet from {string} and {int}")
	public void user_enter_invalid_code_for_python_for_imple_of_binary_page_in_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		tree2page.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet18");
		String Invalidcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Tp.tred6(Invalidcode);
		   tree2page.runbtn();
	}

	@When("user is an error message in the imple of binary trees page")
	public void user_is_an_error_message_in_the_imple_of_binary_trees_page() {
		tree2page.aler();
	}

	@When("user redirect the page for imple of binary tree page")
	public void user_redirect_the_page_for_imple_of_binary_tree_page() {
		tree2page.treepage();
	}

	@Given("user is on application of binary trees")
	public void user_is_on_application_of_binary_trees() {
	    Tp.appofbin();
	}

	@Then("user is on try here button in the appliction of binary trees")
	public void user_is_on_try_here_button_in_the_appliction_of_binary_trees() {
		tree2page.dsTryHerebtn();
	}

	@When("user is on the tryeditor button for appliction of binary trees")
	public void user_is_on_the_tryeditor_button_for_appliction_of_binary_trees() {
		tree2page.dstryeditor();

	}

	@Then("user enter valid code from python code for appliction of binary tree in excel sheet from {string} and {int}")
	public void user_enter_valid_code_from_python_code_for_appliction_of_binary_tree_in_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet19");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Tp.tred7(validcode);
		  tree2page.runbtn();
	}

	@Then("user is on the console message in the application of binary tree")
	public void user_is_on_the_console_message_in_the_application_of_binary_tree() {
		tree2page.console();
	}

	@When("user enter invalid code from python code for appliction of binary tree in excel sheet from {string} and {int}")
	public void user_enter_invalid_code_from_python_code_for_appliction_of_binary_tree_in_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		tree2page.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet19");
		String Invalidcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Tp.tred8(Invalidcode);
		   tree2page.runbtn();
	}

	@When("user is an error message in the appliction of binary tree")
	public void user_is_an_error_message_in_the_appliction_of_binary_tree() {
		tree2page.aler();
	}

	@When("user redirect the page for appliction of binary tree")
	public void user_redirect_the_page_for_appliction_of_binary_tree() {
		tree2page.treepage();
	}

	@Given("user is on binary search trees")
	public void user_is_on_binary_search_trees() {
	    Tp.binsearch();
	}

	@Then("user is on try here button on the binary search trees")
	public void user_is_on_try_here_button_on_the_binary_search_trees() throws InterruptedException {
		Tp.trytree();
	}

	@When("user enter on try editior button for binary search trees")
	public void user_enter_on_try_editior_button_for_binary_search_trees() {
		tree2page.dstryeditor();
	}

	@Then("user is enter valid python code for binary search trees in the excel sheet from {string} and {int}")
	public void user_is_enter_valid_python_code_for_binary_search_trees_in_the_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		    
			ExcelReader1 reader = new ExcelReader1();	
			List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet20");
			String validcode = testdata.get(0).get("pythoncode");
			System.out.println(testdata.get(0).toString());
			LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
			
			if (sheetname != null )
				Tp.tred9(validcode);
			  tree2page.runbtn();

	}

	@Then("user get output message in the console for binary search tree")
	public void user_get_output_message_in_the_console_for_binary_search_tree() {
		tree2page.console();
	}

	@When("user is an enter invalid python code for binary search tree in the excel sheet from {string} and {int}")
	public void user_is_an_enter_invalid_python_code_for_binary_search_tree_in_the_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		tree2page.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet20");
		String Invalidcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Tp.tred10(Invalidcode);
		   tree2page.runbtn();
	}

	@When("user is an error message in the binary search tree")
	public void user_is_an_error_message_in_the_binary_search_tree() {
		tree2page.aler();
	}

	@When("user redirect the page for binary search tree")
	public void user_redirect_the_page_for_binary_search_tree() {
		tree2page.treepage();
	}
	@Given("user is on implementation of BST page")
	public void user_is_on_implementation_of_bst_page() {
	    Tp.bstogpa();
	}

	@When("user enter try here button of implemetation of BST page")
	public void user_enter_try_here_button_of_implemetation_of_bst_page() throws InterruptedException {
		Tp.trytree();
	}

	@Then("user enter tryeditior page of implementation of BST page")
	public void user_enter_tryeditior_page_of_implementation_of_bst_page() {
		tree2page.dstryeditor();
	}

	@When("user enter valid code from implementation of BST from excel sheet {string} and {int}")
	public void user_enter_valid_code_from_implementation_of_bst_from_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet21");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Tp.tred11(validcode);
		  tree2page.runbtn();

	}

	@When("user is output in the console of implementation of BST page")
	public void user_is_output_in_the_console_of_implementation_of_bst_page() {
		tree2page.console();
	}

	@When("user enter invalid code from implementation of BSt of excel sheet from {string} and {int}")
	public void user_enter_invalid_code_from_implementation_of_b_st_of_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		tree2page.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet21");
		String Invalidcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Tp.tred12(Invalidcode);
		   tree2page.runbtn();
	}

	@When("user is an error message of implentation of BST page")
	public void user_is_an_error_message_of_implentation_of_bst_page() {
		tree2page.aler();
	}

	@When("user redirect page")
	public void user_redirect_page() {
	    Tp.treequ();
	}

	@Given("user enter practice question page in the tree")
	public void user_enter_practice_question_page_in_the_tree() throws InterruptedException {
		Tp.trquep();
	}

	@Given("user redirect the home page from tree page")
	public void user_redirect_the_home_page_from_tree_page() {
		//tree2page.dsHomepage();
	}
}
