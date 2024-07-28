package StepDefinition;

import java.io.IOException;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Crossbrowser.DriverFactory;
import Pages.CommonPage;
import Pages.Queue_pom;
import Utility.ConfigFileReader;
import Utility.ExcelReader1;
import Utility.LoggerLoad;
import io.cucumber.java.en.*;

@SuppressWarnings("unused")
public class Queuesteps {
	public static WebDriver driver;
	ConfigFileReader configFileReader;
	
	
	private static final Logger logger =LogManager.getLogger(Queuesteps.class);
	
	@SuppressWarnings("unused")
	private Queue_pom Qp=new Queue_pom(DriverFactory.getDriver());
	CommonPage queuepage=new CommonPage(DriverFactory.getDriver());
	@Given("user is queue homepage")
	public void user_is_queue_homepage() {
		
		queuepage.dsHomepage();
	}

	@When("user goes in the sign in page")
	public void user_goes_in_the_sign_in_page() {
	
		queuepage.dsSigninpage();
	}

	@Then("user clicks is on username and password")
	public void user_clicks_is_on_username_and_password() {
		
		queuepage.dslogin();
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
		
		queuepage.dsloginbutton();
	}

	@Then("user is on Queue perform page")
	public void user_is_on_queue_perform_page() {
	    logger.info("user is on Queue perform page");
	}

	@Given("user click getstarted button in queue page")
	public void user_click_getstarted_button_in_queue_page() throws InterruptedException {
		Qp.getbt();
	    
	}

	@When("user clicks implementation of python page")
	public void user_clicks_implementation_of_python_page() throws InterruptedException {
		Qp.imple();
	   
	}

	@Then("user clicks try here button")
	public void user_clicks_try_here_button() {
		Qp.trbt();
	   
	}

	@When("user enter try editor page")
	public void user_enter_try_editor_page() {
		Qp.editorbox();
	    
	}

	@Then("user enter valid python code to excel sheet {string} and {int}")
	public void user_enter_valid_python_code_to_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet12");
		String validcode = testdata.get(0).get("pythoncode");
	//	System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Qp.edi1(validcode);
		    Qp.rbtn();
		
	}

	@Then("user clicks run button to see output in the console")
	public void user_clicks_run_button_to_see_output_in_the_console() {
		LoggerLoad.info("User should be able to see console Message");
		String finalmsg=Qp.conmsg();
		LoggerLoad.info(finalmsg);
		
}

	@Then("user enter invalid code to excel shhet {string} and {int}")
	public void user_enter_invalid_code_to_excel_shhet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		Qp.editorbox();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet12");
		String Invalidcode = testdata.get(1).get("pythoncode");
		//System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Qp.edi2(Invalidcode);
		    Qp.rbtn();
	    
	}

	@Then("user get error pop up message")
	public void user_get_error_pop_up_message() {
		Qp.aler();
	    logger.info("Error message");
	    
	}
	@Given("user enter implentation using collection page")
	public void user_enter_implentation_using_collection_page() {
		Qp.collpage();
	}

	@When("user clicks try here button of collection page")
	public void user_clicks_try_here_button_of_collection_page() {
		Qp.trbt();
	}

	@Then("user enter python editor page in the collection")
	public void user_enter_python_editor_page_in_the_collection() {
		Qp.editorbox();
	}

	@When("user enter valid python code inthe excel sheet from {string} and {int}")
	public void user_enter_valid_python_code_inthe_excel_sheet_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet13");
		String validcode = testdata.get(0).get("pythoncode");
		//System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Qp.edi3(validcode);
		    Qp.rbtn();
		}

	@Then("user get on console message")
	public void user_get_on_console_message() {
		LoggerLoad.info("User should be able to see console Message");
		String finalmsg=Qp.conmsg();
		LoggerLoad.info(finalmsg);
	}

	@When("user enter invalid python code from excel sheet {string} and {int}")
	public void user_enter_invalid_python_code_from_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		Qp.editorbox();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet13");
		String Invalidcode = testdata.get(1).get("pythoncode");
		//System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Qp.edi4(Invalidcode);
		    Qp.rbtn();
	    
	}

	@Then("user get an error message")
	public void user_get_an_error_message() {
		Qp.aler();
	    logger.info("Error message");
	}

	@Then("user redirect to collection page")
	public void user_redirect_to_collection_page() throws InterruptedException {
		logger.info("collection page");
	}


@Given("user enter implentation of array page")
public void user_enter_implentation_of_array_page() throws InterruptedException {
	Qp.arraypage();
}

@When("user enter try here button in array page")
public void user_enter_try_here_button_in_array_page() throws InterruptedException {
	Qp.arrtrb();
}

@Then("user enter on try editor page in array")
public void user_enter_on_try_editor_page_in_array() {
	Qp.editorbox();
}

@When("user click send to valid python code in excel sheet {string} and {int}")
public void user_click_send_to_valid_python_code_in_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	ExcelReader1 reader = new ExcelReader1();	
	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet14");
	String validcode = testdata.get(0).get("pythoncode");
	//System.out.println(testdata.get(0).toString());
	LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
	
	if (sheetname != null )
		Qp.edi5(validcode);
	    Qp.rbtn();
    
}

@Then("user get an array output message")
public void user_get_an_array_output_message() {
	LoggerLoad.info("User should be able to see console Message");
	String finalmsg=Qp.conmsg();
	LoggerLoad.info(finalmsg);
    
}

@When("user click to send invalid python code in excel sheet {string} and {int}")
public void user_click_to_send_invalid_python_code_in_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	Qp.editorbox();
	ExcelReader1 reader = new ExcelReader1();	
	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet14");
	String Invalidcode = testdata.get(1).get("pythoncode");
	//System.out.println(testdata.get(1).toString());
	LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
	
	if (sheetname != null )
		Qp.edi6(Invalidcode);
	    Qp.rbtn();
}

@Then("user got error message in the pop up in window")
public void user_got_error_message_in_the_pop_up_in_window() {
	Qp.aler();
    logger.info("Error message");
}

@Then("user redirect to the page")
public void user_redirect_to_the_page() {
    
}
@Given("user enter queue operations page")
public void user_enter_queue_operations_page() {
	Qp.collpage();
}

@When("user click queue page")
public void user_click_queue_page() {
    Qp.que();
}

@Then("user clicks try here button on the queue page")
public void user_clicks_try_here_button_on_the_queue_page() {
	Qp.trbt();
}
@When("user enter valid pythoncode to excel sheet in queue page {string} and {int}")
public void user_enter_valid_pythoncode_to_excel_sheet_in_queue_page_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
   Qp.editorbox();
	ExcelReader1 reader = new ExcelReader1();	
	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet15");
	String validcode = testdata.get(0).get("pythoncode");
	//System.out.println(testdata.get(0).toString());
	LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
	
	if (sheetname != null )
		Qp.edi7(validcode);
	    Qp.rbtn();
}

@Then("user get output in console for queue page")
public void user_get_output_in_console_for_queue_page() {
	LoggerLoad.info("User should be able to see console Message");
	String finalmsg=Qp.conmsg();
	LoggerLoad.info(finalmsg);
}

@When("user enter invalid pythoncode to excel sheet in queue page {string} and {int}")
public void user_enter_invalid_pythoncode_to_excel_sheet_in_queue_page_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	Qp.editorbox();
	ExcelReader1 reader = new ExcelReader1();	
	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet15");
	String Invalidcode = testdata.get(1).get("pythoncode");
	//System.out.println(testdata.get(1).toString());
	LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
	
	if (sheetname != null )
		Qp.edi8(Invalidcode);
	    Qp.rbtn();
}

@Then("user get error message in the queue page")
public void user_get_error_message_in_the_queue_page() {
	Qp.aler();
    logger.info("Error message");
}

@Then("user redirect to the queue page")
public void user_redirect_to_the_queue_page() {
    logger.info("user is on queue page");
}

@Given("user is practice page")
public void user_is_practice_page() {
    Qp. pracque();
}

@When("user clicks on practice page")
public void user_clicks_on_practice_page() {
    Qp.quepage();
}

@Then("user redirect the home page")
public void user_redirect_the_home_page() {
   // driver.quit();
}



}
