package runner;

//import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.ConfigReader;

//@RunWith(Cucumber.class) //junitExetution

@CucumberOptions(
features="src/test/resources/features",//location of feature files
glue= {"step","Hooks"},//location of step definition file
//tags="@data",
plugin= {"pretty","html:target/HtmlReports",//reporting purpose
"json:target/JSONreports/report.json",
 "junit:target/JUnitReports/report.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class testrunner extends AbstractTestNGCucumberTests{
@Override
@DataProvider(parallel=false)
public Object[][] scenarios(){
	return super.scenarios();
}
@BeforeTest
@Parameters({"browser"})
public void beforeTest(String browser) throws Throwable{
	ConfigReader.setBrowserType(browser);
	System.out.println(browser);
}

}
