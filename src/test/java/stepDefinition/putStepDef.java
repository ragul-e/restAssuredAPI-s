package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import restAssure.PutRequest;
import restAssure.getPost;

public class putStepDef {

	
	PutRequest putreq;
	
	
	@Given("get Api Getrequest")
	public void get_Api_PUTrequest() {
	   putreq = new PutRequest();
	   putreq.post();
	  
	}
	
	@When("Update data")
	public void Update_data() {
		putreq.validate();
	
	}
	


}
