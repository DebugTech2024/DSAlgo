package Testrunner;
import org.junit.runner.RunWith;


//import fileReader.Configproperties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Graph.feature",
glue={"StepDefinition","Hooks"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HTMLReports"}
)


public class Testgraph {

	

}
