
package StepDefinition;

import java.io.File;




import java.io.IOException;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.Keys;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Crossbrowser.DriverFactory;
import Pages.CommonPage;
import Pages.Graph_pom;
import Utility.ConfigFileReader;
import Utility.ExcelReader1;
import Utility.LoggerLoad;
import io.cucumber.java.en.*;
import Hooks.Apphooks;

@SuppressWarnings("unused")
public class Graphsteps{
	
	public static WebDriver driver;
	static ConfigFileReader configFileReader;
	 public static  Graph_pom Gp;
	
	private static final Logger logger =LogManager.getLogger(Graphsteps.class);
	static String projectpath;
	 static XSSFWorkbook workbook;
	 static String sheet;
	
	 
	 
	 
	 @SuppressWarnings("unused")
	//private Graph_pom Graph=new Graph_pom(DriverFactory.getDriver());
		//CommonPage datapage=new CommonPage(DriverFactory.getDriver());
		/*LoggerLoad.info("Driver initializing");
		
		
		@Given("user navigated to the login page")
		public void user_navigated_to_the_login_page() {
			datapage.dsHomepage();
			datapage.dsSigninpage();
		}
		@When("user submit username and password")
		public void user_submit_username_and_password() {
			datapage.dslogin();

		    
		}
		@Then("user should be logged in")
		public void user_should_be_logged_in() {
			datapage.dsloginbutton();
		    
		}



	/*	@Given("The user is on home page")
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
	 */
     @Given("user navigated to the login page")
	 public void user_navigated_to_the_login_page() {
    	 
    	 
		 driver = new ChromeDriver();
	   	 configFileReader = new ConfigFileReader();
	   	 driver.get(configFileReader.getApplicationUrl());
	   	 driver.manage().window().maximize();
		 System.out.println("Browser Type is: "+configFileReader.getBrowser());
	     System.out.println("Application Url is: "+configFileReader.getApplicationUrl());
	    
	     Gp=new Graph_pom (driver);
	      Gp.getbtn();
	 }
	 
	      @SuppressWarnings("unused")
	@When("user submit username and password")
	 public void user_submit_username_and_password() {
		 
		 
       Gp=new Graph_pom (driver);
			Gp.signinbtn();
			String username=configFileReader.getUserName();
			Gp.usernamebtn();
		    String password=configFileReader.getPassword();
			Gp.passwordbtn(); 
	}

	 @Then("user should be logged in")
	 public void user_should_be_logged_in() throws InterruptedException {
		 Gp=new Graph_pom (driver);
			Gp.logbtn();
	 }
	 @When("user is an graph home page")
	 public void user_is_an_graph_home_page() {
	     
	 }
     @Then("user clicks get strated button")
	 public void user_clicks_get_strated_button() throws InterruptedException {
		 Gp=new Graph_pom (driver);
	    Gp.graphbtn();
	 }

	 @When("user clicks Graph link")
	 public void user_clicks_graph_link() {
	    //Gp.graph();
	 }

	 @Then("user clicks Try Here button")
	 public void user_clicks_try_here_button() {
	    
	    // Gp.trybtn();
	     }
	 
	@When("user enters code in  tryeditor from excel sheet to {string} and {int} then click run, output is printed")
		public void user_enters_code_in_tryeditor_from_excel_sheet_to_and_then_click_run_output_is_printed(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		Gp.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet2");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Gp.editorbox (validcode);
		  Thread.sleep(2000);
			Gp.Run();
			
		}
	
	
		@When("users writes the code for invalid in tryeditor from {string} and {int} then click ru")
		public void users_writes_the_code_for_invalid_in_tryeditor_from_and_then_click_ru(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
			 Gp.dstryeditor();
			
			ExcelReader1 reader = new ExcelReader1();	
			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet2");
			String Invalidcode = testdata.get(1).get("pythoncode");
			System.out.println(testdata.get(1).toString());
			LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
			if (sheetname != null )
				Gp.editorbox (Invalidcode);
			  Thread.sleep(2000);
				Gp.Run();
		}
		
      @When("user get error message in the alert window") 
		public void user_get_error_message_in_the_alert_window() {
    	  Gp.alertpopup();
		    
		}

      @When("click ok button")
 	 public void click_ok_button() {
 	    
      }	 
    
      @Given("user is on the Graph page and see Graph Representations")
      public void user_is_on_the_graph_page_and_see_graph_representations() {
    	  Gp.grrep();
      }

      @When("user clicks Graph Representations link")
      public void user_clicks_graph_representations_link() {
          
      }

      @Then("user Try Here button")
      public void user_try_here_button() throws InterruptedException {
         // Gp.trbtn();
         // Thread.sleep(2000);
      }

      @When("user enters code2 in  tryeditor from excel sheet to {string} and {int} then click run, output is printed")
      public void user_enters_code2_in_tryeditor_from_excel_sheet_to_and_then_click_run_output_is_printed(String sheetname, Integer rownumber) throws InterruptedException, InvalidFormatException, IOException {
    /*	// Gp.dstryeditor();
    	  ExcelReader1 reader = new ExcelReader1();	
  		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet8");
  		String validcode = testdata.get(0).get("pythoncode");
  		System.out.println(testdata.get(0).toString());
  		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
  		
  		if (sheetname != null )
  			Gp.editorbox2(validcode);
  		  Thread.sleep(2000);
  			Gp.Run();
  			Gp.consomsg();*/
  			
  		}
      

      @When("user enter the python editor and write invalid python code from excel sheet {string} and {int}")
      public void user_enter_the_python_editor_and_write_invalid_python_code_from_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
    	/*  Gp.dstryeditor();
			
			ExcelReader1 reader = new ExcelReader1();	
			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet8");
			String Invalidcode = testdata.get(1).get("pythoncode");
			System.out.println(testdata.get(1).toString());
			LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
			if (sheetname != null )
				Gp.editorbox3(Invalidcode);
			  Thread.sleep(2000);*/
				
      }

      @When("click the run button")
      public void click_the_run_button() {
    	 // Gp.Run();
      }

      @When("user see error message in alert window")
      public void user_see_error_message_in_alert_window() {
    	 // Gp.alertpopup();
      }

      @When("user click the ok button alert window")
      public void user_click_the_ok_button_alert_window() {
         
      }

      @Then("user clicks practice Questions link")
      public void user_clicks_practice_questions_link() {
         Gp.prque();
      }

      @Then("user should be redirected to practice Questions page")
      public void user_should_be_redirected_to_practice_questions_page() {
    	  driver.quit();
          
      }


}    

