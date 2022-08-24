package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features/putReq.feature",
		glue= {"stepDefinition"},
	    tags= "@Smoke",
	    plugin= {"pretty",
	    		"html:target/cucumber-reports/cucumber.html",
	    		"json:target/cucumber-reports/cucumber.json"}
		)
public class testPutReq extends AbstractTestNGCucumberTests {

}

