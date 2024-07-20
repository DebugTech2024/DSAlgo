package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import Crossbrowser.DriverFactory;
import Pages.Array_pom;
import Pages.CommonPage;
import Utility.ConfigFileReader;
import Utility.ExcelReader1;
import Utility.LoggerLoad;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Crossbrowser.Drivers;

@SuppressWarnings("unused")
public class Arraysteps {
	public  static WebDriver driver;
	ConfigFileReader configFileReader;
	 public  Array_pom Ap;
	 
	
	private static final Logger logger =LogManager.getLogger(Arraysteps.class);
	/*private Array_pom Array=new Array_pom (DriverFactory.getDriver());
		CommonPage datapage=new CommonPage(DriverFactory.getDriver());
		

       @Given("The user is on home page")
		public void the_user_is_on_home_page() {
		   datapage.dsHomepage();
		}

		@And("the user goes to signin page")
		public void the_user_goes_to_signin_page() {
               datapage.dsSigninpage();
		}

		@And("the user enters valid username and password")
		public void the_user_enters_valid_username_and_password() {
            datapage.dslogin();

		}

		@And("the user clicks on login button")
		public void the_user_clicks_on_login_button() {

			datapage.dsloginbutton();
		}
*/
	
	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
		 driver = new ChromeDriver();
	   	 configFileReader = new ConfigFileReader();
	   	 driver.get(configFileReader.getApplicationUrl());
	   	 driver.manage().window().maximize();
		 System.out.println("Browser Type is: "+configFileReader.getBrowser());
	     System.out.println("Application Url is: "+configFileReader.getApplicationUrl());
	     Ap=new  Array_pom (driver);
			Ap.get();
	   
	}
	@And("the user goes to signin page")
	public void the_user_goes_to_signin_page() {
		Ap=new  Array_pom (driver);
		Ap.sign();
	}
	@Given("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
		
		String username=configFileReader.getUserName();
		Ap.usernamebtn();
	    String password=configFileReader.getPassword();
		Ap.passwordbtn(); 
	   
	}
	@Given("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		Ap.log();
	}
   @Given("user in DSAlgo indroduction page")
	 public void user_in_ds_algo_indroduction_page() {
    	 System.out.println("user in DSAlgo indroduction page");
	    
	 }

   @When("user clicks getstatred button")
	public void user_clicks_getstatred_button() throws InterruptedException {
		Ap=new Array_pom (driver);
		Ap.arraybtn();
		Thread.sleep(1000);
	}

	@Then("user clicks on Arrays in python")
	public void user_clicks_on_arrays_in_python() {
		
		Ap=new Array_pom(driver);
		Ap.arrayinphy();
	}

	@Then("user clicks tryhere button of array in python page")
	public void user_clicks_tryhere_button_of_array_in_python_page() throws InterruptedException {
	   Ap.trybtn();
	}
	@Then("user enter try editor page to enter invalid python code from excel sheet {string} and {int} and click run button")
	public void user_enter_try_editor_page_to_enter_invalid_python_code_from_excel_sheet_and_and_click_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException  {
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet3");
		String Invalidcode = testdata.get(0).get("pythoncode");
		//System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Ap.editorbox(Invalidcode);
		Ap.rbtn();
		
	}

	@Then("user see error message displyed")
	public void user_see_error_message_displyed() {
		Ap.aler();
	    
	}
	@Then("user enter try editor page to enter valid python code from excel {string} and {int} and click run")
	public void user_enter_try_editor_page_to_enter_valid_python_code_from_excel_and_and_click_run(String sheetname, Integer rownmber) throws InvalidFormatException, IOException {
	    Ap.trypage();
	    ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet3");
		String validcode = testdata.get(1).get("pythoncode");
		//System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Ap.editbox(validcode);
		    Ap.rbtn();
 }

    @Then("user get output msg in console")
	public void user_get_output_msg_in_console() {
		Ap.cmsg();
	}
    @Given("user enter an arrayedit page")
    public void user_enter_an_arrayedit_page() {
        Ap.arrpage();
    }

    @When("user clicks on array using list link")
    public void user_clicks_on_array_using_list_link() {
        Ap.arraylink();
    }

    @Then("user click tryhere button to enter python edit page")
    public void user_click_tryhere_button_to_enter_python_edit_page() throws InterruptedException {
        Ap.trybtn();
    }

    @When("user enter invalid python code to excel sheet from {string} and {int} and click ru button")
    public void user_enter_invalid_python_code_to_excel_sheet_from_and_and_click_ru_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet4");
		String Invalidcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Ap.valid(Invalidcode);
		Ap.rbtn();
        
    }

    @When("user click error message")
    public void user_click_error_message() {
       Ap.aler();
    }

    @Then("user enter valid python code from excel {string} and {int} and click button")
    public void user_enter_valid_python_code_from_excel_and_and_click_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	
    	Ap.trypage();
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet4");
		String validcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Ap.val(validcode);
		Ap.rbtn();
       
    }

    @Then("user got an message")
    public void user_got_an_message() {
    	Ap.cmsg();
    }
    @Given("user is array of basic page")
    public void user_is_array_of_basic_page() {
    	 Ap.arrpage();
    }

    @When("user clicks basic operation list page")
    public void user_clicks_basic_operation_list_page() {
        Ap.basiclist();
    }

    @Then("user enter try here button to python page")
    public void user_enter_try_here_button_to_python_page() throws InterruptedException {
        Ap.trybtn();
    }

    @When("user write Invalid python code from excel sheet {string} and {int} and click button")
    public void user_write_invalid_python_code_from_excel_sheet_and_and_click_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet5");
		String Invalidcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Ap.basvalid(Invalidcode);
		Ap.rbtn();
    	
    }

    @When("user get error messgage")
    public void user_get_error_messgage() {
        Ap.aler();
    }

    @Then("user write valid python code from excel sheet {string} and {int} and run button")
    public void user_write_valid_python_code_from_excel_sheet_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	Ap.trypage();
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet5");
		String validcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Ap.basvalid(validcode);
		Ap.rbtn();
        
    }

    @Then("user get output in console box")
    public void user_get_output_in_console_box() {
        Ap.cmsg();
    }

    @Given("user is application page")
    public void user_is_application_page() {
    	 Ap.arrpage();
    }

    @When("user enter application of array link")
    public void user_enter_application_of_array_link() {
       Ap.applipage();
    }

    @Then("user cliks tryhere button to redirect python page")
    public void user_cliks_tryhere_button_to_redirect_python_page() throws InterruptedException {
    	Ap.trybtn();
    }

    @When("user wrote to python code from excel sheet {string} and {int} and click run button")
    public void user_wrote_to_python_code_from_excel_sheet_and_and_click_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet6");
		String Invalidcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Ap.applyv(Invalidcode);
		Ap.rbtn();
        
    }

    @When("user is on error message")
    public void user_is_on_error_message() {
       Ap.aler();
    }

    @When("user enter to python code valid for excel sheet {string} and {int} and run button")
    public void user_enter_to_python_code_valid_for_excel_sheet_and_and_run_button(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	Ap.trypage();
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet6");
		String validcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Ap.applyinv(validcode);
		Ap.rbtn();
       
    }

    @When("user is console message for output")
    public void user_is_console_message_for_output() {
    	Ap.cmsg();
       
    }

    @Given("user enter practice question page")
    public void user_enter_practice_question_page() {
       Ap.pracpage();
    }

    @When("user enter search way page")
    public void user_enter_search_way_page() {
    	Ap.search();
        
    }

    @Then("user enter invalid code from excel sheet to the page {string} and {int}")
    public void user_enter_invalid_code_from_excel_sheet_to_the_page_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	//Ap.edibox1();
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet7");
		String Invalidcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
		
		if (sheetname != null )
			Ap. edibox(Invalidcode);
		Ap.prun();
        
    }

    @Then("user got error message and display")
    public void user_got_error_message_and_display() {
    	 Ap.aler();
    }

    @When("user enter valid code from excel sheet to the page {string} and {int}")
    public void user_enter_valid_code_from_excel_sheet_to_the_page_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
    	 Ap.tr();
    	 Ap.cle();
    	//Ap.edibox1();
    	ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet7");
		String validcode = testdata.get(1).get("pythoncode");
		System.out.println(testdata.get(1).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Ap.edibox2 (validcode);
		Ap.prun();
        
    }

    @When("user run button to get message in the console")
    public void user_run_button_to_get_message_in_the_console() {
       // Ap.con();
    }

    @When("user send submit button")
    public void user_send_submit_button() {
      //  Ap.submit();
    }

    @When("user see an error message")
    public void user_see_an_error_message() {
    	//Ap.con();
    }





}
