package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class) //junitExetution

@CucumberOptions(
features="src/test/resources/features/DsAlgo_Signin.feature",//location of feature files
glue= {"step","Hooks"},//location of step definition file
plugin= {"pretty","html:target/HtmlReports",//reporting purpose
"json:target/JSONreports/report.json",
 "junit:target/JUnitReports/report.xml"}
)
public class testrunner {

}
