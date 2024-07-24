
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
	@SuppressWarnings("unused")
	//private Graph_pom Graph=new Graph_pom(DriverFactory.getDriver());
		//CommonPage graphpage=new CommonPage(DriverFactory.getDriver());
		
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
	      //graphpage.dsHomepage();
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
			//graphpage.dsSigninpage();
			//graphpage.dslogin();
	}

	 @Then("user should be logged in")
	 public void user_should_be_logged_in() throws InterruptedException {
		 Gp=new Graph_pom (driver);
			Gp.logbtn();
			//graphpage.dsloginbutton();
			//graphpage.dslogin();
	 }
	 @When("user is an graph home page")
	 public void user_is_an_graph_home_page() {
		 logger.info("user is an graph page");
	     
	 }
     @Then("user clicks get strated button")
	 public void user_clicks_get_strated_button() throws InterruptedException {
		 Gp=new Graph_pom (driver);
	    Gp.graphbtn();
	 }

	 @When("user clicks Graph link")
	 public void user_clicks_graph_link() throws InterruptedException {
	    //Gp.graph();
	    Gp.graphbtn();
	 }

	 @Then("user clicks Try Here button")
	 public void user_clicks_try_here_button() {
	    Gp.trybtn();
	     }
	 @When("user enters code in  tryeditor from excel sheet to {string} and {int}")
	 public void user_enters_code_in_tryeditor_from_excel_sheet_to_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	    // Gp.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet2");
		String validcode = testdata.get(0).get("pythoncode");
		System.out.println(testdata.get(0).toString());
		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
		
		if (sheetname != null )
			Gp.editorbox (validcode);
		 
}
	 @Then("user click run output is printed")
	 public void user_click_run_output_is_printed() {
		 Gp.Run();
			LoggerLoad.info("User should be able to see console Message");
			String finalmsg=Gp.conmsg();
			System.out.println("finalmsg");
			LoggerLoad.info(finalmsg);
	 }
	 @When("users writes the code for invalid in tryeditor from {string} and {int}")
	 public void users_writes_the_code_for_invalid_in_tryeditor_from_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	         Gp.dstryeditor();
			ExcelReader1 reader = new ExcelReader1();	
			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet2");
			String Invalidcode = testdata.get(1).get("pythoncode");
			System.out.println(testdata.get(1).toString());
			LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
			if (sheetname != null )
				Gp.editorbox (Invalidcode);
	}
	 @Then("click run button")
	 public void click_run_button() {
		 Gp.Run();
	 }
		
      @When("user get error message in the alert window") 
		public void user_get_error_message_in_the_alert_window() {
    	  Gp.alertpopup();
    }

      @When("click ok button")
 	 public void click_ok_button() {
    	  logger.info("Error message");
      }	 
    
      @Given("user is on the Graph page and see Graph Representations")
      public void user_is_on_the_graph_page_and_see_graph_representations() {
    	  Gp.gpage();
    	  logger.info("user is an graph reperesentaion page");
      }

      @When("user clicks Graph Representations link")
      public void user_clicks_graph_representations_link() {
    	  Gp.grrep();
      }

      @Then("user Try Here button")
      public void user_try_here_button() throws InterruptedException {
         Gp.trbtn();
         Thread.sleep(2000);
      }
      @When("user enter phythoncode  in  tryeditor from excel sheet to {string} and {int}")
      public void user_enter_phythoncode_in_tryeditor_from_excel_sheet_to_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
        //  Gp.dstryeditor();
    	 ExcelReader1 reader = new ExcelReader1();	
  		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet8");
  		String validcode = testdata.get(0).get("pythoncode");
  		System.out.println(testdata.get(0).toString());
  		LoggerLoad.info("User Enter valid Pythoncode is \" " + validcode );
  		
  		if (sheetname != null )
  			Gp.editorbox2(validcode);
  		  }
      @Then("user click run and output is printed in the console")
      public void user_click_run_and_output_is_printed_in_the_console() {
    	  Gp.Run();
			LoggerLoad.info("User should be able to see console Message");
			String finalmsg=Gp.conmsg();
			System.out.println("finalmsg");
			LoggerLoad.info(finalmsg);
      }
      @When("user enter the python editor and write invalid python code from excel sheet {string} and {int}")
      public void user_enter_the_python_editor_and_write_invalid_python_code_from_excel_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
    	 Gp.dstryeditor();
		ExcelReader1 reader = new ExcelReader1();	
			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Exceldata/login.xlsx","Sheet8");
			String Invalidcode = testdata.get(1).get("pythoncode");
			System.out.println(testdata.get(1).toString());
			LoggerLoad.info("User Enter valid Pythoncode is \" " + Invalidcode );
			if (sheetname != null )
				Gp.editorbox3(Invalidcode);
			  Thread.sleep(2000);
				
      }

      @When("click the run button")
      public void click_the_run_button() {
    	 Gp.Run();
      }

      @When("user see error message in alert window")
      public void user_see_error_message_in_alert_window() {
    	 Gp.alertpopup();
      }

      @When("user click the ok button alert window")
      public void user_click_the_ok_button_alert_window() {
    	  logger.info("Error message");
      }

      @Then("user clicks practice Questions link")
      public void user_clicks_practice_questions_link() {
         Gp.prques();
      }

      @Then("user should be redirected to practice Questions page")
      public void user_should_be_redirected_to_practice_questions_page() {
    	  driver.quit();
          
      }


}    

