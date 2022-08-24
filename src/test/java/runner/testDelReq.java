package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class testDelReq {

@CucumberOptions(
		features = "src/test/java/features/deleteRequest.feature",
		glue= {"stepDefinition"},
	    tags= "@Smoke",
	    plugin= {"pretty",
	    		"html:target/cucumber-reports/cucumber.html",
	    		"json:target/cucumber-reports/cucumber.json"}
		)
public class testRunner extends AbstractTestNGCucumberTests {

}

}
